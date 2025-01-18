//Find first and last position in sorted array
//input: nums:[5,7,7,8,8,10],target=8
//Output:[3,4]

//if target not found return -> not found
//input: nums:[5,7,7,8,8,10],target=6
//Output:[-1,-1]


import java.util.Scanner;
class index
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
int p;
p=ans+1;
if(ans==-1)
{
System.out.print("["+"-1"+","+"-1"+"]");
}
else
{
System.out.print("["+ans+",");
System.out.print(p+"]");
}

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
return -1;
}

}




