package classpackage;

public class Student {

    // 인스턴스 변수: 학생의 아이디와 이름을 저장
    int id;
    String name;

    Student() {
        System.out.println("기본 생성자 Student() 호출"); //매개변수가 없다
    }

    Student(int pram1, String pram2) {
        System.out.println("일반 생성자 Student(...)호출");//매개변수가 있다
        id = pram1;
        name = pram2;
    }

    // 학생의 정보를 입력하는 메서드
    void insertRecord(int pram1, String pram2) {
        id = pram1;
        name = pram2;
    }

    // 학생의 정보를 출력하는 메서드
    void printInfo() {
        System.out.println("아이디 " + id);
        System.out.println("이름: " + name);
    }
}
