public class MultipleCatchBlock5{
public static void main(String args[]){
try{
int a[]=new int[5];
a[5]=60/0;
}
catch(ArithmeticException e){
System.out.println("common task completed");}
catch(ArrayIndexOutOfBoundsException e){
System.out.println("task 1 is completed");}
catch (Exception e){
System.out.println("task 2 is completed");}
System.out.println("rest of the code");
}
}