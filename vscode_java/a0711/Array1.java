package a0711;

public class Array1 {
    public static void main(String[] args) {
        int[] grade1 = new int[3]; //길이가 3인 int형 배열선언및 생성
        int[] grade2 = new int[3]; //길이가 3인 int형 배열선언및 생성

        grade1[0] = 85; //인덱스 이용한 배열의 초기화
        grade1[1] = 65;
        grade1[2] = 90;

        grade2[0] = 85;
        for(int i=0;i < grade1.length; i++){
            System.out.print(grade1[i] + " ");
        }
        System.out.println();
        for(int i=0;i < grade2.length; i++){
            System.out.print(grade2[i] + " ");
        }

        int[] grade3 = {70, 90, 80};//배열의 선언과 동시에 초기화할 수 있음
        int[] grade4 = new int[]{70, 90, 80}; //배열의 선언과 동시에 초기화할 수 있음
        //int[] grade5;
        //grade5 = {70,80,90}; -> 이미선언된 배열을 이방법으로 초기화하면 에러남
        int[] grade6;
        grade6 = new int[]{70,80,90};
    }
}
