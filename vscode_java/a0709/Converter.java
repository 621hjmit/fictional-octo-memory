package a0709;

public class Converter {
    public static void main(String[] args) {
        
        double f = 77.0;  //화씨온도
        double ce = (f - 32.0) / 1.8; //온도변화 공식
        System.out.printf("화씨 %.1f도는 섭씨로 %.1f도입니다.",f,ce);

    }
}
