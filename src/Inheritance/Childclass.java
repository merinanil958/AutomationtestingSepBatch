package Inheritance;

public class Childclass extends BaseClass{
	public Childclass()
	{
		System.out.println("Child default Constructor");
	}
	public Childclass(int a,int b)
	{
		System.out.println("child two parameterized Constructor");
	}
	public static void main(String[] args) {
		Childclass obj=new Childclass();//Implicitly calling parent class 
	}

}
