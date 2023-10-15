package pkg1;

public class LocalandGlobalVariables {
	int globalVariable=3;
	public void method1()
	{
		globalVariable=globalVariable+1;
		 System.out.println("Value of global Variable="+ globalVariable);
	}
	public void method2()
	{
		int localvariable;
		localvariable=globalVariable+2;
		System.out.println("Value of Local Variable="+ localvariable);
	}
	public static void main(String[] args) {
		LocalandGlobalVariables obj= new LocalandGlobalVariables();
		obj.method1();
		obj.method2();
	}

}
