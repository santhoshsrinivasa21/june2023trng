import java.util.*;
public class Program205{
public static void main(String args[]){
System.out.println("Enter your name:");
Scanner sc=new Scanner(System.in);
String n=sc.next();
char ch=n.charAt(5);
System.out.println("Welcome"+n+ch);
}
}