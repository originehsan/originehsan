import java.util.Scanner;

public class A_Lucky_Sum_of_Digits {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       int bestX = -1;
 int bestY = -1;
    sc.close();
    for(int y=0 ; y*7<=n ; y++)
    {
        int left  =  n-y*7;
        if(left%4==0)
        {
            int x  =  left/4;
              if(bestX==-1 || (x+y) < (bestX+bestY))
              {
                  bestX =x;
                  bestY = y;
              }
        }
    }
    StringBuilder builder = new StringBuilder();
    if(bestX==-1)
    {
        System.out.println(-1);
    }
    else
    {
        for (int i = 0; i < bestX; i++) {
           builder.append('4'); 
        }
        for (int i = 0; i < bestY; i++) {
            builder.append('7');   
        }
    
        System.out.println(builder.toString());
        }
    }
    }