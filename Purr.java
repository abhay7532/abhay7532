class Car
{
int wheel;
int stearing;
int gear;
boolean exhaust;

public Car(int w,int st,int ge,boolean ex)
{
this.wheel=w;
this.stearing=st;
this.gear=ge;
this.exhaust=ex;
}

void move()
{
System.out.println(wheel);
}

void functionality()
{
System.out.println(stearing);
System.out.println(gear);
}

void speed()
{
System.out.println(exhaust);
}
}

public class Purr
{
public static void main(String[] args)
{
Car tata =new Car(4,1,5,true);
//tata.wheel=4;
//tata.stearing=1;
//tata.gear=5;
//tata.exhaust=true;
tata.move();
tata.functionality();
tata.speed();
}

}
