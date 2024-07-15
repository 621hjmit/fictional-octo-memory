package a0711;

public class Array2 {
    public static void main(String[] args) {
        int[] grade = new int[] {85, 65, 90};
        int sum = 0;
        for(int i=0; i<grade.length;i++){
            sum += grade[i];
        }
        System.out.println("모든 과목 합계 " +sum+ " 입니다.");
        System.out.println("이학생의 평균은 "+(sum/grade.length)+" 입니다.");

    }
}
