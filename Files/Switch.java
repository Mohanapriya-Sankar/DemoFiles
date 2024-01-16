import java.util.*;
class name
{
public static void main(String a[])
{
int Result;
Scanner s=new Scanner (System.in);
int n1=s.nextInt();
int n2=s.nextInt();
String op=s.next();
switch(op)
{
case "+" :
Result=n1+n2;
System.out.println("Result is: " +Result);
break;
case "-":
Result=n1-n2;
System.out.println("Result is: " +Result);
break;
case "*":
Result=n1*n2;
System.out.println("Result is: " +Result);
break;
case "/":
Result=n1/n2;
System.out.println("Result is: " +Result);
break;
case "%":
Result=n1%n2;
System.out.println("Result is: " +Result);
break;
default :
System.out.println("Arithmetic operator not found");
}
}
}



