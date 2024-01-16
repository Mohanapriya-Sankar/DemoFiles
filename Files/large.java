package edu.training.ems;
class MainClass
{
public static void main(String a[])
{
Employee e=new Employee();
e.setEid(101);
e.setName("Name");
e.setSalary(100000);

System.out.println(e.getEid());
System.out.println(e.getName());
System.out.println(e.getSalary());

System.out.println(e);
}
}


