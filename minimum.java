import java.util.Scanner;
class min
{


public static void main(String[] args)
{
int ans=mini();
System.out.println("Minimun is="+ans);
}


static int mini()
{
Scanner input=new Scanner(System.in);
System.out.print("size=");
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
return temp;
}

}
