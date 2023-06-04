
import java.util.Scanner;
public class test4
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
int inc=sc.nextInt();
String str="";
for(int i=0;i<=num;i=i+inc)
{
str=str+i+",";
System.out.print(str);
}
}
}