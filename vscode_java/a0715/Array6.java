
public class Array6 {
    public static void main(String[] args) {
        int[][] gugudan = new int[10][10]; // 10X10 짜리 배열(방) 생성
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                gugudan[i][j] = i * j;
            }
        }
        System.out.printf("2 X 7=%d/n", gugudan[2][7]);
        System.out.printf("9 X 4=%d/n", gugudan[9][4]);

    }
}