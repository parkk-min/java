package Collection;

import java.util.HashSet;

public class Example04 {
    public static void main(String[] args) {
        // HashSet 생성
        HashSet<String> fruit = new HashSet<>();

        // 요소 추가
        fruit.add("사과");
        fruit.add("바나나");
        fruit.add("사과"); // 중복 요소, 추가 안 됨
        fruit.add(null);   // null 허용
        fruit.add("오렌지");

        // 전체 출력
        System.out.println("HashSet: " + fruit);

        // 요소 존재 여부 확인
        System.out.println("바나나 존재? " + fruit.contains("바나나"));

        // 요소 삭제
        fruit.remove("오렌지");

        // 크기 확인
        System.out.println("크기: " + fruit.size());

        // 순회
        for (String item : fruit) {
            System.out.println(item);
        }









    }
}