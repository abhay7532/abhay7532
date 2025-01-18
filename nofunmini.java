import java.util.Scanner;

class manu
{
public static void main(String[] args)
{
System.out.print("size=");
Scanner input=new Scanner(System.in);
int n=input.nextInt();
int[] arr=new int[n];
for(int i=0;i<n;i++)
{
arr[i]=input.nextInt();
}
int temp=arr[0];
for(int i=1;i<n;i++)
{
if(arr[i]<temp)
{
temp=arr[i];
}
else
{

}
}
System.out.println(temp);
}
}

