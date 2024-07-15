package a0711;

public class String6 {
    public static void main(String[] args) {
        String board = "1,자바 학습,참조 타입 String을 학습합니다.,홍길동";
        // 문자열 , 를 기준으로 배열로 분리 저장
        String[] tokens = board.split(","); // , 기준으로 배열을 만든다.
        // 인덱스별로 읽기
        System.out.println("번호: " + tokens[0]);
        System.out.println("제목: " + tokens[1]);
        System.out.println("내용: " + tokens[2]);
        System.out.println("성명: " + tokens[3]);
        System.out.println();
        // for문을 이용한 읽기
        for (int i = 0; i < tokens.length; i++) {
            System.out.println(tokens[i]);
        }

    }
}
