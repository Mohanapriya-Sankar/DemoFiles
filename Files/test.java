package test;
class Demo
{
public String publicStr="Public";
protected String protectedStr="Protected";
private String privateStr="Private";
String defaultStr="Default";
public static void main(String a[])
{
Demo d=new Demo();
System.out.println(d.publicStr);
System.out.println(d.protectedStr);
System.out.println(d.privateStr);
System.out.println(d.defaultStr);
}
}

class AccessDemo1
{
    public static void main(String a[])
    {
        AccessDemo d1=new AccessDemo();
        System.out.println(d1.publicStr);
        System.out.println(d1.protectedStr);
        //System.out.println(d1.publicStr);
        System.out.println(d1.defaultStr);

    }
}

