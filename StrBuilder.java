import java.lang.*;
public class StrBuilder
{
public static void main(String args[])
{
StringBuilder s1=new StringBuilder("M.S.");
StringBuilder s2=new StringBuilder("Dhoni");
StringBuilder s=s1.append(s2);
System.out.println(s.toString());
}
}