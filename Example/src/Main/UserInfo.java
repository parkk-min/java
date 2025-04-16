package Main;

import java.util.Scanner;

public class UserInfo {

    public static void main(String[] args) {
        User[] users = new User[3];
        users[0] = new User("aaa", "111", "박민규", "01011111111", "경기도");
        users[1] = new User("bbb", "222", "김철수", "01022222222", "서울");
        users[2] = new User("ccc", "333", "김영희", "01033333333", "부산");

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

                boolean isLogin = false;
                User currentUser = null;

                for (int i = 0; i < users.length; i++) {
                    if (id.equals(users[i].getId()) && pw.equals(users[i].getPw())) {
                        isLogin = true;
                        currentUser = users[i];
                        break;
                    }
                }

                if (isLogin) {
                    System.out.println("로그인성공");
                    System.out.println("*".repeat(30));

                    while (true) {
                        System.out.println("<<주소록관리>>");
                        System.out.println("1.주소록 검색");
                        System.out.println("2.전체 주소록 검색");
                        System.out.println("3.내 정보 변경");
                        System.out.println("4.로그아웃");
                        int select = input.nextInt();

                        switch (select) {
                            case 1:
                                addressSerch(users);
                                break;
                            case 2:
                                allAddress(users);
                                break;
                            case 3:
                                System.out.println();
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

    public static void addressSerch(User[] users) {
        Scanner serch = new Scanner(System.in);
        System.out.println("검색할 유저의 이름을 입력하세요.");
        String name = serch.next();

        boolean find = false;
        for (int i = 0; i < users.length; i++) {
            if (users[i].getName().equals(name)) {
                System.out.println("이름: " + users[i].getName());
                System.out.println("전화번호: " + users[i].getPhone());
                System.out.println("주소: " + users[i].getAddress());
                find = true;
                break;
            }
        }
        if (!find) {
            System.out.println("사용자의 이름을 찾을 수 없습니다.");
        }
    }

    public static void allAddress(User[] users) {
        System.out.println("*".repeat(30));
        System.out.println("<<전체 주소록>>");
        for (int i = 0; i < users.length; i++) {
            System.out.println(users[i].getId() + "님의 전화번호: " + users[i].getPhone());
            System.out.println(users[i].getId() + "님의 주소: " + users[i].getAddress());
            System.out.println("*".repeat(30));
        }
    }

    public static void updateUser(User[] users){

    }

}
