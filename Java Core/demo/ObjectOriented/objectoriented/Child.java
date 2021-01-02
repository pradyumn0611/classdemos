package objectoriented;

public class Child extends ObjectOriented {
	String address;
	Child()
	{}
	Child(String address,String houseType, String locality,String owner,String contractType)
	{
		super(address,houseType,locality,owner,contractType);
		
		
	}
	void getDetails()
	{
		
	}

	public static void main(String[] args) {
		Child c=new Child("Indore","flat","city","aman","full");
		Child child[]=new Child[5];//array of objects
		child[0]=new Child("Indore","flat","city","aman","full");
		child[1]=new Child("pune","flat","city","aman","full");
		child[2]=new Child("mumbai","flat","city","aman","full");
		child[3]=new Child("dehli","flat","city","aman","full");
		child[4]=new Child("new york","flat","city","aman","full");
		System.out.println(c.address);
		System.out.println(c.houseType);
		System.out.println(c.locality);
		System.out.println(c.owner);
		System.out.println(c.contractType);
		
		

	}

}
