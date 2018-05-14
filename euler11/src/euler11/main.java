package euler11;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class main {
	static int grid[][] = new int[20][20];
	static void read(String name){
		File data = new File(name);
		Scanner sc;
		try {
			sc = new Scanner(data);
			int i=0;
			while(sc.hasNext()) {
				grid[i/20][i%20]=sc.nextInt();
				i++;
			}
		} catch (FileNotFoundException e) {
			System.out.println("file "+name+" not found");
		}
	}
	static void display(){
		for(int i =0;i<20;i++)
		{
		for(int j =0; j<20; j++)
			System.out.print(grid[i][j]+" ");
		System.out.print("\n");
		}
	}
	static double check_horizontal(){
		double best=0,temp=0;
		for (int i=0;i<20;i++)
		{
			for(int j=0;j<17;j++)
			{
				temp=1;
				for(int k=0;k<4;k++) temp=temp*grid[i][j+k];
				if(temp>best)best=temp;
			}
			
		}
		return best;
	}
	static double check_vertical(){
		double best=0,temp=0;
		for (int i=0;i<20;i++)
		{
			for(int j=0;j<17;j++)
			{
				temp=1;
				for(int k=0;k<4;k++) temp=temp*grid[j+k][i];
				if(temp>best)best=temp;
			}
			
		}
		return best;
	}
	static double check_diagonal1(){
		double best=0,temp=0;
		for (int i=0;i<17;i++)
		{
			for(int j=0;j<17;j++)
			{
				temp=1;
				for(int k=0;k<4;k++) temp=temp*grid[j+k][i+k];
				if(temp>best)best=temp;
			}
			
		}
		return best;
	}
	static double check_diagonal2(){
		double best=0,temp=0;
		for (int i=0;i<17;i++)
		{
			for(int j=0;j<17;j++)
			{
				temp=1;
				for(int k=0;k<4;k++) temp=temp*grid[19-j-k][i+k];
				if(temp>best)best=temp;
			}
			
		}
		return best;
	}

	public static void main(String[] args) {
		read("C:\\Users\\win7\\workspace\\euler11\\src\\data.txt");
		double best=Math.max(Math.max(check_horizontal(), check_vertical()),Math.max(check_diagonal1(), check_diagonal2()));
		System.out.println(best);
	}

}
