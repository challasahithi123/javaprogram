class MainOverloading
{
public static void main(int a)
{
	System.out.println("a: "+a);
}
public static void main(int a,int b)
{
	int sum=a+b;
	System.out.println("sum: "+sum);
}
public static void main(float a,float b)
{
	float mul=a*b;
	System.out.println("mul: "+mul);
}
public static void main(String[] a)
{
	main(10);
	main(10,20);
	main(10.0f,12.5f);
}
}

