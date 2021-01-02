package jaggedarray;
import java.util.Scanner;

public class JaggedArray {

	public static void main(String[] args) {
		//creating a 2d jagged array of 2 rows 
		//2 rows
		int[][] arr=new int[2][];
		//1st row has 3 columns
		arr[0]=new int[3];
		arr[1]=new int[2];
		for (int i=0;i<arr.length;i++)
		{
			
				for(int j=0;j<arr[i].length;j++)
				{
					System.out.print(j);
				}
			System.out.println();	
		}

	}

}
