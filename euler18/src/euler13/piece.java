package euler13;

public class piece {
	private int value;
	private int best=-1;
	private piece left;
	private piece right;
	public piece(int lim, int x, int y, int num[][]){
		this.value=num[x][y];
		if(y<lim-1){
			left = new piece(lim,x,y+1,num);
			right = new piece(lim,x+1,y+1,num);
		}
	}
	public int getval(){
		return this.value;
	}
	public int getbest(){
		if(best!=-1)return best;
		if(left==null) this.best = this.value;
		else this.best=Math.max(left.getbest(), right.getbest())+this.value;
		return best;
	}
}
