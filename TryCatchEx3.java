class TryCatchEx3{
public static void main(String args[])
{
try{
int data=50/0;
System.out.println("rast of the code");
}
catch(ArithmeticException e)
{
System.out.println(e);
}
}
}