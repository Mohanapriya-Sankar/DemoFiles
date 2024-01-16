import java.util.*;
class delete 
{
    public static void main(String []args)

{
Scanner s=new Scanner(System.in);
int d=s.nextInt();
int ar[]={1,2,3,4,5,6,0,7,8,9};
int ar1[]=new int[9];
int j=0;
for (int i=0;i<ar.length;i++)
{
if(ar[i]==d)
{
continue;
}
ar1[j]=ar[i];
j++;
}
for(j=0;j<(ar.length-1);j++)
{
System.out.println(ar1[j]+ " ");
}
}
}


