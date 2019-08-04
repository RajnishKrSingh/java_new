import java.util.*;
class Acounts
{
 Scanner sc=new Scanner(System.in);
 int AcNumber,Balance;
 static int Rate;
 public void Details()
 {
  System.out.println("Enter Acount NUmber");
  AcNumber=sc.nextInt();
  System.out.println("Enter Balance");
  Balance=sc.nextInt();
 }
 public void showDetails()
 {
  System.out.println("The acount Number is " + AcNumber + " And Balance is " + Balance);
 }
 public static void Status()
 {
  Rate=12;
  System.out.println("The rate is " + Rate); 
 }

static class Bank
{
 public static String BankName="State Bank of India";
}
}

public class Show
{
 public static void main(String[]args)
 {
  Acounts ac=new Acounts();
  ac.Details();
  ac.showDetails();
  Acounts.Status();
  System.out.println("The bank is "+Acounts.Bank.BankName);
}
}
  
