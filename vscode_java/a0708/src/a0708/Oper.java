package a0708;

public class Oper {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 10;
        char char1 = 'A';
        char char2 = 'B';
        int num3 = 1;
        double num4 = 1.0;
        String str1 = "자바";
        String str2 = "Java";
        boolean result8 = (str1.equals(str2));
        boolean result9 = (!str1.equals(str2));

        boolean result1 = (num1 == num2);
        boolean result2 = (num1 != num2);
        boolean result3 = (num1 <= num2);
        boolean result4 = (char1 < char2);

        boolean result5 = (num3 == num4);

        // int 와 double을 비교할 때 num3가 double로 암묵적 형변환 되어 1.0

        System.out.println("result1: " + result1); // true
        System.out.println("result2: " + result2); // false
        System.out.println("result3: " + result3); // true
        System.out.println("result4: " + result4); // true
        System.out.println("result5: " + result5); // true
        System.out.println("num3: " + num3); // num3 출력하면 그대로 그냥 1 로 출력됨.
        System.out.println("result8: " + result8); // false
        System.out.println("result9: " + result9); // true
    }
}
