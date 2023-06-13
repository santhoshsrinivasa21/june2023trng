import java.util.*;
class AgeDoesNotFitException extends Exception{
String msg;
AgeDoesNotFitException(String args[])
{
super(msg);
this.msg=msg;
}
public String toString()
{
return msg;
}
}
class Main{
public static void main(String args[]){
Scanner sc=new Scanner(System.in(;
int age=sc.nextInt();
try{
if(age<18)
{
}
}
catch(AgeDoesNotFitException ex){
System.out.println(ex);

System.out.println(ex.getMessage());
}
}
}