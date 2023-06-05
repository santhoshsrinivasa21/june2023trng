import java.util.Scanner;
class MaxMin
{
public static void main(String args[]){
int i,j,max,min;
Scanner sc=new Scanner(System.in);
i=sc.nextInt();
j=sc.nextInt();
if(i<j){
System.out.println("i is maximum number");
}
else {
System.out.println("j is maximum number");
}
if(j<i){
System.out.println("i is minimum number");
}
else{
System.out.println("j is minimum number");
}
}
}