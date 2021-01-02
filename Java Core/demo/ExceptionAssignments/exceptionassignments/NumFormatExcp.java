package exceptionassignments;
import java.util.Scanner;


public class NumFormatExcp {
	

		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			String s;
			double d;
			System.out.println("Enter value to be parsed to double");
			s=sc.next();
			try
			{
				d=Double.parseDouble(s);
				System.out.println("your double parsed string is "+d);
				
			}
			catch(NumberFormatException a)
			{
				System.out.println(" invalid string format\nThe string  must be in floating point format");
			}

		}}
