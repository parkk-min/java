package Main;

import java.util.Scanner;

public class UserInfo {
    // 사용자 정보 배열 생성 및 초기화
    static User[] users =
            {(new User("aaa", "111", "박민규", "01011111111", "경기도")),
                    (new User("bbb", "222", "김철수", "01022222222", "서울")),
                    (new User("ccc", "333", "김영희", "01033333333", "부산"))};

    static User currentUser;  // 현재 로그인한 사용자를 저장할 변수

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("1.로그인");
            System.out.println("2.종료");
            System.out.println("*".repeat(30));
            int choice = input.nextInt();

            if (choice == 2) {
                System.out.println("시스템이 종료 되었습니다.");
                break;
            }

            if (choice == 1) {
                System.out.print("ID: ");
                String id = input.next();
                System.out.print("PW: ");
                String pw = input.next();

                boolean isLogin = false;  // 로그인 성공 여부

                // 사용자 정보와 비교하여 로그인 확인
                for (User u : users) { // int i = 0; i < users.length; i++ 같은 기능
                    if (id.equals(u.getId()) && pw.equals(u.getPw())) {
                        isLogin = true;
                        currentUser = u;  // 로그인한 사용자 저장
                        break;
                    }
                }

                if (isLogin) {
                    System.out.println("로그인성공");
                    System.out.println("*".repeat(30));

                    while (true) {
                        System.out.println("<<주소록관리>>");
                        System.out.println();
                        System.out.println("1.주소록 검색");
                        System.out.println("2.전체 주소록 검색");
                        System.out.println("3.내 정보 변경");
                        System.out.println("4.로그아웃");
                        int select = input.nextInt();

                        switch (select) {
                            case 1:
                                findUser(users);
                                break;
                            case 2:
                                showAll(users);
                                break;
                            case 3:
                                System.out.print("pw: ");
                                String newPw = input.next();
                                System.out.print("phone: ");
                                String newPhone = input.next();
                                System.out.print("address: ");
                                String newAddress = input.next();

                                editUser(newPw, newPhone, newAddress);
                                break;
                            case 4:
                                System.out.println("로그아웃 되었습니다.");
                                break;
                            default:
                                System.out.println("잘못된 선택입니다.");
                        }
                        if (select == 4) {
                            break;
                        }
                    }
                } else {
                    System.out.println("ID 또는 비밀번호가 잘못되었습니다.");
                }
            } else {
                System.out.println("잘못된 선택입니다.");
            }
        }
    }

    // 특정 사용자의 이름을 입력받아 주소록에서 검색하는 메서드
    public static void findUser(User[] users) {
        Scanner userName = new Scanner(System.in);
        System.out.println("검색할 유저의 이름을 입력하세요.");
        String name = userName.next();

        boolean find = false;  // 검색 성공 여부
        for (User u : users) { // int i = 0; i < users.length; i++ 같은 기능
            if (u.getName().equals(name)) {
                // 검색 결과 출력
                System.out.println("이름: " + u.getName());
                System.out.println("전화번호: " + u.getPhone());
                System.out.println("주소: " + u.getAddress());
                find = true;
                break;
            }
        }
        if (!find) {
            System.out.println("사용자의 이름을 찾을 수 없습니다.");
        }
    }

    // 전체 사용자들의 주소 정보를 출력하는 메서드
    public static void showAll(User[] users) {
        System.out.println("*".repeat(30));
        System.out.println("<<전체 주소록>>");

        for (int i = 0; i < users.length; i++) {
            // 각 사용자에 대한 정보 출력
            System.out.println(users[i].getName() + " 님의 전화번호: " + users[i].getPhone());
            System.out.println(users[i].getName() + " 님의 주소: " + users[i].getAddress());
            System.out.println("*".repeat(30));
        }
    }

    // 내 정보 변경 기능을 위한 메서드
    public static void editUser(String pw, String phone, String address) {
        System.out.println("<<내 정보 변경>>");
        currentUser.setPw(pw);
        currentUser.setPhone(phone);
        currentUser.setAddress(address);
        System.out.println(currentUser.getName() + "님의 정보가 변경 되었습니다.");
    }
}
