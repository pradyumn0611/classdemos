package demos;
import java.util.Scanner;

public class Mystring {
	public static String concatination(String s1,String s2)
	{
		return s1+s2;
	}

	public static void main(Mystring[] args) {
		Scanner sc =new Scanner(System.in);
		String name="Pradyumn Joshi";
		String company="yash technologies";
		String concatedString=concatination(name,company);
		System.out.println(concatedString);
	}

}
