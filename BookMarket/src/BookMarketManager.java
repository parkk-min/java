import java.util.ArrayList;
import java.util.Scanner;

public class BookMarketManager {
    private ArrayList<Book> mBookList = new ArrayList<>(3);
    private Cart mCart = new Cart();
    private Person mCurrentUser;

    public BookMarketManager() {
        mBookList.add(new Book("ISBN1234", "쉽게 배우는 JSP 웹프로그래밍", 27000,
                "송미영", "단계별로 구현하여 배우는 JSP 프로그래밍", "IT전문서",
                "2018/10/08"));
        mBookList.add(new Book("ISBN1235", "안드로이드 프로그래밍", 33000, "우재남",
                "실습단계별 명확한 멘토링!", "IT전문서", "2022/01/22"));

        mBookList.add(new Book("ISBN1236", "스크래치", 22000, "고광일",
                "컴퓨팅 사고력을 키우는 블록 코딩", "컴퓨터 입문", "2019/06/10"));
    }

    public void run() {
        Scanner input = new Scanner(System.in);
        System.out.print("당신의 이름을 입력하세요: ");
        String name = input.nextLine();
        System.out.print("연락처를 입력하세요: ");
        String phone = input.nextLine();

        User user = new User(name, phone);
        this.mCurrentUser = user;

        while (true) {
            boolean endflag = false;
            menuIntroduction();
            System.out.print("메뉴 번호를 선택하세요: ");
            int select = input.nextInt();
            switch (select) {
                case 1:
                    menuGuestInfo(user);
                    break;
                case 2:
                    menuCartItemList();
                    break;
                case 3:
                    menuCartClear();
                    break;
                case 4:
                    menuCartAddItem();
                    break;
                case 5:
                    menuCartRemoveItemCount();
                    break;
                case 6:
                    menuCartRemoveItem();
                    break;
                case 7:
                    menuCartBill();
                    break;
                case 8:
                    endflag = true;
                    System.out.println("종료");
                    break;
                case 9:
                    menuAdminLogin();
                    break;
            }

            if (endflag) {
                break;
            }
        }
    }

    public void menuIntroduction() {
        String greeting = "Welcome to Shopping Mall";
        String tagline = "Welcome to Book Market!";

        System.out.println("*".repeat(50));
        System.out.println("\t" + greeting);
        System.out.println("\t" + tagline);
        System.out.println("*".repeat(50));
        System.out.println("1. 고객정보 확인하기 \t\t\t4. 바구니에 황목 추가하기");
        System.out.println("2. 장바구니 상품 목록 보기\t\t5. 장바구니의 항목 수량 줄이기");
        System.out.println("3. 장바구니 비우기\t\t\t\t6. 장바구니의 항목 삭제하기");
        System.out.println("7. 영수증 표시하기\t\t\t\t8. 종료");
        System.out.println("9. 관리자 로그인");

        System.out.println("*".repeat(50));
    }

    public void menuGuestInfo(Person user) {
        System.out.println("현재 고객 정보: ");
        System.out.println("이름: " + user.getName() +
                " 전화번호: " + user.getPhone());
    }

    public void menuCartItemList() {
        this.mCart.printCart();
    }

    public void menuCartClear() {
        System.out.println("장바구니 비우기");
        this.mCart.clearCart();
    }

    public void bookList() {
        for (Book book : this.mBookList) {
            System.out.print("도서 ID :");
            System.out.println(book.getItemId());
            System.out.print("도서 이름: ");
            System.out.println(book.getName());
            System.out.print("도서 가격: ");
            System.out.println(book.getPrice());
            System.out.print("저자 : ");
            System.out.println(book.getAuthor());
            System.out.print("도서 설명 : ");
            System.out.println(book.getDescription());
            System.out.print("분류 : ");
            System.out.println(book.getCategory());
            System.out.print("출판일 : ");
            System.out.println(book.getPublishDate());
            System.out.println("*".repeat(50));
        }
    }

    public void menuCartAddItem() {
        System.out.println("장바구니 항목 추가하기");

        bookList();
        Scanner input = new Scanner(System.in);

        while (true) {
            boolean exit = false;
            System.out.print("장바구니에 추가할 도서의 ID를 입력하세요: ");
            String bookid = input.nextLine();

            Book searchBook = null;
            for (Book book : this.mBookList) {
                if (bookid.equals(book.getItemId())) {
                    searchBook = book;
                    break;
                }
            }


            if (searchBook != null) {
                System.out.println("장바구니에 추가하겠습니까? Y|N");
                String yn = input.nextLine();

                if (yn.toUpperCase().equals("Y")) {
                    if (this.mCart.isCartInItem(bookid)) {
                        this.mCart.inCreaseItemCount(bookid);
                    } else {
                        this.mCart.appendItem(searchBook);
                    }
                    System.out.println(searchBook.getItemId() + "이(가) 장바구니에 추가되었습니다.");
                }
                exit = true;
            } else {
                System.out.println("도서가 존재하지 않습니다.");
            }

            if (exit) {
                break;
            }

        }
    }

    public void menuCartRemoveItemCount() {
        System.out.println("장바구니에 항목 수량 줄이기");
        while (true) {
            this.mCart.printCart();
            System.out.println("수량을 줄이실 도서 ID를 입력하세요: ");
            Scanner input = new Scanner(System.in);
            String bookId = input.nextLine();
            if (!this.mCart.isCartInItem(bookId)) {
                System.out.println("장바구니에 존해하는 도서가 아닙니다.");
                continue;
            }
            System.out.println(bookId + "의 수량을 줄이시겠습니까? Y|N");
            String yn = input.nextLine();
            if (yn.toUpperCase().equals("Y")) {
                Item book = this.mCart.deCreaseItemCount(bookId);
                System.out.println(book.getItemId() + " 한 권이 장바구니에서 삭제되었습니다. ");
            }
            break;
        }
    }

    public void menuCartRemoveItem() {
        System.out.println("장바구니의 항목 삭제하기");
        this.mCart.printCart();
        System.out.println("삭제할 항목의 ISBN을 입력하세요 : ");
        Scanner input = new Scanner(System.in);
        String bookId = input.nextLine();
        if (this.mCart.isCartInItem(bookId)) {
            Item book = this.mCart.removeCartItem(bookId);
            System.out.println(book.getItemId() + "가 장바구니에서 삭제되었습니다.");
        } else {
            System.out.println("장바구니에 없는 책입니다.");
        }
    }

    public void menuCartBill() {
        System.out.println("영수증 표시하기");
    }

    public void menuAdminLogin() {
        Admin login = new Admin(this.mCurrentUser.getName(), this.mCurrentUser.getPhone());
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("관리자 정보를 입력하세요.");
            System.out.print("ID: ");
            String id = input.nextLine();
            System.out.print("PW: ");
            String pw = input.nextLine();

            if (login.getId().equals(id) && login.getPw().equals(pw)) {
                System.out.println("로그인 성공");
                this.mCurrentUser = login;
                System.out.println("이름: " + login.getName() + "\n연락처: " + login.getPhone());
                System.out.println("ID: " + login.getId() + "\nPW: " + login.getPw());
                break;
            } else {
                System.out.println("로그인에 실패하였습니다. 다시 입력해주세요.");
            }
        }
    }

}
