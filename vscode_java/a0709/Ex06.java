package vscode_java.a0709;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        //printf println 은 이미 내장되어있지만 스캐너는 스캐너를 객체로 만들어서 변수에 저장해서 써야한다.
        Scanner scan = new Scanner(System.in); //import java.util.Scanner;요게 임포트 안되면 오른쪽 노란 전구를 눌러서 임포트 한다.
        System.out.print("문자 입력해");
        String a = scan.nextLine();
        System.out.println(a);
    }
}
