import java.util.Scanner;
class vie
{
public static void main(String[] args)
{
Scanner input=new Scanner(System.in);
int n=input.nextInt();
int p=per(n);
System.out.println(n);
}

static int per(int n)
{
int i=0;
while(i*i<=n)
{
if(i*i==n)
{
return i;
}
i++;
return -1;
}

}
}
