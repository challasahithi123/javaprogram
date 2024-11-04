class Employee2
{
	private int id;
	private String name;
	private int age;
	private String branch;
	private static String clgname="siiet";
	 public Employee2()
	 {
		 System.out.println("Employee with zero parameter constructor");
		 
}
public Employee2(int id,String name){
	this();
	this.id=id;
	this.name=name;
	System.out.println("Employee with two parameters constructor");
	System.out.println(id+"\t"+name);
}
	public Employee2(int id,String name,int age,String branch){
		this(3,"nani");
		this.id=id;
		this.name=name;
		this.age=age;
		this.branch=branch;
	System.out.println("Employee with four parameters constructor");
	System.out.println(id+"\t"+name +"\t"+age+"\t"+branch);
	}
} 
		
