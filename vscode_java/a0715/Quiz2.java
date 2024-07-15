public class Quiz2 {
    public static void main(String[] args) {
        int[][] score = {
                { 100, 100, 100 },
                { 20, 20, 20 },
                { 30, 30, 30 },
                { 40, 40, 40 },
                { 50, 50, 50 }
        }; // 국영수
        int korTotal = 0, engTotal = 0, mathTotal = 0;

        double[][] newScore = new double[5][5];

        System.out.println("번호    국어    영어    수학    총점    평균");
        System.out.println("============================================");
        int temp = 0;
        for (int j = 0; j < newScore.length; j++) {
            System.out.printf("%4d    ", (j + 1));
            for (int i = 0; i < newScore[1].length; i++) {
                if (i < 3) {
                    temp += score[j][i];
                    newScore[j][i] = (int) score[j][i];
                    System.out.printf("%4.0f    ", newScore[j][i]);
                } else if (i == 3) {
                    newScore[j][i] = (int) temp;
                    System.out.printf("%4.0f    ", newScore[j][i]);
                } else if (i == 4) {
                    newScore[j][i] = (temp / 3);
                    System.out.printf("%5.1f    ", newScore[j][i]);
                }
            }
            temp = 0;
            System.out.println();
        }
        int[] totals = new int[3];
        int subjectNum = 0;
        for (subjectNum = 0; subjectNum < score[1].length; subjectNum++) {
            for (int i = 0; i < score.length; i++) {
                totals[subjectNum] += score[i][subjectNum];
            }
        }

        System.out.println("============================================");
        System.out.printf("총점 : ");
        korTotal = totals[0];
        engTotal = totals[1];
        mathTotal = totals[2];
        System.out.printf("%4d    %4d    %4d", korTotal, engTotal, mathTotal);
    }
}
