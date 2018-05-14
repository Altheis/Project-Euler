package euler6;

public class main {

	public static void main(String[] args) {
		double sumOfSquares=0, sumOfNumbers=0;
		for(int i=1;i<=100;i++)
			{
			sumOfNumbers+=i;
			sumOfSquares+=i*i;
			}
		System.out.println("difference between the sum of the squares of the first one hundred natural numbers and the square of the sum is " +(sumOfNumbers*sumOfNumbers-sumOfSquares));

	}

}
