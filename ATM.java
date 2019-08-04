import java.util.*;
public class ATM
 {
  public static void main(String[]args)
   {
     Scanner sc = new Scanner(System.in);
     int x=sc.nextInt();
     float y=sc.nextFloat();
     
     if(x%5==0 &&(x+0.5)<y)
       System.out.printf("%.2f",y-(x+0.5));
     else
       System.out.printf("%.2f",y);
    }
  }
      
     