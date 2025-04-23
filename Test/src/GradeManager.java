import java.util.ArrayList;
import java.util.Scanner;

public class GradeManager {

    private final ArrayList<Student> students = new ArrayList<>();

    public GradeManager() {
        students.add(new Student("messi", "메시"));
        students.add(new Student("ronaldo", "호날두"));
        students.add(new Student("park", "박지성"));
        students.add(new Student("son", "손흥민"));
        students.add(new Student("cha", "차두리"));
    }

    public void run() {
        Scanner input = new Scanner(System.in);
        boolean endFlag = false;
        while (true) {
            System.out.println("<<성적처리>>");
            System.out.println("1.관리자 로그인");
            System.out.println("2.종료");

            int select = input.nextInt();
            switch (select) {
                case 1:
                    if (adminLogin()) {
                        gradeInput();
                    }
                    break;
                case 2:
                    System.out.println("프로그램을 종료합니다.");
                    endFlag = true;
                    break;
                default:
                    System.out.println("잘못 입력하였습니다.");
                    break;
            }

        }
    }

    public void gradeInput() {
        System.out.println("<<성적처리>>");
        System.out.println("1.성적 입력");
        System.out.println("2.성적 검색");
        System.out.println("3.전체 성적 출력");
        System.out.println("4.로그아웃");
    }

    public boolean adminLogin() {
        Scanner input = new Scanner(System.in);

        Admin admin = new Admin();

        System.out.println("<<관리자의 정보를 입력하세요>>");
        System.out.print("이름: ");
        String name = input.nextLine();
        System.out.print("전화번호: ");
        String phone = input.nextLine();

        System.out.print("관리자 ID: ");
        String inputId = input.nextLine();
        System.out.print("관리자 PW: ");
        String inputPw = input.nextLine();

        if (admin.login(inputId, inputPw)) {
            System.out.println(inputId + "관리자님 반갑습니다.");
            return true;
        } else {
            System.out.println("관리자 계정이 틀렸습니다.");
            return false;
        }

    }


}
