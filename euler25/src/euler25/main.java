package euler25;

import java.math.BigInteger;

public class main {

	public static void main(String[] args) {
		BigInteger f1= new BigInteger("1");
		BigInteger f2= new BigInteger("1");
		BigInteger f3= new BigInteger("2");
		int i=3;
		while(f3.toString().length()<1000){
			f1=f2;
			f2=f3;
			f3=f1.add(f2);
			i++;
		}
		System.out.println(i);
	}

}
