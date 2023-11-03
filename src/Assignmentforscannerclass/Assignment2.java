//SOlve the expression ->(((((x1*x2)-x3)+x4)-x5)/x6)
package Assignmentforscannerclass;

import java.util.Scanner;

import pkg1.Arthmetic;

public class Assignment2 {
	public int sum(int a,int b)
	{
		return (a+b);
	}
	public int sub(int a,int b)
	{
		return (a-b);
	}
	public int mul(int a,int b)
	{
		return (a*b);
	}
	public float div(int a,int b)
	{
		return (a/b);
	}
	public static void main(String[] args) {
		Arthmetic merin= new Arthmetic() ;
		
		 Scanner obj=new Scanner(System.in);
		   
		   System.out.println("Enter the  value of X1"); 
		   int X1=obj.nextInt();
		   System.out.println("Enter the  value of X2"); 
		   int X2=obj.nextInt();
		   System.out.println("Enter the  value of X3"); 
		   int X3=obj.nextInt();
		   System.out.println("Enter the  value of X4"); 
		   int X4=obj.nextInt();
		   System.out.println("Enter the  value of X5"); 
		   int X5=obj.nextInt();
		   System.out.println("Enter the  value of X6"); 
		   int X6=obj.nextInt();
		   
		   
		   
		int mulresult1=merin.mul(X1,X2);
		  System.out.println("mulresult1="+ mulresult1);
		int subresult2=merin.sub(mulresult1,X3);
		 System.out.println("subresult2="+ subresult2);
	    int sumresult=merin.sum(subresult2,X4);
	    System.out.println("sumresult="+ sumresult);
	    int subresult=merin.sub(sumresult,X5);
	    System.out.println("subresult="+ subresult);
	    float divresult=merin.div(subresult, X6);
	    System.out.println("the result of expression=> (((((x1*x2)-x3)+x4)-x5)/x6)="+ divresult);
	}
}
