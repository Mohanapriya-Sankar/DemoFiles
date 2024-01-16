import java.util.*;
class attendance
{
String students;
attendance(String students)
{
this.students=students;
}
public void attendancedetails(attendance...students)
{
System.out.println("No. of students present " +students.length);
for (attendance n:students)
{
System.out.println(n);
}
}
public static void main(String a[])
{
Scanner sc=new Scanner(System.in);

attendance arr[]=new attendance[5];
for(int i=0;i<5;i++)
{
String students=sc.next();
attendance o=new attendance(students);
arr[i]=o;
}
arr[1].attendancedetails(arr);
}
}




