package snackBar;

public class Main{
	public static void workWithData(){

             //   public Customer(String name,double cashHeld){
           //     maxId++;
            //    id = maxId;
          //      this.name = name;       
         //       this.cashHeld = cashHeld;
       // }
        
		Customer c1 = new Customer("mark", 45.25);
        Customer c2 = new Customer("james", 33.14);
        //id name quantity
        VendingMachine v1 = new VendingMachine("Food Vending Machine");
        VendingMachine v2 = new VendingMachine("Drink Vending Machine");
        VendingMachine v3 = new VendingMachine("Office Vending Machine");

        Snack s1 = new Snack(v1.getId(),"Chips", 36, 0.25 );
        Snack s2 = new Snack(v1.getId(),"choco", 36, 1.0 );
        Snack s3 = new Snack(v1.getId(),"nuts", 30, 1.0 );

        Snack s4 = new Snack(v2.getId(),"Sprite", 36, 1.25 );
        Snack s5 = new Snack(v2.getId(),"Water", 36, 1.25 );

        System.out.println("*** Query Data***");
        
        // Customer 1 buys 3 of snack 4. Print Customer 1 Cash on hand. Print quantity of snack 4.
        c1.subtractCashHeld(s4.getCost() * 3);
        s4.buySnack(3);
        System.out.println(c1.getName() + " has " + "$" + c1.getCashHeld() + " left. " + "There are " + s4.getQuantity() + " " + s4.getName() + "s left.");

        // Customer 1 buys 1 of snack 3. Print Customer 1 Cash on hand. Print quantity of snack 3.
        c1.subtractCashHeld(s3.getCost() * 1);
        s3.buySnack(1);
        System.out.println(c1.getName() + " has " + "$" + c1.getCashHeld() + " left. " + "There are " + s3.getQuantity() + " " + s3.getName() + "s left.");

        // Customer 2 buys 2 of snack 4. Print Customer 2 Cash on Hand. Print quantity of snack 4.
        c2.subtractCashHeld(s4.getCost() * 2);
        s4.buySnack(2);
        System.out.println(c2.getName() + " has " + "$" + c2.getCashHeld() + " left. " + "There are " + s4.getQuantity() + " " + s4.getName() + "s left." );

        // Customer 1 finds $10. Print Customer 1 Cash on Hand.
        c1.addCashHeld(10);
        System.out.println(c1.getName() + " finds $10, and now has $" + c1.getCashHeld() + " left.");

        // Customer 1 buys 1 of snack 2. Print Customer 1 Cash on Hand. Print quantity of snack 2.
        c1.subtractCashHeld(s2.getCost() * 1);
        s2.buySnack(1);
        System.out.println(c1.getName() + " has " + "$" + c1.getCashHeld() + " left. " + "There are " + s2.getQuantity() + " " + s2.getName() + "s left.");

        // Add 12 more items to snack 3. Print quantity of snack 3.
        s3.addQuantity(12);
        System.out.println("12 more " + s3.getName() + " have been added. There are now " + s3.getQuantity() + " " + s3.getName() + "s left.");

        // Customer 2 buys 3 of snack 3. Print Customer 2 Cash on hand. Print quantity of snack 3.
        c2.subtractCashHeld(s3.getCost() * 3);
        s3.buySnack(3);
        System.out.println(c2.getName() + " has $" + c2.getCashHeld() + " left. " + "There are " + s3.getQuantity() + " " + s3.getName() + "s left.");

	}
	public static void main(String[] args) {
		workWithData();
			
	}

}

