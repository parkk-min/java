package Main01;

public class SubKitten extends SuperCat {
    String name;

    void printInfo() {
        System.out.println("아기 고양이입니다.");
    }

    void printDetail() {
        super.printInfo();
        printInfo();
        super.name = "SuperCat";
        name = "SUbKitten";

    }
}
