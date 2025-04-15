package classpackage;

public class Example03 {
    public static void main(String[] args) {
        Example02.myMethod1();
        //Example02.myMethod2(); 인스턴스 메서드이다.(static 없으므로) 호출이 안됨

        Example02 myObj = new Example02();
        myObj.myMethod2();
    }
}
