package dto;


public class App {

	public static void main(String[] args) {
		Car c=new Car(3,"accessories",30000,1,"wegon r","vxi",600000);
		System.out.println("enter feature id");
		c.setDetails();
		c.getDetails();

	}

}
