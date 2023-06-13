import java.io.FileNotFoundException;
import java.io.PrintWriter;
class TryCatchEx10{
public static void main(String args[])
{
PrintWriter pw;
try{
pw=new PrintWriter("sat.txt");
pw.println("saved");
}
catch(FileNotFoundException e)
{
System.out.println(e);
}
System.out.println("File saved Successfully");
}
}
