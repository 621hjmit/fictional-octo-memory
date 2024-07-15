package a0712;

public class Square {
    public static void main(String[] args) {
        int n = 4;
        int s = square(n);
        System.out.printf("한변의 길이가 %d인 정사각형의 넓이: %d", n ,s);

    }

    public static int square(int length) {
       return length * length; //리턴값은 계산후 제자리로 돌아간다.
    }
}
