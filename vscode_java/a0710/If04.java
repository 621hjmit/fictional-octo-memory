package a0710;

import java.util.Scanner;

public class If04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("첫 번째 수를 입력하세요 : ");
        int num1 = sc.nextInt();
        System.out.print("두 번째 수를 입력하세요 : ");
        int num2 = sc.nextInt();

        int max = (num1 > num2) ? num1 : num2;
        //            조건  ?  참 : 거짓 ; 
        System.out.println("큰 수는 " + max + "입니다.");
    }
}
