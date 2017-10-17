package Restaurent;

public class Tablereserve  {
	list<table> available Tables = new list<table>();
	list<table> occupiedtables = new list<table>();
	Dictionary<int, Reservation> reservation = new Dictionary<int,Reservation>();
	public int Reserve(int size , int type, int count,Datetime dt, Customer c)
	{
	}
	public bool cancelReservation(int ReservationId)
	{
	}
}
class Table{
		int size,type;
}
class Reservation
{
		int id;
		datetime dt;
		int count;
}
class Customer
{
		string name;
		int age;
}
