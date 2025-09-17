import java.util.Scanner;

public class B_Chocolates {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n =  sc.nextInt();
        int arr [] = new int [n];
          
          long sum = 0;
          for(int i =0 ; i < n ; i ++)
          {
            arr[i] =sc.nextInt();

          }
           sc.close();
          if(n==1)
          {
             System.out.println(arr[0]);
          }
         else{
          for(int i =n-1 ; i>0 ;i--)
          {
               if(arr[i-1]<arr[i])
               {
                sum= sum +arr[i];
               
               }
               else
               {
                   int temp  =   arr[i] -1;
                   if (temp<0) {
                       arr[i-1]=0;
                    
                   }
                   else
                   {
                    arr[i-1]  =temp;
                   }
                   sum =sum +arr[i];
               }
               
          }
          sum = sum +arr[0];
          System.out.println(sum);
    }
}
}