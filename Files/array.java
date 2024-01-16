import java.util.*;
class array
{
public static void main(String a[])
{
// Scanner s=new Scanner(System.in);
// int arr[]=new int[10];
// List<Integer>list=new ArrayList<Integer>();
// for(int i=0;i<10;i++)
// {
// int n=s.nextInt();
// arr[i]=n;
// list.add(n);
// }
// //List<Integer>list=new ArrayList<Integer>();
// //list.add(arr[i]);
// list.remove(2);
// int arr2[]=new int[10];
// for(int i=0;i<list.size()-1;i++){
//     arr2[i]=list.get(i);
//     System.out.println(arr2[i]);
//     }
//     }
// }
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
List<Integer> list=new ArrayList<Integer>();
for(int i=0;i<n;i++){
    int temp=sc.nextInt();
    list.add(temp);
}
System.out.println("Before aa");
for(int i=0;i<n;i++)
{
    System.out.print(list.get(i)+" ");
}
list.remove(1);
System.out.println();
System.out.println("After");
for(int i=0;i<list.size();i++)
{
    System.out.print(list.get(i)+" ");
}
}
}