
import dao.*;

import java.util.Scanner;

public class PizzaApp2 implements PizzaConstants {
 	
		
		//pizza name taken as number for order
		public static int pizzaNumber;
		//pizza size taken as number for order
		public static int pizzaSize;
		//pizza crust taken as number for order
		public static int pizzaCrust;
		//pizza topping price
		public static int pizzaToppingPrice;
		//pizza crust price
		public static int crustPrice;
		//pizza topping selection
		public static String pizzaTopping;
		//veg on non veg topping
		public static String vegNonVeg;
		//type of topping
		public static String toppingType;
		//no of pizza you wanna order
		public static int numOfOrders;
		//topping number of veg topping
		public static int vegToppingNum;
		//pizza price of perticular name and size
		public static int priceNameSize;
		//topping number of non veg topping
		public static int nonVegToppingNum;


		//main method
		public static void main(String args[])
		{
			Scanner sc =new Scanner(System.in);
			System.out.println(" ------------------------------------------");
			System.out.println("||||||||||:)WELCOME TO YASH PIZZA :)||||||||");
			System.out.println("||BEST PIZZA MAKERS IN THE TOWN SINCE 1996||)");
			System.out.println(" -------------------------------------------");
			System.out.print("Our Speciality : |Delux Veggie||Veg extravaganza||Idli Tandoori Paneer||Farmhouse||Peppy Paneer||Mexican Green Wave|");



			System.out.println("\n Enter No of Pizzas You wanna order =");
			numOfOrders=sc.nextInt();

			int finalBill=0;
			for(int i=0;i<numOfOrders;i++)
			{		
				//array for return values form order pizza
				int pizzaArray[]=new int[3];

				//calling pizza order method for pizza details
				pizzaArray=pizzaOrder();


				//returned array values
				pizzaNumber=pizzaArray[0];
				pizzaSize=pizzaArray[1];
				pizzaCrust=pizzaArray[2];


				//velidating details with validSelections method
				validSelections(pizzaNumber,pizzaSize,pizzaCrust);


				//default toppings
				defaultOptions();


				//change toppings if you need
				customiseOptions();

				//selection of topping type
				System.out.println("Press (D :Default toppings/C :Customise)");
				toppingType=sc.next();

				//getting pizzaToppingPrice that you chose
				pizzaToppingPrice=pizzaToppingType(toppingType);

				//final bill generation through various methods
				finalBill=finalBill+pizzaNameSize(pizzaNumber,pizzaSize)+crust(pizzaCrust)+pizzaToppingPrice;
			}

			System.out.println("You Order Ammount is  Rs."+finalBill+" \\-");
		}

		//method for pizza order details filled by the user

		public static int[] pizzaOrder()

		{ 
			int pizzaOrderArray[]=new int[3];
			Scanner sc=new Scanner(System.in);
			System.out.println("PIZZAS AVAILABLE FOR ORDER :"); 
			System.out.print("1.delux veggie  2.veg extravaganza  3.idli tandoori paneer  4.farmhouse  5.peppy paneer  6.mexican green wave  ");
			System.out.println("Enter Pizza  for order: (reply in numbers)");
			pizzaNumber=sc.nextInt();


			System.out.println("Enter pizza size: 1.Regular 2.Medium 3,Large");
			System.out.println("\nEnter Pizza SizeNumber for order:(reply in numbers) ");
			System.out.println("Enter size of pizza : ");
			pizzaSize=sc.nextInt();

			System.out.println("1.new hand tosted 2.cheese burst 3.fresh pan pizza 4.classic hand tosted 5.wheat thin crust");
			System.out.println("\nEnter Pizza Crust Number for order: (reply in numbers)");
			System.out.println("Enter the crust:");
			pizzaCrust=sc.nextInt();
			pizzaOrderArray[0]=pizzaNumber;
			pizzaOrderArray[1]=pizzaSize;
			pizzaOrderArray[2]=pizzaCrust;
			return pizzaOrderArray;
		}

		//method for validating selections

