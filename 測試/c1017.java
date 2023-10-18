import java.util.Scanner;
public class c1017{
    public static void main(String[] args){
        System.out.println("WH1 鑽石列印");

        int x,y;
        int i,j;
        
        System.out.println("請輸入上高");
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        System.out.println("請輸入下高");
        sc = new Scanner(System.in);
        y = sc.nextInt();
        //System.out.println(x);
        //System.out.println(y);
        for(i=y-x;i>=0;i--){
            for(j=0;j<=i;j++){
                System.out.print(" ");
            }
            for(j=(x-1)*2+1;j>-2*(y-x)+(i*2);j--){
                System.out.print("*");
            }
            System.out.println();
        }
        
        for(i=y-1;i>=0;i--){
            for(j=y-i;j>0;j--){
                System.out.print(" ");
            }
            for(j=i*2;j>=0;j--){
                System.out.print("*");
            }
            System.out.println();
        }
        


        System.out.println("HW2 停車計費");
        int w,t,m=0,dt,d;
        int[] wd={0,0,0,0,0,0,0};
        System.out.println("請輸入入場星期(0~6)");
        sc = new Scanner(System.in);
        w = sc.nextInt();
        System.out.println("請輸入停放時長(小時)");
        sc = new Scanner(System.in);
        t = sc.nextInt();
        dt=t%24;
        d=t/24;

        for(i=0;i<d;i++){
            wd[w]++;
            w++;
            if(w==7)w=0;
        }
        for(i=0;i<7;i++){
            if(i==0||i==6)m=m+(wd[i]*1200);
            else m=m+(wd[i]*300);
        }

        if(w==0||w==6){ 
            if(dt>=6){ 
                m=m+1200;
            }   
            else{
                m=m+dt*200;
            }     
        }
        else { 
            if(dt>=3){ 
                m=m+300;
            }   
            else{
                m=m+dt*100;
            }     
        }
        System.out.print("所需繳納費用:");
        System.out.print(m);
        System.out.println("元");
    }
}



