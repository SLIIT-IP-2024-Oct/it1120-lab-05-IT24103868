import java.util.Scanner;
public class IT24103868Lab5Q2
{
	public static void main(String[] args)
	
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the number of new members introducted: ");
		int members = input.nextInt();
		
		System.out.print("\n");
		
		if (members < 0)
		{System.out.print("Input must be a number 0 or greater");}
	
	    else 
		{
		  switch (members)
          
		  {
			case 0:
			System.out.println("No prize");
			break;
			
			case 1:
			System.out.println("Prize is a : Pen");
			break;
			
			case 2:
			System.out.println("Prize is a : Umbrella");
			break;
			
			case 3:
			System.out.println("Prize is a : Bag");
			break;
			
			case 4:
			System.out.println("Prize is a : Travelling Chair");
            break;

            default:
            System.out.println("Prize is a : Headphone");
            break;
            
		    
		  }		  
		}
		
		
		
		
	}
	
}