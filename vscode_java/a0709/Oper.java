package a0709;

public class Oper {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 10;
        boolean result1 = (num1 == num2);
        boolean result2 = (num1 != num2);
        boolean result3 = (num1 <= num2);
        System.out.println("result1: " + result1);
        System.out.println("result2: " + result2);
        System.out.println("result3: " + result3);

        char char1 = 'A';
        char char2 = 'B';
        boolean result4 = (char1 < char2); // 65 < 66
        System.out.println("result4: " + result4);

        int num3 = 1;
        double num4 = 1.0;
        boolean result5 = (num3 == num4); 
        //int와 double을 비교할 때 num3가 double 로 암묵적 형변환되어
        // 1.0 == 1.0
        System.out.println("result5: " + result5);

        String str1 = "자바";
        String str2 = "Java";
        boolean result8 = (str1.equals(str2));
		boolean result9 = (! str1.equals(str2)); //! not
        System.out.println("result8:" + result8);
        System.out.println("result9:" + result9);
    }
}
