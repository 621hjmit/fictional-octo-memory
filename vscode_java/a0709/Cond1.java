package a0709;

public class Cond1 {
    public static void main(String[] args) {
        int score = 85;
        char grade = (score > 90) ? 'A' : 'B';
        //  조건 ? 참 : 거짓;
        System.out.println(score + "점은 " + grade + "등급입니다.");
    }
}
