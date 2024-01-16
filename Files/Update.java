package assignment;
class Update
{
public void main()
{
Scanner s=new Scanner(System.in);
for (int i=0;i<10;i++)
{
System.out.println("Enter the Id of the Employee: ");
int Id=s.nextInt();
a1[i]=Id;

System.out.println("Enter the Name of the Employee: ");
String Name=s.next();
a2[i]=Name;

System.out.println("Enter the Salary of the Employee: ");
int Salary=s.nextInt();
a3[i]=Salary;
}
}
}