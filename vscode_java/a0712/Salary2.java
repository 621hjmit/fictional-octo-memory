package a0712;

public class Salary2 {
    public static void main(String[] args) {
        printSalary(10000, 160);
        printSalary(15000, 175);
        printSalary(9000, 180);
        printSalary(13000, 190);
    }

    private static void printSalary(int wage, int hours) {
        int extraHours = 0;
        if (hours > 160) {
            if (hours > 180) {
                System.out.println("[에러] 근무시간이 180시간을 초과하였습니다.");
                return;
            } else {
                extraHours = hours - 160;
                hours = 160;
            }
        }
        if (wage < 10000) {
            System.out.println("[에러] 기본 시급이 1만 원보다 작습니다.");
            return;
        }
        int salary = wage * hours;
        double nightSalary = wage * 1.5 * extraHours;
        double resultSalary = salary + nightSalary;
        System.out.printf("[급여] %d", (int) resultSalary);
        System.out.println();
        return;
    }
}
