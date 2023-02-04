
public class TestTax {
	public static void main(String[] args){
		TaxOnSalary tax1 = new TaxOnSalary(true);
		TaxOnSalary tax2 = new TaxOnSalary();
		System.out.println("tax1");
		tax1.inputSalary();
		System.out.println("tax2");
		tax2.inputSalary();
		System.out.println(tax1.calculateTax());
		System.out.println(tax2.calculateTax());
	}
}
