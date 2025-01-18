import java.util.Scanner;
class Bubbquee
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
int max=arr[0];
int min=arr[0];
int one=min(arr,n,min);
int two=max(arr,n,max);
int diff;
diff=two-one;
System.out.println("Max-Min ="+diff);

}


static int max(int[] arr,int n,int max)
{
for(int i=1;i<n;i++)
{

if(arr[i]>max)
{
max=arr[i];
}
}
return max;
}


static int min(int arr[],int n,int min)
{
for(int i=1;i<n;i++)
{

if(arr[i]<min)
{
min=arr[i];
}
}
return min;
}


}




