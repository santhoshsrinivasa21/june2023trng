// java program to demonstrate the use of static variable
class Student{
int rollno;
String name;
static String college="MTIET";
Student(int r,String n){
rollno=r;
name=n;
}
void display()
{
System.out.println(rollno+" "+name+" "+college);
}
}
public class Teststatic1{
public static void main(String args[]){
Student s1=new Student(537,"prasad");
Student s2=new Student(526,"santhu");
Student.college="MTIET";
s1.display();
s2.display();
}
}