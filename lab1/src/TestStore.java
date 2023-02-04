
public class TestStore {
	public static void main(String[] args){
		Customer firstCust = new Customer("Sally",  "001", 4269.0);
		Item firstItem = new Item("Hello", "001", 5, 423.4);
		Item secondItem = new Item("World", "110", 1, 3124.4);
		firstCust.buyItem(firstItem);
		firstCust.buyItem(firstItem);
		firstCust.buyItem(firstItem);
		firstCust.buyItem(firstItem);
		firstCust.buyItem(secondItem);
	}
}
