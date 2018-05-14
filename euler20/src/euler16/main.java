package euler16;

import java.math.BigInteger;

public class main {

	public static void main(String[] args) {
		BigInteger number=new BigInteger("1");
		for(int i =1;i<=100;i++)number = number.multiply(new BigInteger(String.valueOf(i)));
		String res = number.toString();
		int sum=0;
		
		for(int i=0;i<res.length();i++)sum+=Character.getNumericValue(res.charAt(i));
		System.out.println(sum);

	}

}
