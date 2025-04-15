package classpackage;

public class Example01 {
    public static void main(String[] args) {
        Cat catObj = new Cat();
        catObj.breed = "페르시안 고양이";
        catObj.color = "흰색";

        System.out.println("품종: " + catObj.breed);
        System.out.println("색상: " + catObj.color);
    }
}
