package a0712;

public class CalorieCalc {
    public static void main(String[] args) {
        int n = 3;
        double x = calorieCalc(n);
        System.out.printf("삼겹살 %d인분의 칼로리: %.2f kcal", n, x);
    }

    private static double calorieCalc(int amount) {
        int totalGram = amount * 180;
        double totalKcal = totalGram * 5.179;
        return totalKcal;
    }
}