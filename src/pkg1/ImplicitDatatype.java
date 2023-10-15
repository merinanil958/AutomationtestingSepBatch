package pkg1;

public class ImplicitDatatype {
	
	public void method1(int a)
	{
		a= a+10;
		System.out.println(a);
	}

	public static void main(String[] args) {
		int a=10;
		float f;
		f=a;  //Implicit data type conversion 
		System.out.println(a);
		System.out.println(f);
		ImplicitDatatype obj=new ImplicitDatatype();
		obj.method1((int)122.44F);
		obj.method1(2333);
	}

}
