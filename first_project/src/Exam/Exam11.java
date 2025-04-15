package Exam;

import java.util.Scanner;

public class Exam11 {
    public static void main(String[] args) {
        int myArr[][] = new int[4][4];
        Scanner s = new Scanner(System.in);

        // 초기값 숫자 입력
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("숫자를 입력하세요. : ");
                myArr[i][j] = s.nextInt();
            }
        }

        /**
         *      0     1   2   3
         *  0   [1]  [2]  [3]  []
         *  1   [4]  [5]  [6]  []
         *  2   [7]  [8]  [9]  []
         *  3   []    []  []  []
         */
        /**
         * i j
         * 0,0 => 0,3 | 3,0
         * 0,1 => 0,3 | 3,1
         * 0,2 => 0,3 | 3,2
         *
         * 1,0 => 1,3 | 3,0
         * 1.1 => 1,3 | 3,1
         * 1,2 => 1,3 | 3,2
         *
         * 2,0 => 2,3 | 3,0
         * 2.1 => 2,3 | 3,1
         * 2,2 => 2,3 | 3,2
         *
         */
        // 행 과 열 합산
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                myArr[i][3] += myArr[i][j];
                myArr[3][j] += myArr[i][j];
                myArr[3][3] += myArr[i][j];
            }
            System.out.println();
        }

        // 출력
        for (int i = 0; i < myArr.length; i++) {
            for (int j = 0; j < myArr[i].length; j++) {
                if (j == 3) {
                    System.out.print("행의 합계");
                }
                System.out.print("[" + myArr[i][j] + "] \t");
            }
            System.out.println();
        }
    }
}


        /** int[][] arr = new int[4][4];
        int rows = arr.length;
        int columns = arr[0].length;

        Scanner input = new Scanner(System.in);
        for (int i = 0; i < rows - 1; i++) {
            for (int j = 0; j < columns - 1; j++) {
                arr[i][j] = input.nextInt();
            }
        }
        for (int i = 0; i < rows - 1; i++) {
            for (int j = 0; j < columns - 1; j++) {
                arr[i][columns - 1] += arr[i][j];
                arr[rows - 1][j] += arr[i][j];
                arr[rows - 1][columns - 1] += arr[i][j];
            }
        }
        System.out.print("행의 합계: ");
        for (int i = 0; i < rows - 1; i++) {
            System.out.print(i + "행 합계: " + arr[i][columns - 1] + " ");
        }
        System.out.println();

        System.out.print("열의 합계: ");
        for (int i = 0; i < columns - 1; i++) {
            System.out.print(i + "열 합계: " + arr[rows - 1][i] + " ");
        }
        System.out.println();
        System.out.println("전체 합계: " + arr[rows - 1][columns - 1]);

    }
}
*/
