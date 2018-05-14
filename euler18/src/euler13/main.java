package euler13;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class main {
	static int numbers[][] = new int[15][15];
	static void read(String name){
		File data = new File(name);
		Scanner sc;
		try{
			sc = new Scanner(data);
			int i=0, j=0;
			while(sc.hasNext()){
				numbers[i][j]=sc.nextInt();
				if(i==j){j++; i=-1;}
				i++;
			}
		} catch (FileNotFoundException e) {
			System.out.println("file "+name+" not found");
		}
	}
	static void display(){
		for(int i =0;i<15;i++)
		{
		for(int j =0; j<15; j++)
			System.out.print(numbers[j][i]+" ");
		System.out.print("\n");
		}
	}
	public static void main(String[] args) {
		read("C:\\Users\\win7\\workspace\\euler18\\src\\data.txt");
		//display();
		piece root = new piece(15,0,0,numbers);
		System.out.println(root.getbest());
	}

}
