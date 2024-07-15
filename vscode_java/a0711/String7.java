package a0711;

public class String7 {
    public static void main(String[] args) {
        String ssn = "880815-1234567";
        // 880815-1234567
        // 01234567890123

        String firstNum = ssn.substring(0, 6);
        // 인덱스 0번부터 6번전까지 문자열 추출
        System.out.println(firstNum);
        String secondNum = ssn.substring(7);// 7부터 끝까지 나온다.
        String secondNum2 = ssn.substring(7, 14);// 7부터 끝까지 나온다. endIndex 에는 +1을 해줘야한다. 이유 모름
        System.out.println(secondNum);
        System.out.println(secondNum2);

    }
}
