
import java.lang.*;
public class CharAtExample5
{
public static void main(String args[])
{
String str="Welcome to Java portal";
for(int i=0;i<=str.length()-1;i++)
{
if(i%2==0)
{
System.out.println("Char at"+i+"place"+str.charAt(i));
}
}
}
}