package euler3;

import java.util.ArrayList;

public class main {

	public static void main(String[] args) {
		double number=600851475143L;
		ArrayList<Integer> factors = new ArrayList<Integer>();
		for(int i=1;i<number;i++)
		{
			if(number%i==0)
			{
				factors.add(i);
				number=number/i;
				if(i>1)i--;
			}
		}
		if(factors.get(factors.size()-1)>number) System.out.println(factors.get(factors.size()-1));
		else System.out.println((int)number);
	}

}
