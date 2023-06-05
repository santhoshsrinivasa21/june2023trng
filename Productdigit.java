import java.util.Scanner;
class Productdigit
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int s;
int pd=1;
System.out.println("Enter the positive integer:");
s=sc.nextInt();
while(s>0)
{
pd=pd*(s%10);
s=s/10;
}
System.out.println(pd);
}
}