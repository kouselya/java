import java.util.*;
 class Laptop{
float price;
String name;
int ram;
public Laptop(int ram,String name,float price)
{
this.ram=ram;
this.name=name;
this.price=price;
}}
public static void main(String[] args)
{
Laptop l1=new Laptop(64,"hP",66.5);
Laptop l1=new Laptop(32,"Dell",66);
Laptop l1=new Laptop(32,"Lenovo",77.5);
ArrayList<Laptop> ar=new ArrayList<Student>();
ar.add(l1);
ar.add(l2);
ar.add(l3);
Iterator<Laptop>itr=ar.iterator();
while(itr.hasNext()){
Laptop t=itr.next();
System.out.println("brand"+t.name+"cost"+t.price+"RAM"+t.ram);
}
}