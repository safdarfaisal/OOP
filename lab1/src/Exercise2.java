import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Exercise2 {
	public static void main(String[] args){
		List<Integer> listOfIntegers = new ArrayList<Integer>(10);
		System.out.println("Enter 10 integers to find the sum of (Scanner)");
		for(int i = 0; i < 10; i++){
			try {
				listOfIntegers.add(readInteger());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(findSum(listOfIntegers));
	}
	public static int findSum(List<Integer> listArray){
		int sum = 0;
		for(Integer a : listArray){
			sum += a;
		}
		return sum;
	}
	public static int readInteger() throws IOException{
		int integer = 0;
		Scanner a = new Scanner(System.in);
		integer = a.nextInt();
		return integer;
	}
}
