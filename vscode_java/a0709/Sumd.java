package a0709;

public class Sumd {
    public static void main(String[] args) {
        
        int number = 374;  //3+7+4 =14 
        //정수 374의 각 자릿수의 총합: 14
        int one = number % 10;  // 1의 자리숫자인 4가 나옴
        int ten = number/10 % 10; // 374/10 = 37%10 = 7이나옴
        int hundred = number / 100 ;
        int sum = one + ten + hundred;
        //출력
        System.out.printf("정수 %d의 각 자릿수의 총합:%d",number,sum);

    }
}
