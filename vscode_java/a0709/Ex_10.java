package a0709;

import java.util.Scanner;

public class Ex_10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("영문자 를 입력하세요");
        String str = scan.nextLine();
        char c = str.charAt(1);
        int num = c;
        System.out.println(num);

    }
}