		private static void validSelections(int pizzaNumber,int pizzaSize,int pizzaCrust)
		{
			if(pizzaNumber<1||pizzaNumber>6||pizzaSize<1||pizzaSize>3||pizzaCrust<1||pizzaCrust>5)
			{ 
				System.out.println("Invalid pizza , size  , crust or topping type. Please try again");
				System.exit(0);
			}
			if((pizzaNumber==5 && pizzaSize==2)||(pizzaNumber==5 && pizzaSize==3))
			{
				System.out.println("Selected Pizza Unavailable . Please Try Again");
				System.exit(0);
			}
		}

		//method to show user the default pizza toppings 

		public static void defaultOptions() {
			System.out.println(" ---------------------------------------------------------------------------------------------------------------------");
			System.out.println("\n\nDefault Toppings : \n\nDelux Vegie          : |  Onion  |  Capsicum  |  Grilled Mushroom  |  Corn  |  Paneer  |                                    |");
			System.out.println("\nVeg Extravaganza     : |  Black Olives  |  Capsicum  |  Onions  |  Grilled Mushroom  |  Corn  |"
					+ "  \n Tommato  |  Jalapeno  |  Extra Cheese  |");
			System.out.println("\nIdli Tandoori Paneer : |  Capsicum  |  red pepranda  |  mint mayo  |    ");
			System.out.println("\nFarmhouse            : |  Onion  | Capsicum | Tommato | Grilled Mushroom  |  ");
			System.out.println("\nPeppy Paneer         : | Juicy Paneer | Crisp Capsicum | Spicy Red Peprenka |  ");
			System.out.println("\nMexican Green Wave   : |Mexican herbs|Onion|Capsicum|  Tommato | Jalapeno | ");
			System.out.println(" ------------------------------------------------------------------------------------------------------------------");
		}

		//customise topping options
		public static void customiseOptions()
		{	System.out.println(" ------------------------------------------------------------------------------------------------------------------");
		System.out.println("\n\n VEG TOPPINGS = \n\n|jalapeno | black olives | onion |red peparenka |fresh tommato|golden corn|"
				+ "\n|crisp capsicum|paneer|grilled mashroom|paneer tikkka");
		System.out.println(" ------------------------------------------------------------------------------------------------------------------");
		System.out.println("\n\n NON VEGTOPPINGS= \n\npepper barbeque chiken|peri peri chiken|grilled  |chicken rasher|"
				+ "\n|chicken sausage|chicken tikka|checken keema\n\n");
		System.out.println(" ------------------------------------------------------------------------------------------------------------------");
		}

		//type : default or custom topping
		private static int pizzaToppingType(String type)
		{
			if(type.equalsIgnoreCase("D"))
			{
				pizzaToppingPrice=0;

			}
			else if(type.equalsIgnoreCase("C"))
			{
				pizzaCustomiseToppings();
			}
			else
			{
				System.out.println("INVALID SELECTION OF TOPPING TYPE. TRY AGAIN");
				System.exit(0);
			}
			return pizzaToppingPrice;
		}

