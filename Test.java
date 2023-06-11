import java.util.*;
class PolymorphismEx1{
void print()
{
System.out.println("Welcome");
}
void print(String n)
{
System.out.println("Welcome "+n);
}
}
class Test{
public static void main(String args[])
{
PolymorphismEx1 ob1=new PolymorphismEx1();
ob1.print();
Scanner sc=new Scanner(System.in);
System.out.println("Please type your name");
String s=sc.next();
ob1.print(s);
}
}