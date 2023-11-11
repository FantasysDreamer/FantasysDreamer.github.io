import java.util.Scanner;
public class hw {
    public static void main(String[] args){
        int i,j,m=1,t=4,o=3,r;
            for(r=3;r>=1;r--){
                for(i=1;i<=9;i++){
                    for(j=m;j<=t;j++){
                        System.out.print("[");
                        System.out.printf("%2d",j);
                        System.out.print(" * ");
                        System.out.printf("%2d",i);
                        System.out.print(" = ");
                        System.out.printf("%2d",i*j);
                        System.out.print("] ");
                        
                    } 
                System.out.println();
                
                }
            t=t+r;
            m=t-r+1;
            System.out.println();
            }
        System.out.print("\n\n");
        m=1;
        t=7;
        for(r=3;r>=1;r--){
                for(i=1;i<=9;i++){
                    for(j=m;j<=t;j=j+3){
                        System.out.print("[");
                        System.out.printf("%2d",j);
                        System.out.print(" * ");
                        System.out.printf("%2d",i);
                        System.out.print(" = ");
                        System.out.printf("%2d",i*j);
                        System.out.print("] ");
                        
                    } 
                System.out.println();
                
                }
            t++;
            m++;
            System.out.println();
        }
    }

}
