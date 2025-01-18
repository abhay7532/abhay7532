import java.util.Scanner;

class nemo
{
public static void main(String[] args)
{
System.out.print("n=");
Scanner input=new Scanner(System.in);
int n=input.nextInt();
int[] arr=new int[n];
for(int i=0;i<n;i++)
{
arr[i]=input.nextInt();
}
System.out.print("Enter searching element");
int p=input.nextInt();
int count=0;
for(int i=0;i<n;i++)
{


if(arr[i]==p)
{
count++;
}
else
continue;

}
System.out.println(count);
if(count>0)
{
System.out.println("Found");
}
else
{
System.out.println("not found");
}
}

}




