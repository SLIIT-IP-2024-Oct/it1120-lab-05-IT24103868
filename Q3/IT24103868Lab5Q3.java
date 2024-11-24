import java.util.Scanner;

public class IT24103868Lab5Q3
{
	public static void main(String[] args)
	{   
	
	    final double chargePerDay =	48000.00 ;
		int reservedDates = 0 ;
		
		
		Scanner input = new Scanner(System.in);
		
	
		
		System.out.print("Enter start date (1-31): ");
		int startDate = input.nextInt();
		
	
		
		System.out.print("Enter end date (1-31): ");
		int endDate = input.nextInt();
		
		if (startDate < 1 || startDate > 31 || endDate < 1 || endDate >31)
		{System.out.print("Days must be between 1 and 31.");
		return ;
		}
		
		else if (startDate >= endDate)
		{System.out.print("Start date must be less than End date.");
	    return ;
		}
    
	
	
		
		else
		{reservedDates = endDate - startDate ;
	    System.out.print("Number of days reserved: "+reservedDates);
		}
		
		System.out.print("\n");
		
	
	   
	    System.out.print("Room charge per day : Rs. 48000.00/=" );	
		
	
		
		double discount;
		
		if (reservedDates >= 5)
		{discount = 0.2; }
	
	    else if (reservedDates >=3 && reservedDates <= 4)
		{discount = 0.1; }	
		
		else 
		{discount = 0.0; }	
	
	

		
		double Amount;
		
	    Amount = ((chargePerDay*reservedDates)*(1 - discount));
		
		System.out.print("\n");
	    System.out.print("Amount to be paid: "+ Amount); 
		
    }
}
