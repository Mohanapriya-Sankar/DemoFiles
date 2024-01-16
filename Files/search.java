import java.util.*;
class search extends Assignment
{
public void main()
{
Scanner s=new Scanner(System.in);
int e=s.nextInt();
for(int i=0;i<e;i++)
{
if(a1[i]==e)
{
System.out.println("The element is found in " +(i+1));
break;
}
else
{
System.out.println("Element not found");
}
}
}
}
