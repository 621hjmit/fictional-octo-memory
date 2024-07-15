package a0708;

public class Conversion01 {
    public static void main(String[] args) {
        int value1 = Integer.parseInt("10"); //문자 정수형 10으로 변환
        double value2 = Double.parseDouble("3.14"); //"문자 ->실수로 변환"
        boolean value3 = Boolean.parseBoolean("true"); //참거짓으로 바꿔줌

        System.out.println("value1: " + value1);
		System.out.println("value2: " + value2);
		System.out.println("value3: " + value3);

        String str1 = String.valueOf(10);
		String str2 = String.valueOf(3.14);
		String str3 = String.valueOf(true);		
		
		System.out.println("str1: " + str1);
		System.out.println("str2: " + str2);
		System.out.println("str3: " + str3);

    }



}
