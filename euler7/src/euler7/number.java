package euler7;

public class number {
	public int value;
	public boolean prime;
	public number(int value){
		this.value=value;
		this.prime=true;
	}
	public void not(){
		this.prime=false;
	}
	public boolean isprime(){
		return prime;
	}
}
