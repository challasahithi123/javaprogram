class ExeMethodoverloading
{
	public static void main(String args[])
	{
		Methodoverload m=new Methodoverload();
		int res1=m.add(10); //System.out.println(m.add(10));
		String res2=m.add(10,"sai");
		int res3=m.add(10,20,30);
		System.out.println("Res1:"+res1);
		System.out.println("Res2:"+res2);
		System.out.println("Res3:"+res3);
	}
}
