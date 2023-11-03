/* Assignment1 without using this and super keyword and without using method- output should be in the order 
 parent 3 parameterized constructor
 parent 1 parameterized constructor
 parent default parameterized constructor
 parent 2 parameterized constructor
 Child 2 parameterized constructor
 Child 3 parameterized constructor
 Child default parameterized constructor
 Child 1 parameterized constructor
 
 */
package AssignmentforConstructor;

public class Parentclass1forAssignment1 {
	public Parentclass1forAssignment1()
	{
		this(20);
		System.out.println(" parent default parameterized constructor");
	}
	public Parentclass1forAssignment1(int a)
	{
		this(20,30,40);
		System.out.println("parent 1 parameterized constructor");
	}
	public Parentclass1forAssignment1(int a,int b)
	{
		this();
		
		
		System.out.println("parent 2 parameterized constructor");
	}
	public Parentclass1forAssignment1(int a,int b,int c)
	{
		
		System.out.println("parent 3 parameterized constructor");
	}

}
