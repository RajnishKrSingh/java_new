import java.io.*;
public class BuffRea
{
 public static void main(String[] args) throws IOException
 {
  FileReader fr= new FileReader("./BufWriNewFile.txt");
  FileReader fr1= new FileReader("./fileNew.txt");
  BufferedReader br= new BufferedReader(fr);
  BufferedReader br1= new BufferedReader(fr1);
  int ch;
  while((ch=br.read())!=-1)
  {
   System.out.print((char)ch);
  }
char []ss=new char[20];
br.read(ss,3,15);
System.out.println(ss);
  br.close();
  String s;
  while((s=br1.readLine())!=null){System.out.println(s);}
  br1.close();
 }
}