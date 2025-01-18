import java.util.Scanner;
class tuhai
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
}

int ans=peak(arr);
System.out.println("Max index is:"+ans);
}

static int peak(int[] arr)
{
int start=0;
int end=arr.length-1;
while(start<end)
{
int mid=start+(end-start)/2;
if(arr[mid]>arr[mid+1])
{
end=mid;
}

else
{
start=mid+1;
}
}
return start;
}
}