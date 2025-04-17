
import java.util.Scanner;

public class BookManager {
    private final Book[] mBook = new Book[3];
    private final Cart mCart = new Cart();

    // 생성자: 도서 목록을 초기화
    public BookManager() {
        mBook[0] = new Book("ISBN1234", "쉽게 배우는 JSP 웹프로그래밍", 27000, "송미영", "단계별로 쇼핑몰을 구현하며 배우는 JSP 웹프로그래밍 ", "IT 전문서", "2018/10/08");
        mBook[1] = new Book("ISBN1235", "안드로이드 프로그래밍", 33000, "우재남", "실습 단계별 명쾌한 멘토링!", "IT 전문서", "2022/01/22");
        mBook[2] = new Book("ISBN1236", "스크래치", 22000, "고광일", "컴퓨팅 사고력을 키우는 블록 코딩", "컴퓨터 입문", "2019/06/10");
    }

    // 프로그램의 메인 실행 루프
    public void run() {
        Scanner input = new Scanner(System.in);
        System.out.print("당신의 이름을 입력하세요 : ");
        String name = input.nextLine();
        System.out.print("연락처를 입력하세요 : ");
        String phone = input.nextLine();

        Person user = new Person(name, phone);

        // 메뉴 루프
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
                default:
                    System.out.println("잘못된 메뉴 번호입니다. 1~8 사이를 입력하세요.");
            }
            if (endflag) {
                break;
            }
        }
    }

    public void menuIntroduction() {
        String greeting = "Welcome to Shopping Mall";
        String tagline = "Welcome to Book Market!";

        System.out.println("*".repeat(30));
        System.out.println("\t" + greeting);
        System.out.println("\t" + tagline);
        System.out.println("*.".repeat(30));
        System.out.println("1. 고객정보 확인하기 \t\t\t4. 바구니에 황목 추가하기");
        System.out.println("2. 장바구니 상품 목록 보기\t\t5. 장바구니의 항목 수량 줄이기");
        System.out.println("3. 장바구니 비우기\t\t\t\t6. 장바구니의 항목 삭제하기");
        System.out.println("7. 영수증 표시하기\t\t\t\t8. 종료");
        System.out.println("*.".repeat(30));
    }

    public void menuGuestInfo(Person user) {
        System.out.println("<현재 고객 정보>");
        System.out.println("이름: " + user.getUserName());
        System.out.println("전화번호: " + user.getPhone());
    }

    //
    public void menuCartItemList() {
        System.out.println("<장바구니 상품 목록 보기>");

        System.out.println("도서Id" + "\t\t\t수량" + "\t\t\t총가격");

    }

    //
    public void menuCartClear() {
        System.out.println("장바구니 비우기");
    }

    //
    public void menuCartAddItem() {
        System.out.println("장바구니 항목 추가하기 ");

        System.out.println("<도서 목록>");
        for (int i = 0; i < mBook.length; i++) {
            System.out.print(mBook[i].toString());
            System.out.println();
        }

        while (true) {
            boolean exit = false;
            System.out.print("장바구니에 추가할 도서의 ID를 입력하세요 : ");
            Scanner input = new Scanner(System.in);
            String bookId = input.nextLine();
            int index = -1;

            // 사용자가 입력한 책의 ID가 Book[] 안에 있는지 확인
            for (int i = 0; i < mBook.length; i++) {

                if (bookId.equals(mBook[i].getID())) {
                    index = i;
                    break;
                }
            }

            // index 가 -1이 아니라면
            if (index != -1) {
                System.out.println("장바구니에 추가하겠습니까? Y|N");
                String yn = input.nextLine();

                if (yn.equalsIgnoreCase("Y")) {
                    if (!mCart.isCartInBook(bookId)) {
                        mCart.inCreaseBookCount(bookId);
                    } else {
                        mCart.appendBook(mBook[index]);
                    }
                    System.out.println(mBook[index].getBookName() + "이(가) 장바구니에 추가되었습니다.");
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

    //
    public static void menuCartRemoveItemCount() {
        System.out.println("장바구니에 항목 수량 줄이기");
    }

    //
    public static void menuCartRemoveItem() {
        System.out.println("장바구니의 항목 삭제하기");
    }

    public static void menuCartBill() {
        System.out.println("영수증 표시하기");
    }

}
