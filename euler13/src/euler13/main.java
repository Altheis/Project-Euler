package euler13;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class main {
	static String numbers[] = new String[100];
	static void read(String name){
		File data = new File(name);
		Scanner sc;
		try {
			sc = new Scanner(data);
			int i=0;
			while(sc.hasNext()) {
				numbers[i]=sc.next();
				i++;
			}
		} catch (FileNotFoundException e) {
			System.out.println("file "+name+" not found");
		}
	}
	static void display(){
		for(int i =0;i<100;i++)
			System.out.println(numbers[i]);

	}
	public static void main(String[] args) {
		read("C:\\Users\\win7\\workspace\\euler13\\src\\data.txt");
		//display();
		int digit=0,overflow=0;
		ArrayList<Integer> result= new ArrayList<Integer>();
		for(int i = 49;i>=0;i--)
		{
			digit=0;
			for(int j = 0; j<100;j++){
				digit+=Character.getNumericValue(numbers[j].charAt(i));
			}
			digit+=overflow;
			overflow=(digit-(digit%10))/10;
			digit=digit%10;
			result.add(digit);
		}
		System.out.print(overflow);
		for(int i = result.size()-1;i>=0;i--) System.out.print(result.get(i));

	}

}
