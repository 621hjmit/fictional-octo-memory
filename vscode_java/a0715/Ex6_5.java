public class Ex6_5 {
    public static void main(String[] args) {
        int[] runningMinutes = { 42, 66, 57, 54, 88, 64, 71 };
        int sum = 0;
        for (int i = 0; i < runningMinutes.length; i++) {
            sum += runningMinutes[i];
        }
        double average = (double) sum / runningMinutes.length;
        System.out.printf("총합 : %d분\n", sum);
        System.out.printf("평균 : %d분 %.0f초\n", (int) average, 60 * (average % 1));
        // System.out.printf("평균 : %.5f분\n", average);
        // System.out.printf("평균 : %.5f분\n", (average % 1)); // 1분은 60초니까 0.14286분에 60을
        // 곱하면 초가 나온다.
    }
}