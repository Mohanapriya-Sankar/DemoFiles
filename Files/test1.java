import java.util.*;
class test
{
public static void main(String a[])
{
Scanner s=new Scanner(System.in);
int a1[]=new int[10];
for (int i=0;i<10;i++)
{
System.out.println("Enter the Id of the Employee: ");
int Id=s.nextInt();
for(int j=0;j<=i;j++)
{
 if(a1[j]== Id)
{
    continue;
}
if(a1[j] == null)
{
    a1[j]=Id;
}

}
}
for (int i=0;i<10;i++)
{
System.out.println(a1[i]);
}
}
}

