import java.util.Scanner;

public class A_New_Year_Transportation {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=  sc.nextInt(); 
        int target = sc.nextInt();
        int arr [] =new int[n ] ;
        target =target-1;
        boolean bool = false;
        for(int i = 0; i < n-1 ; i++)
        {
               arr[i] =sc.nextInt();
        }
        sc.close();
        int idx = 0 ;
        while(idx<n && idx <=target)
        {
            if(target==idx)
            {
               bool = true;
               break;
            }    
           idx = idx +  arr[idx];      
        }
        if(bool)
        {
            System.out.println("YES");

        }
        else
        {
            System.out.println("NO");
        }
    }
}