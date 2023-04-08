package testBank;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BankIO {

	public BankIO() {
		// TODO Auto-generated constructor stub
	}
	public static void readFile(String filename, Bank bank){
		Scanner fileReader;
		/*
		 * Initializes Scanner with a try catch block
		 */
		try{
			fileReader = new Scanner(new File(filename));
			if(fileReader.hasNext()){
				int accountNumber = 0;
				double accountBalance = -1;
				accountNumber = fileReader.nextInt();
				accountBalance = fileReader.nextDouble();
				try{
				BankAccount newAcc = new BankAccount(accountBalance, accountNumber);
				bank.add(newAcc);
				} catch(Exception e){
					System.out.println(e);
				}
			}
		} catch(FileNotFoundException e){
			System.out.println(e);
		}
		
	}
	public static BankAccount readAccount(Scanner sc){
		BankAccount acc = null;
		return acc;
	}

}
