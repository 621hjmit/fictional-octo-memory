package a0711;

public class Array5 {
    public static void main(String[] args) {
        int[] score = { 79, 88, 91, 33, 100, 55, 95 };
        int max = score[0]; // 79 최대값 첫번째 값으로 초기화
        int min = score[0]; // 79 최소값 첫번째 값으로 초기화

        for (int i = 1; i < score.length; i++) {
            if (score[i] > max) {
                max = score[i];
            } else if (score[i] < min) {
                min = score[i];
            }
        }
        System.out.println("max: " + max);
        System.out.println("min: " + min);
    }
}
