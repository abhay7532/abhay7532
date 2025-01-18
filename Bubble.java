import java.util.Scanner;
class Bubble
{
public static void main(String[] args)
{
Scanner input=new Scanner(System.in);
int p=input.nextInt();

int[] arr=new int[p];
for(int i=0;i<p;i++)
{
arr[i]=input.nextInt();
}
sort(arr,p);
}


static void sort(int[] arr,int p)
{
for(int i=0;i<arr.length;i++)
{
for(int j=0;j<p-i-1;j++)
{
if(arr[j]>arr[j+1])
{
int temp;
temp=arr[j];
arr[j]=arr[j+1];
arr[j+1]=temp;

}
}
}

for(int i=0;i<arr.length;i++)
{
System.out.println(arr[i]);
}
}
}
