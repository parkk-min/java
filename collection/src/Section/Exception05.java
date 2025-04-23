package Section;

// throw s는 던질 수 있다고 선언
// throw 는 실제로 던지는 동작
// catch 는 그걸 받아서 처리하는 부분
// 사용자 정의 예외는 Exception 상속해서 만들고, 메시지를 넣으면 getMessage()로 꺼낼 수 있음

// 사용자 정의 예외 클래스 정의
class InvalidException extends Exception {

    // 생성자: 예외 메시지를 받을 수 있게 구성
    public InvalidException(String s) {

        // 부모 클래스(Exception)의 생성자에 메시지 전달
        super(s);
    }
}

// 실제 실행되는 클래스
public class Exception05 {

    // check 메서드: 매개변수 weight 검사
    // throws InvalidException: 이 메서드가 예외를 던질 수 있음을 표시
    void check(int weight) throws InvalidException {

        // 만약 weight 가 100보다 작으면 예외 발생시킴
        if (weight < 100) {
            // 예외를 직접 생성해서 던짐 (throw)
            throw new InvalidException("InvalidException 클래스 호출입니다.");
        }
    }

    public static void main(String[] args) {
        // Exception05 객체 생성
        Exception05 obj = new Exception05();

        // check(60)을 호출
        // 60 < 100이므로 예외 발생
        // 예외가 catch 로 넘어옴
        // ex.getMessage() → 예외 객체 안에 있는 메시지 출력
        try {
            // check 메서드 호출 (60 전달 → 조건 만족 → 예외 발생)
            obj.check(60);
        } catch (InvalidException ex) {
            System.out.println("예외 처리입니다.");
            System.out.println(ex.getMessage());
        }
    }


}
