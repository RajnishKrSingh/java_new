import java.io.*;
public class FileFOS
{
 public static void main(String[] args) throws IOException
 {
  int i;
  FileOutputStream f= new FileOutputStream("./fileMy.txt",true);
  String s="Rajnish";
  char ch[]=s.toCharArray();
  for(i=0;i<s.length();i++)
  {
   f.write(ch[i]);}
   f.close();
  
 }
}