package Inheritance;

public class ChildClassExplicitcall extends BaseClass{
	public ChildClassExplicitcall()
	{
		
		System.out.println("Child default Constructor");
	}
	public ChildClassExplicitcall(int a,int b)
	{
		super();//Explicitly calling child class
		System.out.println("child two parameterized Constructor");
	}
	public static void main(String[] args) {
		Childclass obj=new Childclass(44,50);
	}
}
