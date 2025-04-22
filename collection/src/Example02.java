import java.util.ArrayList;
import java.util.Comparator;

public class Example02 {

    public static void main(String[] args) {

        ArrayList<Integer> num = new ArrayList<>();

        for (int i = 10; i >= 1; i--) {
            num.add(i);
        }

        System.out.println(num);

        System.out.print("정렬 전: ");
        for (int i = 0; i < num.size(); i++) {
            System.out.print(num.get(i) + " ");
        }

        num.sort(Comparator.naturalOrder());
        // 자연 순서(오름차순)를 정렬하는 Comparator 객체를 반환
        //Comparator.reverseOrder()를 사용했다면 내림차순 정렬([10, 9, ..., 1])이 됨

        System.out.println();
        System.out.print("정렬 후: ");
        for (int i = 0; i < num.size(); i++) {
            System.out.print(num.get(i) + " ");
        }
    }
}