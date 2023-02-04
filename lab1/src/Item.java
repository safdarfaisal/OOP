

public class Item {
	String itemName;
	String itemIdNo;
	int itemQuantity;
	double itemPrice;
	
	Item(String name, String idNo, int quantity, double price){
		itemName = name;
		itemIdNo = idNo;
		itemQuantity = quantity;
		itemPrice =  price;
	}
	Item(String name, String idNo){
		itemName = name;
		itemIdNo = idNo;
		itemPrice = 500;
		itemQuantity = 1;
	}
	Item(String name, String idNo, int quantity){
		itemName = name;
		itemIdNo = idNo;
		itemQuantity = quantity;
		itemPrice = 500;
	}
	public String getName(){
		return itemName;
	}
	public String getIdNo(){
		return itemIdNo;
	}
	public int getQuantity(){
		return itemQuantity;
	}
	public double getPrice(){
		return itemPrice;
	}
	public void setName(String name){
		itemName = name;
	}
	public void setIdNo(String idNo){
		itemIdNo = idNo;
	}
	public void setPrice(double price){
		itemPrice = price;
	}
	public void setQuantity(int quantity){
		itemQuantity = quantity;
	}
	
}