		//custom selection of order
		private static int pizzaCustomiseToppings()
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("press(V/N) for (veg/non veg)Toppings");
			vegNonVeg=sc.next();
			if(vegNonVeg.equalsIgnoreCase("V"))
			{
				pizzaToppingPrice=pizzaCustomiseVegToppings();	
			}
			else if(vegNonVeg.equalsIgnoreCase("N"))
			{	
				pizzaToppingPrice=pizzaCustomiseNonVegToppings();
			}
			else
			{
				System.out.println("Invalid Selection.Please TRy again");
				System.exit(0);
			}
			return pizzaToppingPrice;
		}

		//method for customised pizza toppings
		private static int pizzaCustomiseVegToppings()
		{
			Scanner sc= new Scanner(System.in);
			System.out.println("Veg Toppings : @ Rs.60 each & at max 3 selections");
			System.out.println("Enter no of toppings you need");
			vegToppingNum=sc.nextInt();
			String[] toppingsArray=new String[vegToppingNum];
			if(vegToppingNum>0 && vegToppingNum<=3)
			{
				for(int i=0;i<vegToppingNum;i++)
				{
					System.out.println("1.Jalapeno 2.Black olives 3.onion 4.Fresh tommato 5.Red pepranka"
							+ "\n 6.Golden corn 7.crisp capsicum 8.paneer 9.Grilled masheroom 10.paneer tikka");
					System.out.println("Enter topping number: ");
					toppingsArray[i]=sc.next();

				}
				pizzaToppingPrice=vegToppingNum*60;
			}
			return pizzaToppingPrice;

		}

		//method for non veg custom pizzas
		private static int pizzaCustomiseNonVegToppings()
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Veg Toppings : @ Rs.75 each & at max 3 selections");

			System.out.println("Enter no of toppings you need");
			nonVegToppingNum=sc.nextInt();

			String[] toppingsArray=new String[nonVegToppingNum];
			if(nonVegToppingNum>0 && nonVegToppingNum<=3)
			{for(int i=0;i<nonVegToppingNum;i++)
			{

				System.out.println("Enter 1.panner barbeque 2.chicken 3.peri peri chiken 4.grilled chiken rasher"
						+ "\n 5.chicken sausage 6.chikken tikka 7.chicken peparoni 8.chicken keema");
				System.out.println("Enter topping number: ");

				toppingsArray[i]=sc.next();

			}
			pizzaToppingPrice=nonVegToppingNum*75;

			}
			return pizzaToppingPrice;

		}

		//method for getting price of perticulat name size of pizza
		private static int pizzaNameSize(int pizzaNumber,int pizzaSize)
		{
			if((PIZZAS[pizzaNumber].equals("delux veggie")&&pizzaSize==1)||(PIZZAS[pizzaNumber].equals("veg extravaganza")&&pizzaSize==1)||(PIZZAS[pizzaNumber].equals("idli tandoori paneer")&&pizzaSize==1))
			{
				priceNameSize=DELUX_IDLI_VEG_REGULAR;

			}
			else if((PIZZAS[pizzaNumber].equals("delux veggie")&&pizzaSize==2)||(PIZZAS[pizzaNumber].equals("veg extravaganza")&&pizzaSize==2)||(PIZZAS[pizzaNumber].equals("idli tandoori paneer")&&pizzaSize==2)) 
			{
				priceNameSize=DELUX_IDLI_VEG_MEDIUM;
			}
			else if((PIZZAS[pizzaNumber].equals("delux veggie")&&pizzaSize==3)||(PIZZAS[pizzaNumber].equals("veg extravaganza")&&pizzaSize==3)||(PIZZAS[pizzaNumber].equals("idli tandoori paneer")&&pizzaSize==3))
			{

				priceNameSize=DELUX_IDLI_VEG_LARGE;


			}

			else if(
					(PIZZAS[pizzaNumber].equals("farmhouse")&&pizzaSize==1)||(PIZZAS[pizzaNumber].equals("mexican green wave")&&pizzaSize==1))//215
			{
				priceNameSize=FARMHOUSE_MEXICAN_RAGULAR;

			}
			else if((PIZZAS[pizzaNumber].equals("farmhouse")&&pizzaSize==2)||(PIZZAS[pizzaNumber].equals("mexican green wave")&&pizzaSize==2))//395
			{
				priceNameSize= FARMHOUSE_MEXICAN_MEDIUM;

			}
			else if(
					(PIZZAS[pizzaNumber].equals("farmhouse")&&pizzaSize==3)||
					(PIZZAS[pizzaNumber].equals("delux veggie")&&pizzaSize==3))
			{
				priceNameSize=FARMHOUSE_MEXICAN_LARGE;}//595
			else if(
					(PIZZAS[pizzaNumber].equals("mexican green wave")&&pizzaSize==1))//335
			{
				priceNameSize= PEPPY_RAGULAR;
			}
			return priceNameSize;
		}


		//method for getting price of a particular crust


		private static int crust(int pizzaCrust)
		{
			if( CRUSTS[pizzaCrust].equalsIgnoreCase("new hand tosted") || CRUSTS[pizzaCrust].equalsIgnoreCase("classic hand tosted") )
			{
				crustPrice=NEW_HAND_CLASSIC_CRUST;
			}
			if(CRUSTS[pizzaCrust].equalsIgnoreCase("cheese brust"))
			{
				crustPrice=CHEESE_CRUST;
			}

			if(CRUSTS[pizzaCrust].equalsIgnoreCase("fresh pain pizza"))
			{
				crustPrice=FRESH_CRUST;
			}
			if(CRUSTS[pizzaCrust].equalsIgnoreCase("wheat thin crust"))
			{
				crustPrice=WHEAT_CRUST;
			}
			return crustPrice;


		}

	


}
