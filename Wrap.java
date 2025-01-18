//wap to take inputas a string and return the given string as  a integer value and find that the given value is a //factor of 5


import java.util.Scanner;
class Wrap
{
public static void main(String[] args)
{
Scanner input=new Scanner(System.in);
String n=input.nextLine();
int ans=convo(n);
if(ans%5==0){
System.out.println("yes");
}
else
{
System.out.println("No");
}

}

static int convo(String n)
{
int number = Integer.parseInt(n);
return number;
}


}