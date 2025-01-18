import java.util.Scanner;
class pall
{
public static void main(String[] args)
{
Scanner input=new Scanner(System.in);
System.out.print("enter number=");
int n=input.nextInt();
int count=0;
while(n!=0)
{
int qu;
qu=n%10;
count=10*count+qu;
n/=10;
}
System.out.println(count);
}
}

