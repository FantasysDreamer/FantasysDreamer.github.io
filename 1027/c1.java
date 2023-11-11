import java.util.Arrays;
import java.util.Scanner;

public class c1{
    public static void main(String[] args) {
        int i,j;
        Scanner sc=new Scanner(System.in);
        System.out.println("<香腸骰子>");
        int t=0,l=1;
        System.out.print("請輸入骰子面數:");
        
        int d=sc.nextInt();


        System.out.print("請輸入骰子數量:");
        int m=sc.nextInt();
        System.out.println();
        int[] a=new int[m];
        int[] b=new int[d];

        for(i=0;i<=m-1;i++) a[i]= (int)(Math.random()*d)+1;
        Arrays.sort(a);//排列順序

        System.out.print("骰子的內容:");
        System.out.println(Arrays.toString(a));//列出for(int p: a)System.out.printf("(%3d)",p)
        System.out.println();

        for(i=0;i<=m-1;i++){
            for(j=0;j<=d-1;j++){
                if(a[i]==j+1)b[j]++;
            }
        }
        //System.out.println(Arrays.toString(b));

        for(i=0;i<=d-1;i++){
            if(b[i]>=2)l=0;
        }

        for(i=0;i<=d-1;i++){
            if(b[i]!=0){
            b[i]=0;
            break;
            }
        }

        for(i=0;i<=d-1;i++){
            t=t+b[i]*(i+1);
        }

        if(l==1)t=0;

        //System.out.println(Arrays.toString(b));
        //System.out.println(l);
        System.out.printf("您的分數為:[%d]\n",t);

        System.out.println("<井字遊戲>");
        System.out.println("-----");
        System.out.println("| 1| 2| 3|");
        System.out.println("-----");
        System.out.println("| 4| 5| 6|");
        System.out.println("-----");
        System.out.println("| 7| 8| 9|");
        System.out.println("-----");
        int[][] ox=new int[3][3];
        for(i=0;i<=2;i++){
            for(j=0;j<=2;j++){
                ox[i][j]=0;
            }
        }

        int pr=1,rand=1,win=0,inp,comb=0,z;
        do{
            if(pr==1){
                System.out.print("請玩家1輸入位置(1~9):");
                inp=sc.nextInt();
                    while(ox[((inp-1)/3)][(inp-1)%3]!=0){
                        System.out.print("輸入失敗,請玩家1重新輸入位置(1~9):");
                        inp=sc.nextInt();
                    }
            }
            else{
                System.out.print("請玩家2輸入位置(1~9):");
                inp=sc.nextInt();
                while(ox[((inp-1)/3)][(inp-1)%3]!=0){
                    System.out.print("輸入失敗,請玩家2重新輸入位置(1~9):");
                    inp=sc.nextInt();
                }
            }

            if(pr==1){
                ox[((inp-1)/3)][(inp-1)%3]=1;
            }
            else{
                ox[((inp-1)/3)][(inp-1)%3]=2;
            }

            for(i=0;i<=2;i++){
                System.out.println("-----");
                for(j=0;j<=2;j++){
                    System.out.print("|");
                    if(ox[i][j]==1){
                        System.out.print("o");
                    }
                    else if(ox[i][j]==2){
                        System.out.print("x");
                    }
                    else System.out.print(" ");
                }
                System.out.println("|");
            }
            System.out.println("-----");
            
            if(pr==1){
                for(i=0;i<=2;i++){
                    for(j=0;j<=2;j++){
                        if(ox[i][j]==1)comb++;
                    }
                    if(comb==3)win=1;
                    comb=0;
                }
                for(i=0;i<=2;i++){
                    for(j=0;j<=2;j++){
                        if(ox[j][i]==1)comb++;
                    }
                    if(comb==3)win=1;
                    comb=0;
                }
                for(i=0;i<=2;i++){
                    if(ox[i][i]==1)comb++;
                    if(comb==3)win=1;
                }
                comb=0;
                for(i=2;i>=0;i--){
                    if(ox[2-i][i]==1)comb++;
                    if(comb==3)win=1;
                }
                comb=0;

                
            }
            else{
                for(i=0;i<=2;i++){
                    for(j=0;j<=2;j++){
                        if(ox[i][j]==2)comb++;
                    }
                    if(comb==3)win=2;
                    comb=0;
                }
                for(i=0;i<=2;i++){
                    for(j=0;j<=2;j++){
                        if(ox[j][i]==2)comb++;
                    }
                    if(comb==3)win=2;
                    comb=0;
                }

                for(i=0;i<=2;i++){
                    if(ox[i][i]==2)comb++;
                    if(comb==3)win=2;
                }
                comb=0;
                for(i=2;i>=0;i--){
                    if(ox[2-i][i]==2)comb++;
                    if(comb==3)win=2;
                }
                comb=0;
            }
            z=1;
            for(i=0;i<=2;i++){
                for(j=0;j<=2;j++){
                    if(ox[i][j]==0)z=0;
                }
            }
            if(z==1)win=3;
            pr=pr*-1;
        }while (win==0);
        if(win==1)System.out.print("玩家1獲勝");
        else if(win==2)System.out.print("玩家2獲勝");
        else System.out.print("平手");
    }
}
