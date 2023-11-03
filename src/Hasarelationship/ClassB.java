package Hasarelationship;

public class ClassB {
	public static void main(String[] args) {
		ClassA obj=new ClassA();//Has a relationship- calling the method of another class in same package
		obj.m1();
		obj.m2();
		int Result=obj.abc=233;
		System.out.println("Value of abc:"+Result);
	}

}
