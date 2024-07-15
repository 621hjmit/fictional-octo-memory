package a0708;

public class Float01 {
    public static void main(String[] args) {
        //정밀도 확인
        float var1 = 0.1234567890123456789f;
        double var2 = 0.1234567890123456789;
        //'float'는 32비트 부동 소수점 숫자로 약 7자리의 십진수 정밀도
        //'double' 는 64비트 부동 소수점 숫자 약 15자리 정밀도 
        System.out.println("var1: " + var1);
        System.out.println("var2: " + var2);

        //10의 거듭제곱 리터럴
        double var3 = 3e6;
        float var4 = 3e6F;
		double var5 = 2e-3;
        System.out.println("var3: " + var3);
        System.out.println("var4: " + var4);
        System.out.println("var5: " + var5);

    }
}
