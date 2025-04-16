package classpackage;

public class Chain {

    Chain() {
        this(10);
        System.out.println("기본 생성자 Chain() 호출");
    }

    Chain(int a) {
        this(5, 6);
        System.out.println("일반 생성자 Chain(int a) 호출");
        System.out.println("a의 값: " + a);
    }

    Chain(int b, int c) {
        System.out.println("일반 생성자 Chain(int b, int c) 호출");
        System.out.println("b,c의 값: " + b + " + " + c);
    }
}


// this(...) → 다른 생성자에게 맡긴다
// 맡긴 생성자가 끝나야 현재 생성자의 본문 실행됨
// 그러니까 "호출은 계단식, 실행은 역계단식"
// this 본질은 생성자 간에 초기화 로직을 위임하려는 목적이다.
// 공통 로직이 많고, 생성자가 여러 개일 때 쓰면 유용하다.