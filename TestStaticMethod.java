class Student{
int rollno;
String name;
static String college="MTIE";
static void change(){
college="MTIEAT";
}
Student(int r,String n){
rollno=r;
name=n;
}
void display(){System.out.println(rollno+" "+name+" "+college);
}}
public class TestStaticMethod{
public static void main(String args[]){
Student.change();
Student s1=new Student(526,"nari");
Student s2=new Student(537,"mani");
Student s3=new Student(555,"santhu");
s1.display();
s2.display();
s3.display();
}
}