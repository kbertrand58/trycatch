package trycatch;
import java.util.Scanner;
public class methods {
	
	public static void loopingsum()
	{
		 double number;  
		    double sum;     
		    int count;      
		    sum = 0;
		    count = 0;
		    try {
		    	Scanner input=new Scanner(System.in);
		       while (count<99) { 
		           number = input.nextDouble();
		           count++;  
		           sum += number;
		       }
		    }
		    catch ( IllegalArgumentException e ) {
		
		    System.out.println();
		    System.out.println("Number of data values read: " + count);
		    System.out.println("The sum of the data values: " + sum);
		    if ( count == 0 )
		       System.out.println("Can't compute an average of 0 values.");
		    else
		       System.out.println("The average of the values:  " + (sum/count));
		 }	      		       
		 }
	public static void divisionzero()
	{
		Scanner object=new Scanner(System.in);
		int a;
		int b=0;
		a=object.nextInt();
		try
		{
		 int c = a / b;   
		}
		catch (ArithmeticException e)
		{
		 System.out.println("Can't do that!");
		}		
	}	   public static void main(String[] args) 
	   {
		methods fx=new methods();
		   fx. loopingsum ();
           fx.divisionzero();
	   }
	


}
