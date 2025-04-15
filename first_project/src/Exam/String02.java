package Exam;

public class String02 {
    public static void main(String[] args) {

        String s = " Java Programming ";
        String s1 = "Java";
        String s2 = " Programming";
        String s3 = s1.concat(s2);
        String s4 = s.trim();

        System.out.println(s3);
        System.out.println(s4);
        System.out.println(s3.equals(s4));
    }
}
