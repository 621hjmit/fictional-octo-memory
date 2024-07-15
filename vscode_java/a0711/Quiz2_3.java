package a0711;

public class Quiz2_3 {
    public static void main(String[] args) {

        // 평균
        int[] numbers = { 1, 2, 3, 4, 5 };
        int average = 0;
        for (int i = 0; i < numbers.length; i++) {
            average += numbers[i];
        }
        average = average / numbers.length;
        System.out.println("average: " + average);

    }

}
