package a0711;

public class Quiz2_4 {
    public static void main(String[] args) {

        int[] numbers = { 1, 2, 3, 4, 5 };
        int[] numbersRevers = { 0, 0, 0, 0, 0 };
        int j = 0;
        for (int i = numbers.length - 1; i >= 0; i--) {
            numbersRevers[j++] = numbers[i];
        }
        System.out.print("numbersRevers: ");
        for (int i = 0; i < numbers.length-1; i++) {
            System.out.print(numbersRevers[i] + ", ");
        }
        System.out.print(numbersRevers[numbers.length-1]);
        System.out.println();
    }

}
