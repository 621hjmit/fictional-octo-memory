package vscode_java.a0709;

import java.util.Scanner;

public class Ex10 {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
System.out.print("문자를 입력해 주세요.");
String str = scan.nextLine();
char c = str.charAt(0);
int num = (int) c;
System.out.println(num);
}
}
