package abstractpakage;
import java.util.Scanner;
public class Mobile extends Products{
	Scanner sc=new Scanner(System.in);
	String mfd;
	Mobile(int pid,String productName,String model,int price)
	{
		super(pid,productName,model,price);
		
	}

	
	void setDetails()
	{
		System.out.println("Enter pid");
		pid=sc.nextInt();
		System.out.println("Enter product name");
		productName=sc.next();
		System.out.println("Enter model");
		model=sc.next();
		System.out.println("Enter price");
		price=sc.nextInt();
		
		
		
	}
	
	
}
