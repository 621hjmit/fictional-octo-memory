package a0710;

import java.util.Scanner;

public class Switch04 {
    public static void main(String[] args) {
        //요일에 따른 활동 제안
        Scanner scanner = new Scanner(System.in);
        System.out.print("요일입력(1:월요일,2:화요일...7:일요일): ");
        int day = scanner.nextInt();

        switch (day) {
            case 1 -> System.out.println("월요일: 독서하기");
            case 2 -> System.out.println("화요일: 운동하기");
            case 3 -> System.out.println("수요일: 영화보기");
            case 4 -> System.out.println("목요일: 요리하기");
            case 5 -> System.out.println("금요일: 친구 만나기");
            case 6 -> System.out.println("토요일: 쇼핑하기");
            case 7 -> System.out.println("일요일: 휴식하기하기");
            default ->System.out.println("잘못된 입력입니다.");
        }

    }
}
