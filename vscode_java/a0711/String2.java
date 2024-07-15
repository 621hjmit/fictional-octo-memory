package a0711;

public class String2 {
    public static void main(String[] args) {
        String ssn = "9506241230123"; // 남여를 구분해라
        char sex = ssn.charAt(6);
        switch (sex) {
            case '1':
            case '3':
                System.out.println("남자입니다.");
                break;
            case '2':
            case '4':
                System.out.println("여자입니다.");
                break;
            // charAt(인덱스) -> 인덱스번호로 한문자 추출
        }

    }
}
