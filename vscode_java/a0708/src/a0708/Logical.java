package a0708;

public class Logical {
    public static void main(String[] args) {
        int charCode = 'A';// 65
        System.out.println(charCode);
        if ((65 <= charCode) && (charCode <= 90)) {
            System.out.println("대문자군요");
        } else {
            System.out.println("소문자군요");
        }
        int value = 6;
        if (((value % 2) == 0) || ((value % 3) == 0)) {
            System.out.println("value : " + value);
            System.out.println("value 는 2또는 3의 배수군요.");
        }

        value = 7;
        boolean result = ((value % 2) == 0) || ((value % 3) == 0);
        if (!result) {
            System.out.println("value : " + value);
            System.out.println("value 는 2또는 3의 배수가 아니군요.");
        }

    }
}
