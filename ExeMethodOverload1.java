class ExeMethodOverload1
{
	public static void main(String args[])
	{
		MethodOverload1 m=new MethodOverload1();
		m.add(10);
		System.out.println("---------");
		m.add(10,100);
		System.out.println("---------");
		m.add(10,100,20);
		System.out.println("---------");
		m.add(10,100,20,40);
}
}
