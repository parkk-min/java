import java.util.HashMap;

public class Example07 {
    public static void main(String[] args) {
        // HashMap 생성
        HashMap<String, Integer> map = new HashMap<>();

        //특정 키의 값 호출	map.get("apple")
        //모든 키-값 출력	entrySet() or keySet() + get()
        //모든 키만 출력	map.keySet()
        //모든 값만 출력	map.values()

        // 키-값 쌍 추가
        map.put("사과", 1000);
        map.put("바나나", 2000);
        map.put("오렌지", 1500);
        map.put(null, 0); // null 키 허용

        // 값 조회
        System.out.println("사과 가격: " + map.get("사과"));

        // 키 존재 여부 확인
        System.out.println("바나나 존재? " + map.containsKey("바나나"));

        // 값 삭제
        map.remove("오렌지");

        // 전체 출력
        System.out.println("HashMap: " + map);

        // 키와 값 순회
        for (String key : map.keySet()) {
            System.out.println(key + ": " + map.get(key));
        }
    }
}