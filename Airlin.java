import java.util.Scanner;
class Airlin
{
public static void main(String[] args)
{
Scanner input=new Scanner(System.in);
System.out.print("Size=");
int n=input.nextInt();
int[] arr=new int[n];
for(int i=0;i<n;i++)
{
arr[i]=input.nextInt();
}
System.out.print("Target element =");
int target=input.nextInt();
int ans=linear(arr,target);
if (ans == -1)
{
System.out.println("Element not found");
} 
else 
{
System.out.println("Element found: " + ans);
}

}

static int linear(int[] arr,int target)
{


for(int i=0;i<arr.length;i++)
{
if(arr[i]==target)
{
return i;
}
}
return -1;
}
}