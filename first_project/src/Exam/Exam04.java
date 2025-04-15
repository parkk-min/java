package Exam;

import java.util.Scanner;

public class Exam04 {
    public static void main(String[] args) {
        String[] myArr = new String[4];

        Scanner s = new Scanner(System.in);

        System.out.println("4개의 문자열을 입력하세요.");

        for (int i = 0; i < 4; i++) {
            myArr[i] = s.nextLine();
        }
        for (int i = 0; i < 4; i++)
            System.out.print(myArr[i]);
    }
}



