/* Third use of this keyword- Differentiating local and global variable when local and global 
 variable are same*/
package pkg1;

public class Thiskeyword {
	int abc=10;
	public void method1(int abc)
	{
		//abc=abc; //this statement is not possible
		this.abc=abc; // it is able to give the value of local variable to global variable
		System.out.println("Value of global Variable="+ abc);
	}
	
	public static void main(String[] args) {
		Thiskeyword obj=new Thiskeyword();
		obj.method1(2244);
		
	}

}
