package vscode_java.a0709;

import java.util.Scanner;

public class Ex08 {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
System.out.print("년 입력해 주세요.");
String y = scan.nextLine();
System.out.print("월 입력해 주세요");
String m = scan.nextLine();
System.out.print("일 입력해 주세요");
String d = scan.nextLine();
System.out.println(y+"년 "+m+"월 "+d+"일 입니다.");
// --------선생님 코드
// Scanner scan = new Scanner(System.in);
System.out.print("년 입력해 주세요.");
int yy = scan.nextInt();
System.out.print("월 입력해 주세요");
int mm = scan.nextInt();
System.out.print("일 입력해 주세요");
int dd = scan.nextInt();
System.out.printf("%d.%02d.%02d\n",yy,mm,dd);
}
}
