public class Array8 {
    public static void main(String[] args) {
        String[] names = {
                "Elena", "Suzie", "john", "Emily", "Neda",
                "Kate", "Alex", "Daniel", "sam"
        };
        int[] scores = { 65, 74, 23, 75, 68, 96, 88, 98, 54 };
        int i = topIndex(scores);
        System.out.printf("1등 : %s(%d)점", names[i], scores[i]);
    }

    private static int topIndex(int[] arr) {
        int topIdx = 0; // 가장큰값의 인덱스 ,초기값 = 0
        for (int i = 0; i < arr.length; i++) {
            if (arr[topIdx] < arr[i]) {
                topIdx = i;
            }
        }
        return topIdx;
    }

}
