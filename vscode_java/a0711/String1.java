package a0711;

public class String1 {
    public static void main(String[] args) {
        int a = 10;
        String strVar1 = "홍길동"; // 같은 내용이면 주소를 공유
        String strVar2 = "홍길동";

        if (strVar1 == strVar2) {
            System.out.println("strVar1과  strBar2는 참조가 같음");
        } else {
            System.out.println("strVar1과  strBar2는 참조가 다름");
        }

        String strVar3 = new String("홍길동");
        String strVar4 = new String("홍길동");

        if (strVar3 == strVar4) {
            System.out.println("strVar3과  strBar4는 참조가 같음");
        } else {
            System.out.println("strVar3과  strBar4는 참조가 다름");
        }

        if (strVar3.equals(strVar4)) {
            System.out.println("strVar3과  strBar4는 문자열이 같음");
        } // strVar3 에있는 "홍길동" strVar4 에있는 "홍길동" 내용이 같은지

    }
}
