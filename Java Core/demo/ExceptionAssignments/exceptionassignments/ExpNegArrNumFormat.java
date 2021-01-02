package exceptionassignments;
import java.util.Scanner;

public class ExpNegArrNumFormat {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		int [] testArray;
		int size;
		System.out.println("enter size of array");
		
		try {
			size=scan.nextInt();
			 testArray=new int[size];
			}
		catch(NegativeArraySizeException  | NumberFormatException  n)
		{
			System.out.println("Negative or non numeric value entered as size . Invalid indirection.");
		}
		System.out.println("Correct value entered");
		
	}
 
}
