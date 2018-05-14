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
		ArrayList<Integer> abundant = new ArrayList<Integer>();
		boolean numbers[] = new boolean[28123];
		int sum=0;
		int sof=0;
		for(int i=11;i<=28123;i++){
			sof=calculatesumoffactors(i);
			if(sof>i) abundant.add(i);
		}
		for(int i : abundant){
			for(int j : abundant){
				if(i+j<=28123)numbers[i+j-1]=true;
			}
		}
		for(int i=0;i<28123;i++) if(!numbers[i])sum+=i+1;
		System.out.println(sum);
		
	}

}
