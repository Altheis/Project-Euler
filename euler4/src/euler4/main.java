package euler4;

public class main {
	
	static boolean ispalindrome(int test){
		String str=String.valueOf(test);
		int len=str.length();
		for(int i=0;i<len/2;i++)
		{
			if(str.charAt(i)!=str.charAt(len-i-1)) return false;
		}
		return true;
	}
	public static void main(String[] args) {
		int best=0;
		for(int i=999; i>99;i--)
			for(int j=999; j>99; j--)
				if(ispalindrome(i*j) && i*j>best)
				{
					best=i*j;
					System.out.println(i+" * "+j+" = "+i*j);
				}
		System.out.println("Largest product of 2 3 digit numbers palindrome is "+best);
	}
}
