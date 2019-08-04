package Design;
import java.util.*;
public class Pattern
{
 public static void main(String[] args)
 {
  Scanner sc= new Scanner(System.in);
  int n;
  System.out.println("Enter number of rows to be printed for this pattern");
  n=sc.nextInt();
  
  for(int i=1;i<=n;i++)
   {
    for(int j=1;j<=n-i;j++)
    {
     System.out.print(" ");
    }
     for(int k=1;k<=2*i-1;k++)
      {
        System.out.print("@");
      }
    System.out.println("\n");
   }
  }
}