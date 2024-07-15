package a0710;

import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("정수를 입력해주세요. : ");
        int num = scan.nextInt();
        System.out.print("정수를 입력해주세요. : ");
        int num2 = scan.nextInt();

        System.out.println("if문");

        if (num > num2) {
            System.out.println("큰 수는 " + num + " 입니다.");
        } else {
            System.out.println("큰 수는 " + num2 + " 입니다.");
        }
        System.out.println();
        System.out.println("3항 연산자");
        int b = (num > num2) ? num : num2;
        System.out.println("큰 수는 " + b + " 입니다.");
    }
}
