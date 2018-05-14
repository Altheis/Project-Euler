package euler19;

public class main {

	public static void main(String[] args) {
		date data = new date(1,1,1900);
		data.add(6);
		int counter=0;
		while(data.getYear()<=2000){
			if(data.getYear()>=1901 && data.getDay()==1) counter++;
			data.add(7);
		}
		System.out.println("In twentieth century "+counter+" sundays fell on the first of the month.");
	}

}
