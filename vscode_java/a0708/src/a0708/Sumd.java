package a0708;

public class Sumd {
    public static void main(String[] args) {
        int number = 374;
        int one = number % 10;
        int two = number / 10 % 10; // 37%10 7
        int three = number / 100;
        int sum = one + two + three;
        System.out.printf("정수 %d의 각 자리수 총합: %d", number, sum);
    }
}
