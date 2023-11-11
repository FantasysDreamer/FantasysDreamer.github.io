import java.util.Scanner;
public class c1{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        String x = sc.nextLine();
        System.out.printf("X = %s\n", x);
        int y = sc.nextInt();
        System.out.printf("x = %2d\n", y);
        y = sc.nextInt();
        System.out.printf("x = %2d\n", y);
        float z = sc.nextFloat();
        System.out.printf("y = %.3f\n", z);
    }
}