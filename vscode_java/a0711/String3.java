package a0711;

public class String3 {
    public static void main(String[] args) {
        String subject = "자바 프로그래밍";

        int location = subject.indexOf("프로그래밍");
        // 찾는문자열 시작인덱스번호 3나옴 없을때는 -1
        System.out.println(location);
        String subString = subject.substring(location);
        // subject.substring(3); 인덱스 번호 3번부터 끝까지 문자열 추출
        System.out.println(subString); // 프로그램밍 추출

        location = subject.indexOf("자바");
        if (location != -1) {
            System.out.println("자바와 관련된 책이군요");
        } else {
            System.out.println("자바와 관련없는 책이군요");
        }

        boolean result = subject.contains("자바");
        if (result) {
            System.out.println("자바와 관련된 책이군요.");
        } else {
            System.out.println("자바와 관련 없는 책이군요.");
        }

    }
}
