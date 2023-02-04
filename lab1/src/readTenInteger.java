import java.io.*;
import java.util.*;
public class readTenInteger {
	public static void main(String[] args){
		List<Integer> listOfIntegers = new ArrayList<Integer>(10);
		System.out.println("Enter 10 integers to find the sum of");
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
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String intString = br.readLine();
		integer = Integer.parseInt(intString);
		return integer;
	}
}
