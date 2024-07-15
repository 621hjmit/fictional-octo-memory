package a0711;

public class Quiz2_1 {
    public static void main(String[] args) {
        // 배열 요소의 합
        int[] numbers = { 1, 2, 3, 4, 5 };
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println("sum: " + sum);
    }
}
