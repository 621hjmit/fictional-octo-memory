package a0711;

public class Lotto2 {
    public static void main(String[] args) {
        int[] ball = new int[45]; // 45개의 정수값을 저장하기 위한 배열
        int[] ball2 = new int[6]; // 45개의 정수값을 저장하기 위한 배열
        
        //배열의 각 요소에 1~45의 값을 저장한다.
        for(int i=0 ; i < ball.length; i++)
            ball[i] = i+1;
        

        // 배열의 i번째 요소와 임의의 요소에 저장된 값을 서로 바꿔서 값을 섞는다.
        // 0번부터 5번째 요소까지 모두 6개만 바꾼다.
        for (int i = 0; i < 6; i++) {
            var j = (int) (Math.random() * 45); // 0~ 44범위의 임의의 값을 얻는다.
            ball2[i] = ball[j];
        }
        // 배열 ball의 앞에서 부터 6개의 요소를 출력한다.
        for (int i = 0; i < 6; i++) {
            System.out.printf("ball2[%d] = %d%n", i, ball2[i]);
        }

    }
}
