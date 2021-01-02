package exceptionassignments;
import java.util.Scanner;

public class IndexTest {

	public static void main(String[] args) {
		String[] testArray= {"Rohit","Shikhar","Virat","Shreyas","kl","rishabh","Hardik","Ravindra","yuzvendra","jasprit"};
		int testIndex;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter index to display name");
		testIndex=sc.nextInt();
		try
		{
			System.out.println(" Your element is"+testArray[testIndex]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("your entered index is invalid");
			System.out.println("It should be between 0 and "+(testArray.length-1));
		}
	}

}
