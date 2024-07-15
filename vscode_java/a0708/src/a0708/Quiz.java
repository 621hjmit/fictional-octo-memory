package a0708;

import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        // Scanner scan = new Scanner(System.in);
        // System.out.print("온도 변환해줄께 화씨를 입력해봐유 : ");
        double ondo = 70.0;
        double subOndo = (ondo - 32.0) / 1.8;
        System.out.println("화씨 " + ondo + "는 섭씨로 " + subOndo + "도 입니다.");
        System.out.printf("화씨 %.1f는 섭씨로 %.1f도 입니다.", ondo, subOndo);

    }
}
