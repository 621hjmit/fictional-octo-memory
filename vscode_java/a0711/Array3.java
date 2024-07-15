package a0711;

public class Array3 {
    public static void main(String[] args) {
        int[][] arr = new int[2][3];
        int a = arr[0].length;
        int b = arr[1].length;
        int k = 10;

        System.out.println(a);
        System.out.println(b);

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = k;
                k += 10;
                System.out.print("arr[" + i + "][" + j + "] = " + arr[i][j] + "    ");

            }
            System.out.println("");
        }

    }
}
