package vscode_java.a0709;

public class Cond2 {
    public static void main(String[] args) {
        int score = 75;
        char grade = (score > 90) ? 'A' : ((score > 80) ? 'B' : 'C');
        // 조건 ? 참 : 거짓;
        System.out.println(score + "점은 " + grade + "등급입니다.");
    }
}
