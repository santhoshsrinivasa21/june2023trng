import java.io.*;
class D11FileRead1{
public static void main(String args[]) throws Exception
{
FileReader fr=new FileReader("D:\\santhosh\\bestfrnd.txt");
BufferedReader br=new BufferedReader(fr);
int i;
while((i=br.read())!=-1)
{
System.out.print((char)i);
}
br.close();
fr.close();
}
}