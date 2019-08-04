import java.util.*;
public class Add
{
 public static void main(String[]args)
 {
  Scanner sc= new Scanner(System.in);
  int a,b,c=0;
  System.out.println("Enter value of 'a' to be added");
  a=sc.nextInt();
  System.out.println("Enter value of 'b' to be added");
  b=sc.nextInt();
  c=a+b;
  System.out.println("The sum  of"+a+"and"+b+"is"+c);
  }
}
