import java.util.Scanner;

public class A_cAPS_lOCK {

public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    String str= sc.nextLine();
     sc.close();
     boolean checkAllLetter =  true;
    int n =  str.length();
    if(n==1)
    {
        char ch = str.charAt(0);
         if(Character.isLowerCase(ch))
         {
                        System.out.println(str.toUpperCase());
         }
         else
         {
             System.out.println(str.toLowerCase());
         }
       
    }
    else
    {
    for(int i=1; i<n ; i++)
    {
      if(!Character.isUpperCase(str.charAt(i)))
      {
                 checkAllLetter = false;
                 break;
      } 
    }
 if(!checkAllLetter)
 {
      System.out.println(str);
 } 
 else
 {
     if(Character.isUpperCase(str.charAt(0)))
     {  
       System.out.println(str.toLowerCase());
     }
     else
     {
   System.out.println(str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase());
     }
 } 
}
}
}