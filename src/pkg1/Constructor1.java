/* first use of this keyword- with the help of this keyword we can call from one constructor to another. 
 We can't write more than one this statement inside a constructor and this will be the first statement*/
package pkg1;

public class Constructor1 {
	public Constructor1() {
		this(22,33,44);
	System.out.println("Default Constructor");
	}
	public Constructor1(int a) {
		this();
		System.out.println("Single parameterized Constructor");
		}
	public Constructor1(int a,int b) {
		this(22,33,44,55);
		System.out.println("Two parameterized Constructor");
		}
	public Constructor1(int a,int b,int c) {
		System.out.println("Three parameterized Constructor");
		}
	public Constructor1(int a,int b,int c,int d) {
		this(22);
		System.out.println("four parameterized Constructorr");
		}
	public static void main(String[] args) {
		Constructor1 obj=new Constructor1(22,33);
	}
}
