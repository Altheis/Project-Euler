package euler7;

import java.util.ArrayList;

public class main {

	public static void main(String[] args) {
		ArrayList<number> lista = new ArrayList<number>();
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
		int counter=10001;
		int i=0;
		while(counter>0){
			if(lista.get(i).isprime()) counter--;
			i++;
		}
		System.out.println(lista.get(i-1).value);
	}

}
