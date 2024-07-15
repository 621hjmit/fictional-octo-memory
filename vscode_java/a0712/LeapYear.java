package a0712;

public class LeapYear {
    public static void main(String[] args) {
        // 윤년판별을 메서드를 이용해서 만들어보자
        // 1. 기본적으로 연수가 4의배수이면 윤년이다.
        // 2. 하지만 100으로 나누어 떨어지는 연수는 윤년이 아니다. ->1900
        // 3. 특별히 400으로 나누어 떨어지는 연수는 윤년이다.
        // 2000 년은 윤년입니까? true
        // 1900 년은 윤년입니까? false
        // 2024은 윤년입니까? true

        System.out.printf("2024년은 윤년입니까 %b\n", isLeapYear(2020));
        System.out.printf("1900년은 윤년입니까 %b\n", isLeapYear(1900));
        System.out.printf("2000년은 윤년입니까 %b\n", isLeapYear(2000));
        // 반환되는값이 참,거짓
    }

    private static boolean isLeapYear(int year) {
        boolean result = false;

        if (year % 4 == 0) {
            result = true;
            if (year % 100 == 0) {
                result = false;
                if (year % 400 == 0) {
                    result = true;
                }
            }

        }
        // result = (year % 4 == 0) ? ((year % 100 != 0) ? true : ((year % 400 == 0) ?
        // true : false)) : false;
        return result;
    }
}
