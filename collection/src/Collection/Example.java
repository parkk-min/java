package Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Example {
    public static void main(String[] args) {

        ArrayList<String> cats = new ArrayList<>();

        cats.add("페르시안");
        cats.add("샴");
        cats.add("러시안블루");


        for (String c : cats) {
            System.out.println(c);
        }

        Iterator<String> iter = cats.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }

    }
}