import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Example08 {

    public static void main(String[] args) {

        HashMap<Integer, String> cats = new HashMap<>();

        cats.put(1, "A");
        cats.put(2, "B");
        cats.put(3, "C");
        cats.put(4, "D");

        System.out.println(cats);

        // entrySet 활용
        for (Map.Entry<Integer, String> entry : cats.entrySet()) {
            System.out.println("(" + entry.getKey() + "," + entry.getValue() + ")");
        }

        Iterator<Map.Entry<Integer, String>> entries = cats.entrySet().iterator();
        while (entries.hasNext()) {
            Map.Entry<Integer, String> entry = entries.next();
            System.out.println("(" + entry.getKey() + "," + entry.getValue() + ")");
        }

        // keySet 활용
        for (Integer i : cats.keySet()) {
            System.out.println("(" + i + "," + cats.get(i) + ")");
        }

        Iterator<Integer> keys = cats.keySet().iterator();
        while (keys.hasNext()) { // 다음 요소값이 있는지 확인
            int key = keys.next(); // 키 얻어오기
            System.out.println("(" + key + "," + cats.get(key) + ")"); // 요소값 출력
        }


    }
}
