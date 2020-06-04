package snackBar;

public class Snack{
	private static int maxId = 0;
	private int id;
	private String name;
	private int quantity;
	private double cost;
	

	public Snack( int id,String name,int quantity,double cost){
	maxId++;
	this.id = maxId;
	this.name =name;
	this.quantity =quantity;
	this.cost =cost;

	}
	//getters
	public int getId(){
		return id;
	}
	public String getName(){
		return name;
	}

	public int getQuantity(){
		return quantity;
	}
	public double getCost(){
		return cost;
	}
	public int get(){
		return id;
	}
	//setters

	public void setName(String name){
		this.name = name;
	}

	

	public void setCost(double cost){
		this.cost = cost;
	}
	//others
	public int addQuantity(int amountToAdd){
		return this.quantity = this.quantity + amountToAdd;
	}
	//decrease cash on hand 
	//decrease quantity
	//cannot pass 0?
	public int buySnack(int amountToBuy){
		return this.quantity = this.quantity - amountToBuy;
	}

	public double displayCostOfPurchase(double cost, int amountToBuy){
		return this.cost * amountToBuy;	
	}






}