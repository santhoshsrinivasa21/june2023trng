class Operation{
int square(int n){ 
return n*n;
}}
class circle{
Operation op;
double pi=1.43;
double area(int radius){
op=new Operation();
int rsquare=op.square(radius);
return pi*rsquare;
}
public static void main(String args[]){
circle c=new circle();
double result=c.area(5);
System.out.println(result);
}
}
