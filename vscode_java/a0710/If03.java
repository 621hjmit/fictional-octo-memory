package a0710;

import java.util.Scanner;

public class If03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("첫 번째 수를 입력하세요 : ");
        int num1 = sc.nextInt();
        System.out.print("두 번째 수를 입력하세요 : ");
        int num2 = sc.nextInt();

       if(num1 > num2){
         System.out.println("큰수 는" + num1 + " 입니다." );
       }else{
         System.out.println("큰수 는" + num2 + " 입니다." );
       }


    }
}
