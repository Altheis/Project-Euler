package euler26;

public class main {
	
	static String inverse(int val){
		int num=10;
		int times=0;
		String resp="0.";
		while(num>0 && resp.length()<10000){
			times=-1;
			for(int i=1;i<10;i++)if(i*val<=num)times=i;
			if(times==-1)times=0;
			num-=times*val;
			resp+=String.valueOf(times);
			num*=10;
		}
		return resp;
	}

	static int cyclelen(String str){
		if(str.length()<100)return 0;
		str=str.substring(1000);
		for(int i=1;i<str.length();i++){
			boolean found=true;
			for(int j=0;j<2*i;j++){
				if(str.charAt(j)!=str.charAt(i+j)){
					found=false;
					j=3*i;
				}
			}
			if(found)return i;
		}
		return -1;
	}
	
	public static void main(String[] args) {
		int best=0;
		int bestfor=0;
		
		for(int i=1;i<1000;i++)
		{
			int val=cyclelen(inverse(i));
			if(val>best){
				best=val;
				bestfor=i;
			}
		}
		System.out.println("Longest sequence appears in "+bestfor+" with a length of "+best);
	}

}
