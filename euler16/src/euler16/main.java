package euler16;

import java.math.BigInteger;

public class main {

	public static void main(String[] args) {
		BigInteger number=new BigInteger("2");
		String res = number.pow(1000).toString();
		int sum=0;
		
		for(int i=0;i<res.length();i++)sum+=Character.getNumericValue(res.charAt(i));
		System.out.println(sum);

	}

}
