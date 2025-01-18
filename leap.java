import java.util.Scanner;
class year
{
public static void main(String[] args)
{
Scanner input=new Scanner(System.in);
System.out.print("enter year=");
int n=input.nextInt();
if ((n % 400 == 0 || n % 100 != 0) && (n % 4 == 0))
{
System.out.println("leap year");
}
else
{
System.out.println("not leap year");
}
}
}