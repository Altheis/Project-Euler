package euler7;

import java.util.ArrayList;

public class main {

	public static void main(String[] args) {
		ArrayList<number> lista = new ArrayList<number>();
		for(int i=2;i<2000000;i++){
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
		double sum=0;
		int i=0;
		for(number n : lista) if(n.isprime())sum+=n.value;
		System.out.println(sum);
	}

}
