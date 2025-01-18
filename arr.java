import java.util.Scanner;
class arr
{
public static void main(String args[])
{
Scanner input=new Scanner(System.in);
int n=input.nextInt();
System.out.print("n=");
int[] arr=new int[n];
for(int i=0;i<n;i++)
{
arr[i]=input.nextInt();
}
for(int i=0;i<n;i++)
{
System.out.println(arr[i]);
}
}
}