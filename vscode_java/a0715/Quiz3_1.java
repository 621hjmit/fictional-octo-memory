public class Quiz3_1 {
    public static void main(String[] args) {
        int[][] array = {
                { 95, 86 },
                { 83, 92, 96 },
                { 78, 83, 93, 87, 88 }
        };
        int sum = 0;
        System.out.println(array[2].length);
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j > array[i].length; j++) {
                sum += array[i][j];
                // System.out.print(array[i][j] + " ");
                System.out.println(i + " " + j);
            }
            System.out.println();
        }
        System.out.println("총 합: " + sum);
    }
}