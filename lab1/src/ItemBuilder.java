
public class ItemBuilder{
	String name;
	String idNo;
	int quantity;
	double price;
	
	ItemBuilder(){
		name = "notSet";
		idNo = "-1";
		quantity = 0;
		price = 0;
	}
	
	public void setName(String name){
		this.name = name;
	}
	public void setId(String idNo){
		this.idNo= idNo;
	}
	public void setQuantity(int quantity){
		this.quantity = quantity;
	}
	public void setPrice(double price){
		this.price = price;
	}
	
//	public Item build(){
//		return Item(name, idNo, price ,quantity);
//	}
	
}