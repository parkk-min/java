package Section;

public class Exception03 {
    public static void main(String[] args) {

        //결론: try 가 정상 실행("트루")이면
        //catch 는 실행 안 됨.
        //finally 는 항상 실행됨.

        int[] arr = {10, 20, 30};

        try {
            for (int i = 0; i <= 2; i++) {
                System.out.println("arr[" + i + "]:" + arr[i]);
            }
        } catch (Exception ex) {
            System.out.println("예외 처리입니다.");
            System.out.println(ex.getMessage());
        } finally {
            System.out.println("예외 발생 여부와 상관없이 finally 는 항상 실행됩니다.");
        }
    }
}
