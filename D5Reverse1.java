import java.util.Scanner;
class SumDigits
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int k;
int sd=0;
System.out.println("Enter the positive integer:");
k=sc.nextInt();
while(k>0)
{
sd=sd+k%10;
n=n/10;
}
System.out.println(sd);
}
}