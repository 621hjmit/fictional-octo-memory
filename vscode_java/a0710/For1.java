package a0710;

public class For1 {
    public static void main(String[] args) {

        int i;
        int sum = 0;
        for (i = 1; i <= 3; ++i) {// i = i + 1
            // 초기값; 조건값; 증가치
            System.out.println(i);
            System.out.println(sum + "=" + sum + "+" + i);
            sum = sum + i;
        }
        ;
        System.out.println(i);
        System.out.println("1~" + (i - 1) + " 합 : " + sum);

    }
}
