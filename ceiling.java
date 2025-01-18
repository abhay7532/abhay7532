import java.util.Scanner;
class ceil
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

System.out.print("Target=");
int target=input.nextInt();
int ans=search(arr,target);
System.out.println(ans);
}

static int search(int[] arr,int target)
{
int start=0;
int end=arr.length-1;

while(start<=end)
{
int mid;
mid=start+(end-start)/2;
if(target<arr[mid])
{
end=mid-1;
}
else if(target>arr[mid])
{
start=mid+1;
}
else
{
return mid;
}
}
return start;
}

}

