package Hasarelationship;
import pkg1.ClassA;//import class in another another package
public class ClassC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			ClassA obj=new ClassA();//Has a relationship- calling the method of another class in different  package
			obj.m1();
			obj.m2();
			int Result=obj.abc=233;
			System.out.println("Value of abc:"+Result);
		
	}

}
