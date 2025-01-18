import java.util.Scanner;
class pe
{
public static void main(String[] args)
{
Scanner input=new Scanner(System.in);
int n=input.nextInt();
boolean z=multiple(n);
System.out.println(z);
}

static boolean multiple(int n)
{
if(n%4==0)
{
return true;
}
else
{
return false;
}

}
}
