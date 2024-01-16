class man extends emp
{
int sal;
void display(int sal)
{
System.out.println("child class sal"+sal);
}

public static void main(String a[])
{
emp m=new man();
m.display(11);
m.displayid(10000);
}
}