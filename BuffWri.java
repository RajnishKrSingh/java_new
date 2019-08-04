import java.io.*;
public class BuffWri
{
 public static void main(String[] args) throws IOException
 {
  FileWriter fw= new FileWriter("./BufWriNewFile.txt",true);
  BufferedWriter br= new BufferedWriter(fw);
 String s="India";
  br.write(s);
  br.close();
}
}