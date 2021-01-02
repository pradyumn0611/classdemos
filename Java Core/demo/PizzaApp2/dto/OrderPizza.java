package dto;
import dao.*;

import java.util.Scanner;

 public abstract class OrderPizza {
	//variables can be public static final or non final or non static
	//methods can abstract and non abstract
	
	public  int nonVegToppingNum;
	protected abstract void validSelections(int pizzaNumber,int pizzaSize,int pizzaCrust);
	protected abstract int pizzaToppingType(String type);
	protected  abstract int pizzaCustomiseToppings();
	protected  abstract int pizzaCustomiseVegToppings();
	protected  abstract  int pizzaNameSize(int pizzaNumber,int pizzaSize);
	protected  abstract int pizzaCustomiseNonVegToppings();
	protected abstract int bill(int basePrice,int crustPrice,int toppingPrice);
	public abstract int[] pizzaOrder();
	public abstract void defaultOptions();
	public abstract void customiseOptions();
	protected abstract int crust(int pizzaCrust);
}