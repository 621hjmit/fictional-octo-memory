package a0712;

public class Salary {
    public static void main(String[] args) {
        printSalary(10000, 160);
        printSalary(15000, 175);
        printSalary(9000, 180);
        printSalary(13000, 190);

    }

    private static void printSalary(int wage, int hours) {
        // 최저시급
        if (wage < 10000) {
            System.out.println("[에러] 기본 시급이 1만 원보다 작습니다.");
            return; // 메서드에서 출력후 빠져나감
        }
        // 초가 근무시간 체크
        if (hours > 180) {
            System.out.println("[에러] 근무시간이 180시간을 초과하였습니다.");
            return;
        }
        // 급여 변수
        double salary = 0.0;
        // 초과 급여
        if (hours > 160) {
            int extraHours = hours - 160;
            salary = (wage * 160) + wage * extraHours * 1.5;
        } else {
            salary = wage * hours;
        }
        // 기본급여

        // 결과출력
        System.out.printf("[급여] %d 원\n", (int) salary);

    }

}
