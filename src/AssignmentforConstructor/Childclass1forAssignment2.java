
package AssignmentforConstructor;

public class Childclass1forAssignment2 extends Parentclass1forAssignment2{
	public void method1()
	{
		
		System.out.println(" Child default parameterized method");
	}
	public void method2(int a)
	{
		
		System.out.println("Child 1 parameterized method");
	}
	public void method3(int a,int b)
	{
		
		super.m4(10, 20, 30);
		super.m1();
		super.m3(10, 20);
		super.m2(10);
		
		System.out.println("Child 2 parameterized method");
		this.method1();
		this.method4(10, 20, 30);
		this.method2(10);
		
	}
	public void method4(int a,int b,int c)
	{
		
		System.out.println("Child 3 parameterized method");
	}
public static void main(String[] args) {
		
	Childclass1forAssignment2 obj1=new Childclass1forAssignment2();
		obj1.method3(10,20);
				
	}
}
