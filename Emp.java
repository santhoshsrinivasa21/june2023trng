class Emp{
int id;
String name;
Address address;
public Emp(int id,String name,Address address)
{
this.id=id;
this.name=name;
this.address=address;
}
void display()
{
System.out.println(id+" "+name);
System.out.println(address.city+" "+address.state+" "+address.country);
}
public static void main(String args[]){
Address address1=new Address("palamaner","AP","india");
Address address2=new Address("vellore","TN","india");
Address address3=new Address("chennai","TN","india");
Emp e1=new Emp(123,"santhu",address1);
Emp e2=new Emp(143,"mani",address2);
Emp e3=new Emp(167,"nari",address3);
e1.display();
e2.display();
e3.display();
}
}