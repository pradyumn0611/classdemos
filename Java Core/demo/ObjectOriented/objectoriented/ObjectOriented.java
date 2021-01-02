package objectoriented;
import java.util.Scanner;
//oops implementation of construction of your house
public class ObjectOriented {// class shows encapsulation
	//state of object is shown by variables
	ObjectOriented()
	{
		//default constuctor
		
	}
	//parametarised constructor
	ObjectOriented(String address,String HouseType, String locality,String owner,String contractType)
	{
		//this points to current object
		
		//generally used when formal and actual parameters are same
		this.address=address;
		this.houseType=HouseType;
		this.locality=locality;
		this.owner=owner;
		this.contractType=contractType;
		
	}
	
	
	String address;
	String houseType;
	String locality;
	String owner;
	String contractType;
	
	
	//behavior of object by methods
	void setDetails()//setter method
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Address");
		address=sc.nextLine();
		System.out.println("Enter  HouseType ");
		 houseType=sc.nextLine();
		System.out.println("Enter locality");
		locality=sc.nextLine();
		System.out.println("Enter owner name");
		owner=sc.nextLine();
		System.out.println("Enter contract type");
		contractType=sc.nextLine();
		
		
	}
	void getDetails()//getter method
	{
		System.out.println("Address is "+address);
		System.out.println("HouseType is "+houseType);
		System.out.println("locality is "+locality);
		System.out.println("owner is "+owner);
		System.out.println("contractType is "+contractType);
	}
	
	
	
	
	

}
