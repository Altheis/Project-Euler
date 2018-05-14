package euler14;

public class main {
	static double next(double in){
		if(in%2==0) return in/2;
		else return 3*in+1;
	}

	public static void main(String[] args) {
		int chainlen[]=new int[100000000];
		int len=0;
		int best=0,bestfor=0;
		double test;
		chainlen[1]=1;
		for(int i=2; i<1000000; i++){
			len=2;
			test=i;
			while(next(test)!=1 && (test>100000000 || chainlen[(int) test]==0 )){
				len++;
				test=next(test);
			}
			if(next(test)!=1){
				len+=chainlen[(int) test]-1;
				if(i<100000000)chainlen[i]=len;
			}
			if(len>best){
				best=len;
				bestfor=i;
			}
		}
		System.out.println(bestfor+" - "+best);
	}

}
