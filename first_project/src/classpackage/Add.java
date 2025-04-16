package classpackage;

public class Add {
    Add() {
        System.out.println("기본 생성자 Add()호출");
    }

    Add(int a, int b) {
        System.out.println("일반 생성자 Add(int a, int b) 호출");
        System.out.println(a + " + " + b + " = " + (a + b));
    }

    Add(double a, double b) {
        System.out.println("일반 생성자 Add(double a, double b) 호출");
        System.out.println(a + " + " + b + " = " + (a + b));
    }

    Add(int a, double b) {
        System.out.println("일반 생성자 Add(int a, double b) 호출");
        System.out.println(a + " + " + b + " = " + (a + b));
    }
}
