package Assignmentforscannerclass;

import java.util.Scanner;

public class ScannerclassExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner obj=new Scanner(System.in);
   
   System.out.println("Enter the interge value "); 
   int a=obj.nextInt();
    System.out.println("The interger value is: "+a);
	
    System.out.println("Enter the Float value ");
	Float f=obj.nextFloat();
    System.out.println("The float value is:"+f);
    
    System.out.println("Enter the String value ");
    String s=obj.next();
    System.out.println("The STring value: "+s);
    
	}
}
