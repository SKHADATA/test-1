package PracticeFinal;

import java.util.Scanner;

class Pizza
{
	 String pizzabase;
	 int price;
	
	Pizza(String pizzabase, int price)
	{
		this.pizzabase = pizzabase;
		this.price = price;
	}
	void display()
	{
		System.out.println(pizzabase + " " + price);;
	}
}

class ChickenPizza extends Pizza
{
	String cvariable = "Chicken Toppings";
	ChickenPizza(String pizzabase, int price)
	{
		super(pizzabase,price);
	}
	void display()
	{
		System.out.println(pizzabase + " " + price + " " + cvariable );
	}
}

class MuttonPizza extends ChickenPizza
{
	String pizzabase;
	int price;
	String flavouredtopping = "Mutton Topping";
	MuttonPizza (String pizzabase, int price)
	{
		super(pizzabase,price);
	}
	void display()
	{
		System.out.println(pizzabase +" "+ price +" "+ flavouredtopping );
	}
}

public class Pizzahut
{
	public static void main(String[] args){
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Choose option");
		System.out.println("1 for Simple pizza");
		System.out.println("2 for Chicken pizza");
		System.out.println("3 for Mutton pizza");
		int option = scn.nextInt();
		
		if(option==1)
		{
			Pizza pz = new Pizza("food",200);
			pz.display();
		}
		else if(option==2)
		{

			Pizza pz1 = new ChickenPizza("food",210);
			pz1.display();
			
		}
		else if(option==3)
		{
			ChickenPizza pz2 = new MuttonPizza("food",270);
			pz2.display();
		}
		else
		{
			System.out.println("Wrong input");
		}
	}
	
}
