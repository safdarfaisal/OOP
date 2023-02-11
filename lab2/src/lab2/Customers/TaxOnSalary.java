package lab2.Customers;

import java.util.Scanner;


public class TaxOnSalary {
	double salary;
	boolean isPANsubmitted;
	
	TaxOnSalary(boolean PANSubmitted){
		salary = 1000;
		isPANsubmitted = PANSubmitted;
	}
	TaxOnSalary(){
		salary = 0;
		isPANsubmitted = false;
	}
	public void inputSalary(){
		Scanner scanner = new Scanner(System.in);
		double sal = scanner.nextDouble();
		this.salary = sal;
	}
	public double getSalary(){
		return salary;
	}
	public boolean getPANSubmitted(){
		return isPANsubmitted;
	}
	public double calculateTax(){
		if(salary < 180000 && isPANsubmitted){
			return 0;
		} else if (!isPANsubmitted){
			return 0.05*salary;
		} else if(salary < 500000){
			return 0.1*salary;
		} else if(salary < 1000000){
			return 0.2*salary;
		}else {
			return 0.3*salary;
		}
	}
}
