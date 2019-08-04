import java.util.*;
class Box
 {
  Scanner sc= new Scanner(System.in);
  private int length, breadth,height;
  public void setDimension()
   {
    System.out.println("Enter length , breadth and height serially");
    length=sc.nextInt();
    breadth=sc.nextInt();
    height=sc.nextInt();
   }
  public void showDimension()
   {
    System.out.println("Length="+length);
    System.out.println("Breadth="+breadth);
    System.out.println("Height="+height);
   }
 }

public class Example
 {
  public static void main(String[]args)
   {
    Box smallBox=new Box();
    smallBox.setDimension();
    smallBox.showDimension();
    smallBox=new Box();
    smallBox.showDimension();
   }
  }