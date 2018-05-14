package euler19;

public class date {
	private int day;
	private int month;
	private int year;
	public date(int day, int month, int year){
		this.day=day;
		this.month=month;
		this.year=year;
	}
	public void add(int days){
		int dim[]={31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int over=0;
		if((this.year%4==0 && this.year%100!=0) || this.year%400==0) dim[1]=29;
		if(days<1)return;
		if(this.day+days<=dim[this.month-1]){
			this.day+=days;
			return;
		}
		else{
			over=days-(dim[this.month-1]-this.day)-1;
			this.day=1;
			if(this.month<12)this.month++;
			else{
				this.month=1;
				this.year++;
			}
			this.add(over);
		}
	}
	public int getYear() {
		return this.year;
	}
	public int getDay() {
		return this.day;
	}
	public void display(){
		System.out.println(day+"."+month+"."+year);
	}
}
