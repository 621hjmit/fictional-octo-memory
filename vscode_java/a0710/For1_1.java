package a0710;

public class For1_1 {
    public static void main(String[] args) {
        
        int i;
        int sum = 0;
        for(i=1; i<=100;i++){//i = i + 1
            //초기값; 조건값; 증가치
           // System.out.println(i);
            sum = sum + i;
            if(i == 50){
                System.out.println(i + "일때 합계는 : "+ sum); 
                break; //i가 50과같은면 출력하고 for문을 빠져나간다.         
            }
        };
        //System.out.println(i);
       // System.out.println("1~" + (i-1) + " 합 : " + sum);

    }
}
