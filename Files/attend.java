import java.util.*;
class attend
{
String students;
attend(String students)
{
this.students=students;
}
public void attenddetails(attend...students)
{
System.out.println("No. of students present " +students.length);
for (attend n:students)
{
System.out.println(n);
}
}
public String toString()
{
return students;
}
public static void main(String a[])
{
Scanner sc=new Scanner(System.in);

attend arr[]=new attend[5];
for(int i=0;i<5;i++)
{
String students=sc.next();
attend o=new attend(students);
arr[i]=o;
}
arr[1].attenddetails(arr);
}
}




