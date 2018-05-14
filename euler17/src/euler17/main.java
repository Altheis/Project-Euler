package euler17;

public class main {
	static final String single[] = {"one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen","twenty"};
	static final String teens[] = {"teen","twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"};

	public static String tostr(int number){
		if(number==1000) return "onethousand";
		if(number>=100 && number%100!=0)return tostr((number-(number%100))/100)+"hundredand"+tostr(number%100);
		if(number>=100 && number%100==0)return tostr(number/100)+"hundred";
		if(number>=20)return teens[(number-(number%10))/10-1]+tostr(number%10);
		if(number>0)return single[number-1];
		else return "";
	}
	public static void main(String[] args) {
		int sum=0;
		for(int i=1;i<=1000;i++)sum+=tostr(i).length();
		System.out.println(sum);
	}

}