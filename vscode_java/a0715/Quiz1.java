public class Quiz1 {
    public static void main(String[] args) {
        int[] even = { 0, 2, 4, 6, 8 };
        int[] odd = { 1, 3, 5, 7, 9 };
        int[] result = simpleMerge(even, odd);
        System.out.printf("결과: ");
        for (int i = 0; i < result.length; i++) {
            System.out.printf("%d ", result[i]);
        }
    }

    public static int[] simpleMerge(int[] a, int[] b) {
        int[] arr = new int[a.length + b.length];

        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                arr[i] = a[i / 2];
            } else {
                arr[i] = b[i / 2];
                System.out.println(i);
            }
        }

        /*
         * for (int i = 0; i < a.length; i++) {
         * arr[i * 2] = a[i];
         * }
         * for (int i = 0; i < b.length; i++) {
         * arr[i + 1] = b[i];
         * System.out.println(i + 1);
         * }
         */
        return arr;
    }
}
