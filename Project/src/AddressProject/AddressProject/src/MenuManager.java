package AddressProject.AddressProject.src;

import java.util.Scanner;

public class MenuManager {
    public final static int LOGIN = 1;
    public final static int EXIT = 2;
    public final static int ADDRESS_SEARCH = 1;
    public final static int ADDRESS_SEARCH_ALL = 2;
    public final static int USER_INFO_UPDATE = 3;
    public final static int LOGOUT = 4;

    public static void initMenu(){
        System.out.println("< 주소록관리 >");
        System.out.println("1. 로그인");
        System.out.println("2. 종료");
    }

    public static void addressMenu(){
        System.out.println("<< 주소록 관리 >>");
        System.out.println("1. 주소록 검색");
        System.out.println("2. 전체 주소록 검색");
        System.out.println("3. 내정보 변경");
        System.out.println("4. 로그아웃");
    }

    public static int selectInitMenu(){
        Scanner input = new Scanner(System.in);
        int select;
        while(true){
            select = input.nextInt();
            input.nextLine();
            if(select < LOGIN || select > EXIT){
                System.out.println("잘못입력했습니다.");
                continue;
            }
            break;
        }
        return select;
    }

    public static int selectAddressMenu(){
        Scanner input = new Scanner(System.in);
        int select;
        while(true){
            select = input.nextInt();
            input.nextLine();
            if(select < ADDRESS_SEARCH || select > LOGOUT){
                System.out.println("잘못입력했습니다.");
                continue;
            }
            break;
        }
        return select;
    }


}
