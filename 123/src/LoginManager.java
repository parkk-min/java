import java.util.ArrayList;
import java.util.Scanner;

public class LoginManager {
    Scanner input = new Scanner(System.in);
    ArrayList<User> users = new ArrayList<>();
    User currentUser = null;

    public void userLogin() {
        this.users.add(new User("park", "1111", "박민규", "미국 캘리포니아", "01011111111", " ", "silver", 2000));
        this.users.add(new User("kim", "2222", "김주언", "미국 뉴욕", "01022222222", " ", "vip", 2500));
        this.users.add(new User("jo", "3333", "조정태", "미국 시카고", "01033333333", " ", "gold", 3000));

        while (true) {
            System.out.println("ID를 입력하세요.");
            String id = input.nextLine();
            System.out.println("PW를 입력하세요.");
            String pw = input.nextLine();

            boolean endLogIn = false;
            for (User u : users) {
                if (u.getId().equals(id) && u.getPw().equals(pw)) {
                    System.out.println("반갑습니다. " + u.getName() + "님 " + "로그인에 성공하였습니다.");
                    currentUser = u;
                    endLogIn = true;
                    break;
                }
            }
            if (endLogIn) {
                break;
            } else {
                System.out.println("잘못 입력하였습니다. 다시 입력해주세요.");
            }
        }
    }

    public void selectMenu() {
        boolean endFlag = false;
        while (true) {
            System.out.println("입장하실 메뉴를 선택해주세요.");
            System.out.println("1.라이브러리");
            System.out.println("2.마켓");
            System.out.println("3.미니게임");
            System.out.println("4.로그아웃");
            System.out.println("5.사용자 정보 조회");

            int select = input.nextInt();
            input.nextLine();
            switch (select) {
                case 1:
                    libraryManager();
                    System.out.println("라이브러리");
                    break;
                case 2:
                    MarketManager();
                    System.out.println("마켓");
                    break;
                case 3:
                    miniGameManager();
                    System.out.println("미니게임");
                    break;
                case 4:
                    logout();
                    System.out.println("로그아웃");
                    break;
                case 5:
                    currentUserInfo();
            }
            if (!endFlag) {
                break;
            }
        }
    }

    public void libraryManager() {
    }

    public void MarketManager() {
    }

    public void miniGameManager() {
    }

    public void logout() {
        System.out.println("로그아웃 되었습니다.");
        currentUser = null;
        userLogin();
    }

    public void currentUserInfo() {
        System.out.println("내 정보");
        System.out.println("ID: " + currentUser.getId());
        System.out.println("이름: " + currentUser.getName());
        System.out.println("주소: " + currentUser.getAddress());
        System.out.println("전화번호: " + currentUser.getPhone());
        System.out.println("등급: " + currentUser.getGrade());
        System.out.println("구매내역: " + currentUser.getBuyList());
        System.out.println("포인트: " + currentUser.getPoint());
    }

}
