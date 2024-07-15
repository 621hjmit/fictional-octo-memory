package vscode_java.a0709;

public class Shift01 {
    public static void main(String[] args) {
        int num1 = 1;
        int result1 = num1 << 3; // 1을 3칸만큼 뒤로 이동. 1 0 9 8 이렇게 뒤로 간거임. 몰루 그런게 있대 .. ㅎㅎ 쉬프트 연산자래
        int result2 = num1 * (int) Math.pow(2, 3); // math.pow는 2의 3승을 의미
        System.out.println("result1 :" + result1);
        System.out.println("result2 :" + result2);
    }
}
