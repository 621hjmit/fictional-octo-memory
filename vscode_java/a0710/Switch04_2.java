package a0710;

import java.util.Scanner;

public class Switch04_2 {
    public static void main(String[] args) {
        // 요일에 따른 활동 제안
        Scanner scanner = new Scanner(System.in);
        int day;

        while (true) {
            System.out.print("요일입력(1:월요일,2:화요일...7:일요일): ");
            day = scanner.nextInt();

            switch (day) {
                case 1:
                    System.out.println("월요일: 독서하기");
                    break;
                case 2:
                    System.out.println("화요일: 운동하기");
                    break;
                case 3:
                    System.out.println("수요일: 영화보기");
                    break;
                case 4:
                    System.out.println("목요일: 요리하기");
                    break;
                case 5:
                    System.out.println("금요일: 친구 만나기");
                    break;
                case 6:
                    System.out.println("토요일: 쇼핑하기");
                    break;
                case 7:
                    System.out.println("일요일: 휴식하기");
                    break;
                default:
                    System.out.println("잘못된 입력입니다.");
                    break;
            }
        }
    }
}
