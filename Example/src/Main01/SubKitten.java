package Main01;

public class SubKitten extends SuperCat {
    String age = "2살";

    void printInfo() {
        System.out.println("아기 고양이입니다.");
    }

    void printDetail() {
        super.printInfo();
        System.out.println("품종: " + super.breed);
        System.out.println("나이: " + super.age);
        printInfo();
        System.out.println("품종: " + breed);
        System.out.println("나이: " + age);
    }
}
