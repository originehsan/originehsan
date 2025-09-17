import java.util.Scanner;

public class A_Dreamoon_and_Stairs {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int  stairs  = sc.nextInt();
        int target  = sc.nextInt();
         int answer = -1;
         int minstep;
        sc.close();
          if(stairs<target)
          {
               answer =-1;
          }
          else{
        if(stairs%2==0)
        {
              minstep = stairs/2;
              if(minstep%target==0)
              {
                answer = minstep;
              }
              else
              {
                  answer =  minstep + (target- (minstep%target));
              }
        }
        else
        {
           minstep = (stairs/2)+1;
             if(minstep%target==0)
             {
                answer = minstep;
             }
             else
             {
               answer =  minstep + (target- (minstep%target));  
             }

        }
    }
    System.out.println(answer);
    }
}