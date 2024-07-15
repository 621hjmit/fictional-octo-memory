package a0711.Quiz3;

public class Quiz31 {
    public static void main(String[] args) {
        int[] arr[];
        int[] arr2 = { 1, 2, 3 };
        int[] arr3 = new int[5];
        int[] arr4 = new int[] { 1, 2, 3, 4, 5 }; // 두번째 대괄호에 숫자를 넣을 필요가 없다. 오른쪽 {}중괄호안의 요소 만큼 배열 크기가 지정된다.
        int[] arr5; // 배열을 선언할 때는 배열의 크기를 지정할 수 없음.
        int[] arr6[] = new int[3][];

        for (int i = 0; i < arr3.length; i++) {
            System.out.print(i);
        }
    }

}
