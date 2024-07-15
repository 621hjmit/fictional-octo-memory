package a0711;

public class Quiz2_2 {
    public static void main(String[] args) {
        // 최대값
        int[] numbers = { 1, 2, 3, 4, 5 };
        int max = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println("max: "+max);
    }

}
