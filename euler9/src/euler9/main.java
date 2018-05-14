package euler9;

public class main {

	public static void main(String[] args) {
		int a,b,c;
		double bs,as,cs;
		for (a=1;a<500;a++)
		{
			as=a*a;
			for(b=1;b<500;b++)
			{
				bs=b*b;
				c=1000-a-b;
				cs = c*c;
				if(as+bs==cs){
					System.out.println(a+" * "+b+" * "+c+" = "+a*b*c);
					return;
				}
			}
		}

	}

}
