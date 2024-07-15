package a0709;

public class In {
    public static void main(String[] args) {
        int x = 10;
        int y = 10;
        int z;

        x++; //x = x + 1
        ++x; //12
        System.out.println("x=" + x);
        System.out.println("-----------------------");		
		y--;
		--y; //8
		System.out.println("y=" + y);	

        System.out.println("-----------------------");		
		z = x++;
		System.out.println("z=" + z); //12
		System.out.println("x=" + x); //13

        System.out.println("-----------------------");		
		z = ++x;
		System.out.println("z=" + z);
		System.out.println("x=" + x);


        System.out.println("-----------------------");				
		z = ++x + y++; // y는  x 와 y 를 더해서 z 대입후 하나 증가하여 8-> 9가됨
		System.out.println("z=" + z);
		System.out.println("x=" + x);
		System.out.println("y=" + y);
    }
}
