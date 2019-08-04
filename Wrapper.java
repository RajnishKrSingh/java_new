public class Wrapper
{
 public static void main(String[]args)
 {
  Integer i = Integer.valueOf("1010111",2);
  Double d = Double.valueOf("3.14");
  int a = Integer.parseInt("123");
  double b = Double.parseDouble("3.14");
  int c = i.intValue();
  System.out.println("The value of a is " + a);
  System.out.println("The value of b is " + b);
  System.out.println("The value of c is " + c);
 }
}