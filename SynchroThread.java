import java.util.*;
class Accounts
{
 private int bal;
  
  public Accounts(int bal)
   {
    this.bal=bal;
   }
  
  public boolean isSufficientBalance(int w)
   {
    if(bal>w)
        return(true);
    else
        return(false);
   } 
 
  public void withdrawl(int amt)
   {
    bal=bal-amt;
    System.out.println("The Withdrawl Amount is "+amt);
    System.out.println("The Current Balance is "+bal); 
   }
}

class Customer implements Runnable
{
 private Accounts accounts;
 private String name;
 
 public Customer(Accounts accounts,String n)
 {
  this.accounts=accounts;
  name=n;
 }

 public void run()
 {
  Scanner sc= new Scanner(System.in);
  
  synchronized(accounts)
  {
   System.out.println( name + ":Enter Amount to be withdrawn");
   int amt=sc.nextInt();
  
   if(accounts.isSufficientBalance(amt))
   {
    System.out.println(name);
    accounts.withdrawl(amt);
   }
   else
    System.out.println("Insufficient Balance");
  }
 }
}

public class SynchroThread
{
  public static void main(String[] args)
  {
   Accounts a= new Accounts(5000);
   Customer c1= new Customer(a,"Rajnish");
   Customer c2= new Customer(a,"Manish");
   Thread t1= new Thread(c1);
   Thread t2= new Thread(c2);
   t1.start();
   t2.start();
  }
}