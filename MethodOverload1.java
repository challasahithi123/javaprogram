class MethodOverload1
{
	public void add(int ...a)
	{
		int count=0;
		for(int b:a)
		{
			count+=b;
		}
		System.out.println("count:"+count);
	}
	
}

