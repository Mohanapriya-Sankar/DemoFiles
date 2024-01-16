package test;
class AccessDemo
{
    public String publicStr="public";
    protected String protectedStr="Protected";
    private String privateStr="private";
    String defaultStr="Default";

    public static void main(String a[])
    {
        AccessDemo d= new AccessDemo();
        System.out.println(d.publicStr);
        System.out.println(d.privateStr);
        System.out.println(d.protectedStr);
        System.out.println(d.defaultStr);
        }
}
class AccessDemo1
{
    public static void main(String a[])
    {
    AccessDemo d1=new AccessDemo();
    
    System.out.println(d1.publicStr);
    //System.out.println(d1.privateStr);
    System.out.println(d1.protectedStr);
    System.out.println(d1.defaultStr);
    }

}