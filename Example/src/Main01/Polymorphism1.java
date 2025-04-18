package Main01;

public class Polymorphism1 {
    public static void main(String[] args) {
        CalculateSquare myArea = new CalculateSquare();
        System.out.println("가로:10, 세로:5 사각형의 넓이는" + myArea.square(10, 5));
        System.out.println("가로:2.5, 세로:4.5 사각형의 넓이는" + myArea.square(2.5, 4.5));
    }
}