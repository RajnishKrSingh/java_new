package Pack1;
import java.util.*;
public class Student
 {
  Scanner sc=new Scanner(System.in);
  private int rollNo;
  String Name;
  public void setRoll()
   {
    System.out.println("Enter your roll number");
    rollNo=sc.nextInt();
   }
   
  public void setName()
   {
    System.out.println("Enter your name");
    Name=sc.next();
   }
 
  public void getRoll()
   {
    System.out.println("The roll number is "+rollNo);
   }
  
  public void getName()
   {
    System.out.println("The name is "+Name);
   }
 }
