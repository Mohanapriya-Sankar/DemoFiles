class MainClass
{
public static void main(String a[])
{
/*Employee e1=new Employee(101,"Siva");
e.setEid(119);
e.setEname("Yugan");
Employee e2=new Employee(102,"Sivan");

Employee e3=new Employee(103,"Sindhu");
System.out.println(e1.getEid());
System.out.println(e1.getEname());
*/
Manager m=new Manager();
m.setEid(102);
m.setEname("ABC");
m.setDept("Training");
System.out.println(m.getEid());
System.out.println(m.getEname());
System.out.println(m.getDept());


}
}
