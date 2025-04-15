import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String name = "";
        String phone = "";
        Scanner input = new Scanner(System.in);
        System.out.print("당신의 이름을 입력하세요. ");
        name = input.nextLine();
        System.out.print("연락처를 입력하세요. ");
        phone = input.next();

        String[][] nBook = new String[3][7];
        nBook[0][0] = "ISBN1234";
        nBook[0][1] = "쉽게 배우는 JSP 웹 프로그래밍";
        nBook[0][2] = "27000";
        nBook[0][3] = "송미영";
        nBook[0][4] = "단계별로 쇼핑몰을 구현하며 배우는 JSP 웹 프로그래밍";
        nBook[0][5] = "IT 전문서";
        nBook[0][6] = "2018/10/08";
        nBook[1][0] = "ISBN1235";
        nBook[1][1] = "안드로이드 프로그래밍";
        nBook[1][2] = "33000";
        nBook[1][3] = "우재남";
        nBook[1][4] = "실습 단계별 명쾌한 멘토링!";
        nBook[1][5] = "IT 전문서";
        nBook[1][6] = "2022/01/22";
        nBook[2][0] = "ISBN1236";
        nBook[2][1] = "스크래치";
        nBook[2][2] = "22000";
        nBook[2][3] = "고광일";
        nBook[2][4] = "컴퓨터 사고력을 키우는 블록 코딩";
        nBook[2][5] = "컴퓨터입문";
        nBook[2][6] = "2019/06/10";

        System.out.println("*".repeat(50));

        System.out.println("\t\t\tWelcome to Shopping Mall");
        System.out.println("\t\t\tWelcome to Book Market!");

        System.out.println("*".repeat(50));

        int n = 0;
        do {
            System.out.println("1." + "고객 정보 확인하기\t\t" + "4." + "장바구니에 항목 추가하기");
            System.out.println("2." + "장바구니에 상품 목록 보기\t" + "5." + "장바구니의 항목 수량 줄이기");
            System.out.println("3." + "장바구니 비우기\t\t\t" + "6." + "장바구니 항목 삭제하기");
            System.out.println("7." + "영수증 표시하기\t\t\t" + "8." + "종료");

            System.out.println("*".repeat(50));

            System.out.println("메뉴 번호를 선택해주세요");
            n = input.nextInt();
            switch (n) {
                case 1:
                    menuGuesInfo(name, phone);
                    break;
                case 2:
                    menuCartList();
                    break;
                case 3:
                    menuCartClear();
                    break;
                case 4:
                    menuCartAddItem(nBook);
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
                    menuExit();
                    break;
            }
            System.out.println("*".repeat(50));
        } while (n != 8);
    }

    // main 아래에 둔 메서드들입니다
    public static void menuGuesInfo(String name, String phone) {
        System.out.println("현재 고객 정보\n" + "이름:" + name + "\t연락처:" + phone);
    }

    public static void menuCartList() {
        System.out.println("장바구니에 상품 목록 보기");
    }

    public static void menuCartClear() {
        System.out.println("장바구니 비우기");
    }

    public static void menuCartAddItem(String[][] nBook) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print(nBook[i][j] + " | ");
            }
            System.out.println();
        }
        boolean find = false;
        System.out.println("장바구니에 추가 할 도서의 ID를 입력하세요.");
        String id = input.nextLine();
        for (int i = 0; i < 3; i++) {
            if (nBook[i][0].equals(id)) {
                find = true;
                System.out.println("장바구니에 추가하시겠습니까?\n" + "Y | N");
                String yn = input.nextLine();
                if (yn.equalsIgnoreCase("Y")) {
                    System.out.println(id + "\n도서가 장바구니에 추가 되었습니다.");
                } else {
                    System.out.println("장바구니에 추가하지 않았습니다.");
                }
            }
        }
        if (!find) {
            System.out.println("입력하신 ID가 없습니다.");
        }
    }

    public static void menuCartRemoveItemCount() {
        System.out.println("장바구니의 항목 수량 줄이기");
    }

    public static void menuCartRemoveItem() {
        System.out.println("장바구니 항목 삭제하기");
    }

    public static void menuCartBill() {
        System.out.println("장바구니 표시하기");
    }

    public static void menuExit() {
        System.out.println("종료");
    }
}
