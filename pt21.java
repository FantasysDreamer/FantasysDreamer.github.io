import java.util.Arrays;
import java.util.Scanner;

public class pt21{
    public static void main(String[] args) {
        int[] card=new int[52];
        int[] pt2=new int[52];
        int[] pt1=new int[52];
        int a,e=0,p1a=0,p2a=0,sw,i,j,m1=0,m2=0;
        System.out.println("二十一點\n特殊牌:\n1.數字一[代表1或11]\n2.JQK代表10");
        Scanner sc=new Scanner(System.in);
        do{
          a=(int)(Math.random()*52);
        }while(card[a]==1);
        card[a]=1;
        pt1[a]=1;
        System.out.println("玩家1抽蓋牌");
        System.out.println("玩家1的牌為:");
                switch(a%4){
                    case 0:System.out.print("梅花");break;
                    case 1:System.out.print("紅心");break;
                    case 2:System.out.print("菱形");break;
                    case 3:System.out.print("黑桃");
                }
                switch(a/4){
                    case 0:System.out.println("A");break;
                    case 1:System.out.println("二");break;
                    case 2:System.out.println("三");break;
                    case 3:System.out.println("四");break;
                    case 4:System.out.println("五");break;
                    case 5:System.out.println("六");break;
                    case 6:System.out.println("七");break;
                    case 7:System.out.println("八");break;
                    case 8:System.out.println("九");break;
                    case 9:System.out.println("十");break;
                    case 10:System.out.println("J");break;
                    case 11:System.out.println("Q");break;
                    case 12:System.out.println("K");
                }

                switch(a/4){
                    case 0:if((m1+11)<=21)m1=m1+11;
                           else m1++;
                    break;
                    case 10:m1=m1+10;break;
                    case 11:m1=m1+10;break;
                    case 12:m1=m1+10;break;
                    default:m1=m1+(a/4)+1;
                 }



                do{
               a=(int)(Math.random()*52);
               }while(card[a]==1);
               card[a]=1;
               pt2[a]=1;
               System.out.println("\n對手抽蓋牌\n");
                System.out.printf("你的分數為%2d\n",m1);
                m1=0;
    do{
                do{
                System.out.println("玩家抽牌是否抽牌\n輸入[1]抽牌\n輸入[2]休息");
                sw=sc.nextInt();
                }while(sw!=1&&sw!=2);


      while (sw==1) {
                  do{
                    a=(int)(Math.random()*52);
                  }while(card[a]==1);
                card[a]=1;
                pt1[a]=1;
                System.out.print("你抽到 ");
                switch(a%4){
                    case 0:System.out.print("梅花");break;
                    case 1:System.out.print("紅心");break;
                    case 2:System.out.print("菱形");break;
                    case 3:System.out.print("黑桃");
                }
                switch(a/4){
                    case 0:System.out.println("A");break;
                    case 1:System.out.println("二");break;
                    case 2:System.out.println("三");break;
                    case 3:System.out.println("四");break;
                    case 4:System.out.println("五");break;
                    case 5:System.out.println("六");break;
                    case 6:System.out.println("七");break;
                    case 7:System.out.println("八");break;
                    case 8:System.out.println("九");break;
                    case 9:System.out.println("十");break;
                    case 10:System.out.println("J");break;
                    case 11:System.out.println("Q");break;
                    case 12:System.out.println("K");
                }


                System.out.println("你的牌有:");
                
                for(i=0;i<=51;i++){
                 if(pt1[i]==1){
                  switch(i%4){
                    case 0:System.out.print("梅花");break;
                    case 1:System.out.print("紅心");break;
                    case 2:System.out.print("菱形");break;
                    case 3:System.out.print("黑桃");
                }
                
                switch(i/4){
                    case 0:System.out.println("A");break;
                    case 1:System.out.println("二");break;
                    case 2:System.out.println("三");break;
                    case 3:System.out.println("四");break;
                    case 4:System.out.println("五");break;
                    case 5:System.out.println("六");break;
                    case 6:System.out.println("七");break;
                    case 7:System.out.println("八");break;
                    case 8:System.out.println("九");break;
                    case 9:System.out.println("十");break;
                    case 10:System.out.println("J");break;
                    case 11:System.out.println("Q");break;
                    case 12:System.out.println("K");
                  }
                  
                  switch(i/4){
                    case 0:if((m1+11)<=21)m1=m1+11;
                           else m1++;
                    break;
                    case 10:m1=m1+10;break;
                    case 11:m1=m1+10;break;
                    case 12:m1=m1+10;break;
                    default:m1=m1+(i/4)+1;
                 }
                 
                 
                }   
              }
              System.out.printf("你的分數為%2d\n",m1);   
              sw=0;
              if(m1>=21)e=1;
              m1=0;
        }
      }while(e==0);
                
        


    }
}