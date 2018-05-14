package euler5;

public class main {

	public static void main(String[] args) {
		int divs[]={11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
		boolean found=false;
		int test=20;
		while(!found)
		{
			test++;
			found=true;
			for(int i=0;i<divs.length;i++)
			{
				if(test%divs[i]!=0) {
					i=divs.length;
					found=false;
				}
			}
		}
		System.out.println("Smallest positive number that is evenly divisible by all of the numbers from 1 to 20 is "+test);

	}

}
