package Main01;

public class Calculate1 {
    public static void main(String[] args) {
        int a = 4;
        int b = 5;
        double c = 11.12;
        double d = 21.34;
        Calculate obj = new Calculate();
        System.out.println(obj.add(a, b));
        System.out.println(obj.add(c, d));
    }
}
