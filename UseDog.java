class UseDog
{
public static void main(String args[])
{
Dog d=new Dog();
d.name="lucky";
d.color="white";
d.breed="labro";
d.cost=20000;
d.legs=4;
System.out.println(d.name);
System.out.println(d.color);
System.out.println(d.breed);
System.out.println(d.cost);
System.out.println(d.legs);
d.eat();
d.bark();
}
}
