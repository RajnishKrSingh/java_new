import java.util.*;
public class ExceptionHandling
{
 public static void main(String[] args)
 {
  Scanner sc=new Scanner(System.in);
  double balance,withDrawl;
  double currentBalance=0;
  System.out.println("Enter Balance");
  balance=sc.nextDouble();
  System.out.println("Enter withdrawl Amount");
  withDrawl=sc.nextDouble();
  try{
      if(withDrawl>balance)
      throw new ArithmeticException("Insufficient Balance");
      currentBalance=(balance-withDrawl);
      System.out.println("The Current Balance is " + currentBalance);
     }
  catch(ArithmeticException e)
     {
      System.out.println("Exception: "+ e.getMessage());
     }
  finally
     {
      System.out.println("I have understood the basic concept of exception handling");
     }
 }
}