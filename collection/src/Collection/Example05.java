package Collection;

import java.util.TreeSet;

public class Example05 {

    public static void main(String[] args) {

        TreeSet<String> soccer = new TreeSet<>();

        soccer.add("호날두");
        soccer.add("메시");
        System.out.println(soccer);
        soccer.add("앙리");
        System.out.println(soccer);
        soccer.remove("호날두");
        System.out.println(soccer);
        System.out.println(soccer.size());
        System.out.println(soccer.contains("앙리"));
        System.out.println(soccer.first());
        System.out.println(soccer.last());
    }
}
