package snackBar;

public class Customer{
	private static int maxId = 0;
	private int id;
	private String name;
	private double cashHeld;
	public Customer(String name,double cashHeld){
		maxId++;
		id = maxId;
		this.name = name;	
		this.cashHeld = cashHeld;
	}
	public int getId(){
		return id;
	} 

	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}

	public double getCashHeld(){
		return cashHeld;
	}
	public void addCashHeld(double cashToAdd){
		this.cashHeld =  this.cashHeld+cashToAdd;
	}
	public void subtractCashHeld(double cashToSubtract){
		this.cashHeld = this.cashHeld- cashToSubtract;
	}

	

}