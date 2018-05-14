package euler27;

import java.util.ArrayList;

public class main {
	static ArrayList<number> lista;
	
	public static int count(int a, int b){
		int n=0;
		int val = n*n+a*n+b;
		int score=0;
		if(val>2){
			while(lista.get(val-2).isprime()){
				score++;
				n++;
				val = n*n+a*n+b;
				if(val<2) val=6;
			}
		}
		return score;
	}
	
	public static void main(String[] args) {
		lista = new ArrayList<number>();
		for(int i=2;i<1000000;i++){
			lista.add(new number(i));
		}
		number test;
		for(int i=0;i<lista.size();i++){
			test=lista.get(i);
			if(test.isprime()){
				int j=i;
				int val = test.value;
				while(j<lista.size()-val){
					j+=val;
					lista.get(j).not();
				}
			}
		}
		int besta=-1001, bestb=1001;
		int bestscore=0;
		for(int a=-1000; a<=1000;a++){
			for(int b=-1000; b<=1000; b++){
				int score=count(a,b);
				if(score>bestscore){
					besta=a;
					bestb=b;
					bestscore=score;
				}
			}
		}

		System.out.println(besta+" * "+bestb+" = "+besta*bestb);

	}

}
