import java.io.*;
public class FileNew
{
 public static void main(String[]args) throws IOException
 {
  File f1= new File("E:/JavaNew/fileNew.txt");
  f1.createNewFile();
  System.out.println("The file size is "+ f1.length());
  System.out.println("The name of file is "+ f1.getName());
 }
}