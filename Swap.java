import java.util.Scanner;
class Swap
{
public static void main(String[] args)
{
Scanner input=new Scanner(System.in);
System.out.print("a=");
int a=input.nextInt();
System.out.print("b=");
int b=input.nextInt();
int tem;
tem=a;
a=b;
b=tem;
System.out.println("a="+a);
System.out.println("b="+b);
}
}

