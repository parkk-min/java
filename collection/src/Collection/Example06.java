package Collection;

import java.util.Hashtable;

public class Example06 {
    public static void main(String[] args) {
        // Hashtable 생성
        Hashtable<String, Integer> table = new Hashtable<>();

        // 키-값 쌍 추가
        table.put("사과", 1000);
        table.put("바나나", 2000);
        table.put("오렌지", 1500);

        // 값 조회
        System.out.println("사과 가격: " + table.get("사과"));

        // 키 존재 여부 확인
        System.out.println("바나나 존재? " + table.containsKey("바나나"));

        // 값 삭제
        table.remove("오렌지");

        // 전체 출력
        System.out.println("Hashtable: " + table);
    }
}