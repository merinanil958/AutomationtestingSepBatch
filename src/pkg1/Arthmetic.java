package pkg1;

public class Arthmetic {
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
	int sumresult1=merin.sum(10,2);
	  System.out.println("sumresult1="+ sumresult1);
	int sumresult2=merin.sum(sumresult1,2);
	 System.out.println("sumresult2="+ sumresult2);
    int subresult=merin.sub(sumresult2,2);
    System.out.println("subresult="+ subresult);
    int mulresult=merin.mul(subresult,2);
    System.out.println("mulresult="+ mulresult);
    float divresult=merin.div(mulresult, 2);
    System.out.println("the result of expression=> ((((10+2)+2)-2)*2)/2)="+ divresult);
}
}
