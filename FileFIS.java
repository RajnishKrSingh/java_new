import java.io.*;
public class FileFIS
{
 public static void main(String[] args) throws IOException
 {
  int i;
  FileInputStream fis=new FileInputStream("E:/JavaNew/fileMy.txt");
  do{
     i=fis.read();
     if(i!=-1)
      System.out.println((char)(i));
     }while(i!=-1);
}
}