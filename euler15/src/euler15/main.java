package euler15;

public class main {
	private static double paths=0;
	private static final int maxx=20;
	private static final int maxy=20;
	public static void go(int x,int y){
		if(x<maxx){
			go(x+1,y);
		}
		if(y<maxy){
			go(x,y+1);
		}
		if(x==y && x==maxx) paths+=1;
	}

	public static void main(String[] args) {
		go(0,0);
		System.out.println(paths);
	}

}
