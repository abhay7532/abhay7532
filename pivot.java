import java.util.Scanner;
class ror
{
public static void main(String[] args)
{
Scanner input=new Scanner(System.in);
System.out.print("size=");
int n=input.nextInt();
int[] arr=new int[n];
for(int i=0;i<n;i++)
{
arr[i]=input.nextInt();
int ans=pivot(arr);
System.out.print(ans);
}
}


static int pivot(int[n] arr)
{
int start=0;

int end=arr.length-1;

for(int i=0;i<n;i++)
{
int mid=start+(end-start)/2;
if(mid>mid+1)
{
return mid;
}
else
{
continue;
}

}
}
}


//static int search1(int ans)
//{
//int start=0;
//int end=arr.length-1;
//while(start<mid)
//{
//int tar=start+(end-start)/2;


