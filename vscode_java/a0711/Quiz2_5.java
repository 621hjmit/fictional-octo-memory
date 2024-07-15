package a0711;

import java.util.Scanner;

public class Quiz2_5 {
    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 4, 5 };
        Scanner scan = new Scanner(System.in);
        boolean run = true;
        int specialNumber = 0;

        System.out.print("1~5 사이의 숫자를 입력하시오. : ");
        specialNumber = scan.nextInt();
        // while (run) {
        // System.out.print("1~5 사이의 숫자를 입력하시오. : ");
        // specialNumber = scan.nextInt();
        // if ((specialNumber > 0) && (specialNumber < 6)) {
        // run = false;
        // } else {
        // run = true;
        // }
        // }
        // 배열 요소 찾기 특정 값의 인덱스를 찾는 프로그램을 작성하세요. 값이 배열에 없으면 -1을 출력합니다.

        int resultIndex = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == specialNumber) {
                resultIndex = i;
                break;
            } else {
                resultIndex = -1;
            }
        }
        System.out.println("특정값의 인덱스: " + resultIndex);
    }

}
