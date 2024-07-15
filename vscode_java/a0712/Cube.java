package a0712;

public class Cube {
    public static void main(String[] args) {
        double h = 7;
        double v = volume(h);
        System.out.printf("한변의 길이가 n인 정육면체의 부피: %.1f", v);
    }

    private static double volume(double h) {
        return h * h * h;
    }
}
