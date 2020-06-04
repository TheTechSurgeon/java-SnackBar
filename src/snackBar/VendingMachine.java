package snackBar;

public class VendingMachine{
	private static int maxId = 0;
	private int id;
	private String name;

	//create template
	public VendingMachine(String name){
		maxId++;
		this.id = maxId;
		this.name = name;
	}
	//getters
	public int getId(){
		return id;
		
	}
	public String getName(){
		return name;
	}
	//setters
	public void setName(String name){
		this.name = name;
	}


}