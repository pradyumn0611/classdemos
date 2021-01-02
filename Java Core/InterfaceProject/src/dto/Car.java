package dto;
import dao.*;

import java.util.Scanner;

public class Car implements IProducts {
	Scanner sc=new Scanner(System.in);
	int fid;
	String featureName;
	int featurePrice;
	int pid;
	String name;
	String model;
	double price;
	
	
	Car(int fid ,String featureName,int featurePrice,int pid,String name,String model,double price)
	{
		fid=fid;
		featureName=featureName;
		featurePrice=featurePrice;
		pid=pid;
		name=name;
		model=model;
		price=price;
		
		
	}
	public void setDetails()
	{
		
		fid=sc.nextInt();
		System.out.println("enter feature featureName");
		featureName=sc.next();
		System.out.println("enter featurePrice");
		featurePrice=sc.nextInt();
		System.out.println("enter pid");
		pid=sc.nextInt();
		System.out.println("enter name");
		name=sc.next();
		System.out.println("enter model");
		model=sc.next();
		System.out.println("enter Price");
		price=sc.nextInt();
		
	}
	public void getDetails()
	{
		System.out.println(fid);
		System.out.println(featureName);
		System.out.println(featurePrice);
		System.out.println(pid);
		System.out.println(name);
		System.out.println(price);
		
	}

}

