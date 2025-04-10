import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("당신의 이름을 입력하세요.");
        String name = input.nextLine();
        System.out.print("연락처를 입력하세요");
        String phone = input.next();

        System.out.println("*".repeat(50));

        System.out.println("\t\t\tWelcome to Shopping Mall");
        System.out.println("\t\t\tWelcome to Book Market!");

        System.out.println("*".repeat(50));

        System.out.println("1." + "고객 정보 확인하기\t\t" + "4." + "바구니에 항목 추가하기");
        System.out.println("2." + "바구니에 상품 목록 보기\t" + "5." + "장바구니의 항목 수량 줄이기");
        System.out.println("3." + "장바구니 비우기\t\t\t" + "6." + "장바구니 항목 삭제하기");
        System.out.println("7." + "장바구니 표시하기\t\t" + "8." + "종료");

        System.out.println("*".repeat(50));

        Scanner number = new Scanner(System.in);
        System.out.println("메뉴 번호를 선택해주세요");
        int n = number.nextInt();
        System.out.println(n + "번을 선택했습니다");

        System.out.println("*".repeat(50));


    }
}