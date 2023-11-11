import java.util.Arrays;
import java.util.Scanner;

public class bvs{
    public static void main(String[] args) {
        int[][] card=new int[13][4];
        int pt1=0,w1=0;
        int pt2=0,w2=0;
        int a,b,c=52;
        String sw;
        boolean k;
        System.out.println("比大小(2最大3最小)\n輸入y繼續");
        Scanner sc=new Scanner(System.in);
        do {
            sw=sc.nextLine();
            
            k=sw.equals("y");
            
            if(k==true ){
                do{
                    a=(int)(Math.random()*13);
                    b=(int)(Math.random()*4);
                }while(card[a][b]==1);
                card[a][b]=1;
                pt1=a*10+b;
                
                System.out.print("玩家1的牌為:");
                switch(b){
                    case 0:System.out.print("梅花");break;
                    case 1:System.out.print("紅心");break;
                    case 2:System.out.print("菱形");break;
                    case 3:System.out.print("黑桃");
                }
                switch(a){
                    case 0:System.out.println("三");break;
                    case 1:System.out.println("四");break;
                    case 2:System.out.println("五");break;
                    case 3:System.out.println("六");break;
                    case 4:System.out.println("七");break;
                    case 5:System.out.println("八");break;
                    case 6:System.out.println("九");break;
                    case 7:System.out.println("十");break;
                    case 8:System.out.println("J");break;
                    case 9:System.out.println("Q");break;
                    case 10:System.out.println("K");break;
                    case 11:System.out.println("A");break;
                    case 12:System.out.println("二");
                }

                do{
                    a=(int)(Math.random()*13);
                    b=(int)(Math.random()*4);
                }while(card[a][b]==1);
                card[a][b]=1;
                pt2=a*10+b;

                System.out.print("玩家2的牌為:");
                switch(b){
                    case 0:System.out.print("梅花");break;
                    case 1:System.out.print("紅心");break;
                    case 2:System.out.print("菱形");break;
                    case 3:System.out.print("黑桃");
                }
                switch(a){
                    case 0:System.out.println("三");break;
                    case 1:System.out.println("四");break;
                    case 2:System.out.println("五");break;
                    case 3:System.out.println("六");break;
                    case 4:System.out.println("七");break;
                    case 5:System.out.println("八");break;
                    case 6:System.out.println("九");break;
                    case 7:System.out.println("十");break;
                    case 8:System.out.println("J");break;
                    case 9:System.out.println("Q");break;
                    case 10:System.out.println("K");break;
                    case 11:System.out.println("A");break;
                    case 12:System.out.println("二");
                }

                if(pt1>pt2){
                    System.out.println("玩家1獲勝");
                    w1++;
                }
                else {
                    System.out.println("玩家2獲勝");
                    w2++;           
                }
                c=c-2;
                System.out.printf("剩餘牌數%2d\n",c);
                System.out.printf("玩家一%2d分:玩家一%2d分\n",w1,w2);
                System.out.println("__________________________________");
            }
            System.out.println("輸入y繼續");
            
        }while(c>=1);
        System.out.println("沒牌了遊戲結束");
    }
}