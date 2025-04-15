package Exam;

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

        /**   Scanner input = new Scanner(System.in);
         System.out.println("숫자 10개를 입력하세요");
         int[] numbers = new int[10];
         for (int i = 0; i < 10; i++) {
         numbers[i] = input.nextInt();
         }
         int max = numbers[0];
         int min = numbers[0];

         for (int i = 1; i < 10; i++) {
         if (numbers[i] > max) {
         max = numbers[i];
         }
         if (numbers[i] < min) {
         min = numbers[i];
         }

         }

         System.out.println("최대값:" + max + "\n최소값:" + min);
         */

    }
}

