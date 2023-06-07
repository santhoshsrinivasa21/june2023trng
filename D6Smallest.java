import java.util.Scanner;
public class D6Smallest
{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int i=sc.nextInt();
int j=sc.nextInt();
int k=sc.nextInt();
if(i>j){
System.out.println(i);
}
else if(j<i){
System.out.println(j);
}
else{
System.out.println(k);
}
}
}
