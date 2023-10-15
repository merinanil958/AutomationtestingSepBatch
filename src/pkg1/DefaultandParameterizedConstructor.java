package pkg1;

public class DefaultandParameterizedConstructor {
	public DefaultandParameterizedConstructor() {
		System.out.println("Default Constructor");
	}
	public DefaultandParameterizedConstructor(int a) {
		System.out.println("Single parameterized Constructor");
	}
	public DefaultandParameterizedConstructor(int a,int b) {
		System.out.println("Two Parameterized Constructor");
	}
	public DefaultandParameterizedConstructor(int a,int b,int c) {
		System.out.println("Three Parameterized Constructor");
	}
	
	public static void main(String[] args) {
		DefaultandParameterizedConstructor obj=new DefaultandParameterizedConstructor();
		DefaultandParameterizedConstructor obj1=new DefaultandParameterizedConstructor(22);
		DefaultandParameterizedConstructor obj2=new DefaultandParameterizedConstructor(22,33);
		DefaultandParameterizedConstructor obj3=new DefaultandParameterizedConstructor(22,33,44);
	}

}
