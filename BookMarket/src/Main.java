import java.util.Scanner;

public class Main {
    public static void menuGuesInfo(String name, String phone) {
        System.out.println("현재 고객 정보\n" + "이름:" + name + "\t연락처:" + phone);
    }

    public static void menuCartList() {
        System.out.println("장바구니에 상품 목록 보기");
    }

    public static void menuCartClear() {
        System.out.println("장바구니 비우기");
    }

    public static void menuCartAddItem() {
        System.out.println("장바구니에 항목 추가하기");
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

    public static void main(String[] args) {
        String name = "";
        String phone = "";
        Scanner input = new Scanner(System.in);
        System.out.print("당신의 이름을 입력하세요.");
        name = input.nextLine();
        System.out.print("연락처를 입력하세요");
        phone = input.next();

        System.out.println("*".repeat(50));

        System.out.println("\t\t\tWelcome to Shopping Mall");
        System.out.println("\t\t\tWelcome to Book Market!");

        System.out.println("*".repeat(50));

        int n = 0;
        do {
            System.out.println("1." + "고객 정보 확인하기\t\t" + "4." + "장바구니에 항목 추가하기");
            System.out.println("2." + "장바구니에 상품 목록 보기\t" + "5." + "장바구니의 항목 수량 줄이기");
            System.out.println("3." + "장바구니 비우기\t\t\t" + "6." + "장바구니 항목 삭제하기");
            System.out.println("7." + "영수증 표시하기\t\t" + "8." + "종료");

            System.out.println("*".repeat(50));

            Scanner number = new Scanner(System.in);
            System.out.println("메뉴 번호를 선택해주세요");
            n = number.nextInt();
            switch (n) {
                case 1:
                    menuGuesInfo(name, phone);
                    break;
                case 2: {
                    menuCartList();
                    break;
                }
                case 3: {
                    menuCartClear();
                    break;
                }
                case 4: {
                    menuCartAddItem();
                    break;
                }
                case 5: {
                    menuCartRemoveItemCount();
                    break;
                }
                case 6: {
                    menuCartRemoveItem();
                    break;
                }
                case 7: {
                    menuCartBill();
                    break;
                }
                case 8:
                    menuExit();
                    break;
            }
            System.out.println("*".repeat(50));
        } while (n != 8);
    }
}