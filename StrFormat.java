import java.lang.*;
public class StrFormat
{
public static void main(String args[])
{
String s1=new String("M.S.");
String s2=new String("Dhoni");
String s=String.format("%s%s",s1,s2);
System.out.println(s.toString());
}
}