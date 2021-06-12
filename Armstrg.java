import java.util.Scanner;
import java.lang.Math;
public class Armstrg
{
	public static void main(String[] args) 
	{
    int i=1, q=0;
    double x=0, p=0, r=0, m=0;
    Scanner scan=new Scanner(System.in);   //creating object scan
	   System.out.print("Enter the number : ");
	   int n= scan.nextInt();
    q=n/10;
    while(q!=0)  // to count number of digits
    {
       q=q/10;
       i++;  
    }
    	m=n;   //convert the datatype of n by storing into m of type double
	   for(p=i-1;p>=0;p--)
	   {
	      x=(int)( (m/(Math.pow(10,p))) );  //extracting a digit
	      r+=Math.pow(x,3);                 //cubing it and adding
	      m=(int)( m%(Math.pow(10,p)) );    //extracting the remaining digits
	   }
	   
	   if(r==n)
	     System.out.print(n+" is an Armstrong number");
	   else
	     System.out.print(n+" is not an Armstrong number");
	   
	}
}
