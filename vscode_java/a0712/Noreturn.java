package a0712;

public class Noreturn {
    public static void main(String[] args) {
        buy();
        boil();
        put();
        eat();
    }
    private static void eat() {
        System.out.println("맛있게 먹는다.");
    }
    private static void put() {
        System.out.println("라면을 넣는다.");
    }
    private static void boil() {
       System.out.println("물을끓인다.");
    }
    //반환값이 없는 메소드를 void메소드
    public static void buy() {
        System.out.println("라면을 사온다.");
    }
    

}
