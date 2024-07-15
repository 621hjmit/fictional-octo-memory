package a0710;

import java.util.Scanner;

public class Quiz2 {
    public static void main(String[] args) {

        // 03번문제 for문을 이용해서 1부터 100까지 3의 배수 총합 출력
        /*
         * int sum = 0;
         * for (int i = 3; i < 101; i += 3) {
         * sum += i;
         * }
         * System.out.println(sum);
         */

        // 04번 문제 : 주사위 두개 굴려서 총합이 5나오면 그만돌리기
        /*
         * int dice1 = 0, dice2 = 0, sum = 0;
         * while (!(sum == 5)) {
         * dice1 = (int) (Math.random() * 6) + 1; // 주사회 번호 하나 뽑기
         * dice2 = (int) (Math.random() * 6) + 1; // 주사회 번호 하나 뽑기
         * sum = dice1 + dice2;
         * System.out.println("dice1: " + dice1 + "  dice2: " + dice2 + "  sum: " +
         * sum);
         * }
         * System.out.println("두 개의 주사위를 던져 합이 5가 되었으므로 while문을 종료합니다.");
         */

        // 06번 문제 : * 이 **** 한개부터 다섯개 까지 찍히게
        /*
         * String star = "*";
         * String str = "";
         * for (int i = 1; i < 6; i++) {
         * str += star;
         * System.out.println(str);
         * }
         */

        // 07번 문제 문제는
        // https://docs.google.com/document/d/1WyD20i2N7VOlQIuaMOZOFESFLZegzfre6cyJ1hDfip4/edit?usp=sharing
        // 여기서 확인 가능함.

        Scanner scan = new Scanner(System.in);
        int menu = 0;
        int money = 0;
        int accountMoney = 0;
        boolean run = true;

        while (run) {

            System.out.println("---------------------------------");
            System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
            System.out.println("---------------------------------");
            System.out.print("선택>");
            menu = scan.nextInt();
            System.out.println("");

            switch (menu) {
                case 1:
                    System.out.print("예금액> ");
                    money = scan.nextInt();
                    System.out.println("");
                    accountMoney += money;
                    break;
                case 2:
                    System.out.print("출금액> ");
                    money = scan.nextInt();
                    System.out.println("");
                    accountMoney -= money;
                    break;
                case 3:
                    System.out.print("잔고> " + accountMoney);
                    System.out.println("");
                    break;
                case 4:
                    System.out.print("프로그램 종료");
                    System.out.println("");
                    run = false;
                    break;
                default:
                    System.out.println("알수없는 입력입니다.");
                    break;
            }

        }
    }

}
