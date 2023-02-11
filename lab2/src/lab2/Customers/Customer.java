package lab2.Customers;


public class Customer {
	String name;
	String idNo;
	double balance;
	Item item;
	
	Customer(String name, String idNo, double balance){
		this.name = name;
		this.idNo = idNo;
		this.balance = balance;
		item = null;
	}
	Customer(String name, String idNo){
		this.name = name;
		this.idNo = idNo;
		this.balance = 5000;
		item = null;
	}
	
	public String getName(){
		return name;
	}
	public String getIdNo(){
		return idNo;
	}
	public double getBalance(){
		return balance;
	}
	public Item getItem(){
		return item;
	}
	public void setName(String name){
		this.name = name;
	}
	public void setIdNo(String idNo){
		this.idNo = idNo;
	}
	public void print(){
		if(item != null){
			System.out.println(item.getName());
			System.out.println(item.getIdNo());
			System.out.println(item.getPrice());
			System.out.println(item.getQuantity());
			System.out.println(balance - item.getPrice());
		}
	}
	public void buyItem(Item item){
		if(item.getQuantity() < 1){
			System.out.println("Order is not valid");
		}
		else if(item.getPrice() > balance){
			System.out.println("Insufficient Balance");
		} else {
			this.item = item;
			item.setQuantity(item.getQuantity() - 1);
			System.out.println("Current Balance: " + balance);
			print();
			balance -= item.getPrice(); 
		}
	}
}
