class Car
{
int wheel;
int stearing;
int gear;
boolean exhaust;

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

public class purr
{
public static void main(String[] args)
{
Car tata =new Car();
tata.wheel=4;
tata.stearing=1;
tata.gear=5;
tata.exhaust=true;
tata.move();
tata.functionality();
tata.speed();
}

}


