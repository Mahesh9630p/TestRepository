package Restaurent;

public class billamount{
  

 	private static final double Cgst=0.12;        //12% tax on the bill
	private static final double Sgst=0.05;        //5% tax on the bill

	public static void main(string[] arg)  {

		double bill,Sgst,Cgst,Total bill;     //declaring the variables
		scanner sc=new scanner(system.in);

  		system.out.println("enter bill");
		bill = sc.nextdouble;
		Cgst = getCgst(bill);
		Sgst = getSgst(bill);
		Total bill = getTotalbill(bill,Cgst,Sgst);

		displaybillActual(bill,Cgst,Sgst,Totalbill);

	}

	static double getCgst(double bill) {
		return bill*Cgst;
	}s
	
	static double getSgst(double bill) {
		return bill*Sgst;
	}

	static double getTotalbill(double bill,double Cgst,double Sgst) {
		return bill+Cgst+Sgst;
	}
	
	static void displaybillActual(double bill,double Cgst,double Sgst) {

		system.out.println("BILL AMOUNT");
		system.out.println("BILL........." +bill);
		system.out.println("TAX Cgst....." +Cgst);
		system.out.println("TAX Sgst....." +Sgst);
		system.out.println("...................");
		system.out.println("Total Bill...."+Total Bill);
	}
}