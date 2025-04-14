import java.util.Scanner;

public class Exam01 {
    public static void main(String[] args) {
        int max, min;
        Scanner input = new Scanner(System.in);
        System.out.println("숫자 10개를 입력하세요.");
        int num = input.nextInt();
        max = num;
        min = num;

        for (int i = 1; i < 10; i++) {
            num = input.nextInt();
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        System.out.println("최대값:" + max + "\n최소값:" + min);
    }
}

/**
 * 10번 값을 넣고 출력하는 반복문을 만든다.
 * 10개의 숫자를 출력하면 반복문을 종료한다.
 * 조건문을 통해서 10개의 숫자 중 가장 작은 숫자와 가장 큰 숫자를 출력한다.
 */