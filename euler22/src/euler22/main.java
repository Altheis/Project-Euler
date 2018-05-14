package euler22;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class main {
	static ArrayList<String> names = new ArrayList<String>();
	static void read(String name){
		File data = new File(name);
		Scanner sc;
		try {
			sc = new Scanner(data);
			sc.useDelimiter("\",\"");
			while(sc.hasNext()) {
				names.add(sc.next());
			}
			names.sort(null);
		} catch (FileNotFoundException e) {
			System.out.println("file "+name+" not found");
		}
	}
	static void display(){
		for(String n : names)
			System.out.println(n);

	}
	static int tovalue(String str){
		int sum=0;
		for(int i=0;i<str.length();i++)	sum+=((int)str.charAt(i))-96;
	return sum;
	}

	public static void main(String[] args) {
		read("C:\\Users\\win7\\workspace\\euler22\\src\\data.txt");
		//display();
		double sum=0;
		for(int i=0;i<names.size();i++)
			sum+=(i+1)*tovalue(names.get(i).toLowerCase());
		System.out.println(sum);
	}

}
