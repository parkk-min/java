package classpackage;

public class Dog01 {
    public static void main(String[] args) {

        Dog obj = new Dog();

        obj.breed = "포메라니안";
        obj.color = "갈색";

        System.out.println("강아지 품종: " + obj.breed);
        System.out.println("강아지 색상: " + obj.color);

        obj.bowwow();
        obj.run();
        //obj.sleep(); //private 이므로 실행안됨, private 는 같은 클래스 소속만 호출 가능

        obj.age = 10;
        //obj.name = "다운"; //private 이므로 실행안됨
        System.out.println("강아지 나이: " + obj.age);
        //System.out.println("강아지 이름: " + obj.name); //private 이므로 실행안됨




    }
}
