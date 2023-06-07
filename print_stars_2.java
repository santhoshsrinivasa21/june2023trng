class print_stars_2
{
public static void Print_multiple_chars(int i,char c) 
{
int k=0;
for(k=1;k<=i;k=k+1)
System.out.println("c");
}
public static void main(String args[])
{
int j=5;
int i=10;
Print_multiple_chars(j,'*');
Print_multiple_chars(i+1,'+');
Print_multiple_chars(j+2,'+');
System.out.print(" ");
}
}
