public class CmdLAdd
 {
  public static void main(String []args)
   {
    int s=0;
    for(int i=0;i<args.length;i++)
     {
      s=s+Integer.parseInt(args[i]);
     }
    System.out.println("The Sum of given arguments is " +s);
   }
  }