import java.util.Scanner;
class sum
{
public static void main(String args[])
{
int ans=sum();
System.out.println(ans);

}
static int sum()
{
Scanner input=new Scanner(System.in);
System.out.print("a=");
int a=input.nextInt();
System.out.print("b=");
int b=input.nextInt();
int sum;
sum=a+b;
return sum;
}
}




