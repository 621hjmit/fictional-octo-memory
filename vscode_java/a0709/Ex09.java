package vscode_java.a0709;

import java.util.Scanner;

public class Ex09 {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
System.out.print("10진수 를 8진수로");
int num = scan.nextInt();
System.out.printf("%o\n",num);
System.out.print("10진수 를 16진수로");
 num = scan.nextInt();
System.out.printf("%x\n",num);

}
}
