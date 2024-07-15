package a0710;

public class For1_3 {
    public static void main(String[] args) {

        int i;
        int sum = 0;
        for (i = 1; i <= 100; i++) {// i = i + 1
            sum = sum + i;
            if (i == 50) {
                System.out.println(i + "일때 합계는 : " + sum);
                continue;
            }
        }
        ;
        System.out.println(i + "일때 합계는 : " + sum);
        // break i==50일때 for문을 종료
        // continue i==100일때 for문을 종료

    }
}
