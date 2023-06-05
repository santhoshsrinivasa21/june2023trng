import java.util.Scanner;
class Reversedigit
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int s;
int rd=0;
System.out.println("Enter the positive integer:");
s=sc.nextInt();
while(s>0)
{
rd=rd*10+(s%10);
s=s/10;
}
System.out.println(rd);
}
}