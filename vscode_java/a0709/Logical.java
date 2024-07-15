package a0709;

public class Logical {
    public static void main(String[] args) {
        //int charCode = 'A'; //65
        int charCode = '3';
        //System.out.println(charCode);
        if((65 <= charCode) && (charCode <=90)){
            System.out.println("대문자군요");
        }
        if((97 <= charCode) && (charCode <=122)){
            System.out.println("소문자군요");
        }
        if((48 <= charCode) && (charCode <=57)){
            System.out.println("0~9 숫자군요");
        }

        int value = 7;

        //결과 -> 2 또는 3의 배수군요
        if( (value % 2 == 0) || (value%3 == 0)  ){
            System.out.println("2또는 3의 배수이군요");
        }
        boolean result = (value % 2 == 0) || (value%3 == 0);
        if(!result){
            System.out.println("2또는 3의 배수아니군요");
        }
    }
}
