package Main;

import java.util.Scanner;

public class UserInfo {

    public static void main(String[] args) {

        User[] users = new User[3];

        users[0] = new User("aaa", 111, "박민규", "01011111111", "경기도");
        users[1] = new User("bbb", 222, "김철수", "01022222222", "서울");
        users[2] = new User("ccc", 333, "김영희", "01033333333", "부산");

        Scanner input = new Scanner(System.in);
        while (true) {
            boolean isLogin = false;
            System.out.println("1.로그인");
            System.out.println("2.종료");
            int choice = input.nextInt();

            if (choice == 1) {
                System.out.println("ID: ");
                String id = input.next();
                System.out.println("PW: ");
                int pw = input.nextInt();

                for (int i = 0; i < users.length; i++) {
                    if (id.equals(users[i].getId()) && pw == users[i].getPw()) {
                        isLogin = true;
                        System.out.println("로그인성공");
                    }
                }
            }
            if (isLogin) break;
        }

        System.out.println("<<주소록관리>>");
        System.out.print("메뉴 번호를 선택하세요: ");
        int select = input.nextInt();
        while (true) {
            switch (select) {
                case1:
                addressSerch();
                break;

            }
        }

    }
}

public static void addressSerch() {

}

