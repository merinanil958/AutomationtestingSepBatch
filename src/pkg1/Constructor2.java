/* second use of this keyword- for calling one method to another .In this we can write more than 
 one this statement in a method and we can write this statement anywhere in the method*/
package pkg1;

public class Constructor2 {
	public void method1 ()
	{
		
	System.out.println(" Default method");
	}
	public void method2 (int a)
	{
		
	System.out.println(" One parameterized method");
	}
	public void method3 (int a,int b)
	{
		this.method4(22,33,44);
		this.method1();
		this.method2(22);
		this.method5(22,33, 44, 55);
	System.out.println(" Two parameterized method");
	}
	public void method4 (int a,int b,int c)
	{
		
	System.out.println(" Three parameterized method");
	}
	public void method5 (int a,int b,int c,int d)
	{
	System.out.println(" Four parameterized method");
	}
	public static void main(String[] args) {
		Constructor2 obj=new Constructor2();
		obj.method3(22,33);
	}

}
