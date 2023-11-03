package AssignmentforConstructor;

public class Childclass1forAssignment1 extends Parentclass1forAssignment1{
	public Childclass1forAssignment1()
	{
		this(10,20,30);
		System.out.println("Child default parameterized constructor");
	}
	public Childclass1forAssignment1(int a)
	{
		this();
		System.out.println("Child 1 parameterized constructor");
	}
	public Childclass1forAssignment1(int a,int b)
	{
		super(10,20);
		System.out.println("Child 2 parameterized constructor");
		
	}
	public Childclass1forAssignment1(int a,int b,int c)
	{
		this(10,20);
		System.out.println("Child 3 parameterized constructor");
	}
	
	public static void main(String[] args) {
		
		Childclass1forAssignment1 obj1=new Childclass1forAssignment1(10);
		
				
	}

}
