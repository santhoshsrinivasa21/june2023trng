Accesing first and last character by using charAt method.
import java.lang.*;
public class CharAtExample3
{
public static void main(String args[])
{
String str="Welcome to Java Training";
int strLength=str.length();
System.out.println("Character at 0 indexis:"+ str.charAt(0));
System.out.println("character at last index is:"+str.charAt(strLength-1));
}
}