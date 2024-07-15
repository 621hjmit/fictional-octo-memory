package a0708;

public class var_03 {
    public static void main(String[] args) {
        int hour = 3;
        int minute = 5;
        System.out.println(hour + "시간 " + minute + "분");
        //시간과 분을  -> 총 185분 이렇게 결과 출력해 보세요
        int totalMinute = (hour*60) + minute;
        
        System.out.println("총 "+totalMinute +"분");

    }
}
