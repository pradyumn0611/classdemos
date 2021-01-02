package abstractpakage;

public abstract class Products {
	int pid;
	String productName;
	String model;
	double price;
	abstract void setDetails();//needs to be overridden
	 
	
	 Products()
	{
		System.out.println("product invoked");
	}
	Products(int pid,String productName,String model,double price)
	{
		this.pid=pid;
		this.productName=productName;
		this.model=model;
	}
	
	 public void getDetails()
	 {
		 System.out.println(pid);
		 System.out.println(productName);
		 System.out.println(model);
		 System.out.println(price);
		 
	 }
	//it can have main method too. But instance should not be created
}
