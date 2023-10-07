package pkg1;

public class student {
int rollNo,age;
public void display1()
{
	System.out.println("Welcome to all of you");
}
public void display2() {
	System.out.println("Automation is very easy");
}
public static void main(String[] args) {
	student abc=new student();
	abc.display1();
	abc.display2();
	abc.age=25;
	abc.rollNo=12;
	
	System.out.println(abc.age);
	System.out.println(abc.rollNo);
}
}
