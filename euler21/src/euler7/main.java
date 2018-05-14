package euler7;

import java.util.ArrayList;

public class main {
	static public int calculatesumoffactors(double in){
		int sum = 0;
		for (double i=1; i<=in/2; i+=1){
			if(in%i==0){
				sum+=i;
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		int sum=0;
		int sof=0;
		for(int i=1;i<10000;i++){
			sof=calculatesumoffactors(i);
			if(sof!=i && i==calculatesumoffactors(sof)) sum+=i;
		}
		System.out.println(sum);
		
	}

}
