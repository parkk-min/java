import java.util.Scanner;

public class Exam13 {
    public static void main(String[] args) {
        int correct[] = new int[3];
        int answer[] = new int[3];
        Scanner input = new Scanner(System.in);
        int answerCount = 0;
        int count = 0;

        while (true) {
            boolean flag = false;
            int num = (int) (Math.random() * 9) + 1;
            for (int i = 0; i < count; i++) {
                if (correct[i] == num) {
                    flag = true;
                    break;
                }
            }
            if (flag) continue;
            correct[count++] = num;
            if (count == 3)  break;

        }
        System.out.print("정답 숫자: ");
        for (int i = 0; i < 3; i++) {
            System.out.print(correct[i] + " ");
        }
        System.out.println("\n");

        while (true) {
            int strike = 0;
            int ball = 0;
            int out = 0;

            answerCount++;
            System.out.println("숫자 3개를 입력하세요: ");
            for (int i = 0; i < 3; i++) {
                answer[i] = input.nextInt();
            }

            for (int i = 0; i < correct.length; i++) {
                for (int j = 0; j < answer.length; j++) {
                    if (correct[i] == answer[j]) {
                        if (i == j) {
                            strike++;
                        } else {
                            ball++;
                        }
                        break; // 중복 방지
                    }
                }
            }

            // strike, ball이 모두 0이면 out 3
            if (strike == 0 && ball == 0) {
                out = 3;
                System.out.println("Out!");
            } else {
                System.out.println("Strike: " + strike + "\tBall: " + ball);
            }

            if (strike == 3) {
                System.out.println("게임종료");
                break;
            }
        }

        System.out.println(answerCount + "번 만에 정답을 맞췄습니다.");

        /** int correct[] = new int[3];
         int answer[] = new int[3];
         Scanner input = new Scanner(System.in);
         int answerCount = 0;


         while (true) {
         int strike = 0;
         int ball = 0;
         int out = 0;
         boolean flag = false;

         for (int i = 0; i < correct.length; i++) {
         int randomNumber = (int) (Math.random() * 10);
         for (int j = 0; j < i; j++) {
         if (correct[j] == randomNumber) {
         flag = true;
         break;
         }
         }
         if (flag) {
         i--;
         flag = false;
         continue;
         }

         correct[i] = randomNumber;
         System.out.println(randomNumber);
         }

         for (int i = 0; i < answer.length; i++) {
         answer[i] = input.nextInt();
         }

         answerCount++;

         for (int i = 0; i < correct.length; i++) {
         for (int j = 0; j < answer.length; j++) {
         if (correct[i] == answer[j]) {
         if (i == j) {
         strike++;
         } else {
         ball++;
         }
         break; // 중복 방지
         }
         }
         }

         // strike, ball이 모두 0이면 out 3
         if (strike == 0 && ball == 0) {
         out = 3;
         System.out.println("Out!");
         } else {
         System.out.println("Strike: " + strike + "\tBall: " + ball);
         }

         if (strike == 3) {
         System.out.println("게임종료");
         break;
         }
         }

         System.out.println(answerCount + "번 만에 정답을 맞췄습니다.");
         */
    }
}

