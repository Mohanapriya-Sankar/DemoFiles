import java.util.*;
class great
{
    public static void main(String a[])
    {
        Scanner s=new Scanner(System.in);
        int n1=s.nextInt();
        int n2=s.nextInt();
        int n3=s.nextInt();
        int n4=s.nextInt();
        int n5=s.nextInt();
        if (n1>n2 && n1>n3 && n1>n4 && n1>n5)
        {
            System.out.println("The Greatest Number is : " +n1);
        }
        else if (n2>n3 && n2>n4 && n2>n5)
        {
            System.out.println("The Greatest Number is : " +n2);
        }
        else if (n3>n4 && n3>n5)
        {
            System.out.println("The Greatest Number is : " +n3);
        }
        else if (n4>n5)
        {
            System.out.println("The Greatest Number is : " +n4);
        }
        else
        {
             System.out.println("The Greatest Number is : " +n5);
        }
    }
}