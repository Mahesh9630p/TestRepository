package Restaurent;

import java.utl.scanner;
public class menu  {
public double subtotal;
public static double runningtotal;
private static double itemprice;
static boolean ordering = true;
static Scanner input = new Scanner(system.in);

public static void menu()  {
	system.out.println("welcome\n chicken biryani($120)\n veg biryani($100)\n Roti($10)\n coca cola($35)\n done");
}
public static double itemprice(int fooditem)  {
	if (fooditem ==1)  {
		system.out,println("you have ordered a Chicken biryani");
		itemprice=120;
		}
	if (fooditem ==2)  {
		system.out,println("you have ordered a veg biryani");
		itemprice=100;
		}
	if (fooditem ==3)  {
		system.out.println("you have ordered a Roti");
		itemprice=10;
		}
	if (fooditem ==4)  {
		system.out,println("you have ordered a coca cola");
		itemprice=35;
		}
		quantity();
		return itemprice;
}
public static double quantity()  {
		system.out.println("enter quantity");
		double quantity= input.nextdouble();
		subtotal(quantity,itemprice);
		return quantity;
}
public static double subtotal(double quantity,double itemprice)  {
		double subtotal =quantity*itemprice;
		system.out.println("Subtotal:"+subtotal);
		runningtotal+=subtotal;
		return total;
}
public static void done()  {
		ordering =false;
		system.out.println("running total");
		system.out.println("Enjoy your order");
}
public static void main(string[] args)  {
		int menuoption;
		int fooditem=0;
		input = new sacnner(system.in);
do{
	double runningtotal=0;
	menu();
	menuoption = input.nextint();
	switch(menuoption) {
		case 1:
			fooditem = 1;
			itemprice(fooditem);
			break;
		case 2:
			fooditem = 2;
			itemprice(fooditem);
			break;
		case 3:
			fooditem = 3;
			itemprice(fooditem);
			break;
		case 4:
			fooditem = 4;
			itemprice(fooditem);
			break;
		case 5:
			done();
			break;
			default:
				system.out.println("Sorry,Not Available");
		}
}
		while(orderoing);{
}
}
}


		









	