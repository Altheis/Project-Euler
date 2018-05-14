package euler7;

import java.util.ArrayList;

public class main {
	static public int calculatefactors(double in){
		int factors = 2;
		for (double i=2; i<=in/2; i+=1){
			if(in%i==0){
				factors++;
			}
		}
		return factors;
	}

	public static void main(String[] args) {
		double cur=1, inc=2;
		while(calculatefactors(cur)<=501){
			cur+=inc;
			inc++;
			System.out.println(cur + " - " + calculatefactors(cur));
		}
		
	}

}
