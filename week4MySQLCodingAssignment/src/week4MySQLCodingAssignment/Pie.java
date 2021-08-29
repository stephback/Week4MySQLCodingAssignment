package week4MySQLCodingAssignment;
//Create a class of pie

public class Pie {	
	public static Object comparePies;	
	String pieType;	//instance variable to determine pie type
	
	public Pie(String string) {
		this.pieType = string;
	}

	public String getPieType() {	//getter to call pie type
		return pieType;
	}
	
	@Override public String toString() {	//toString to return pie type
		return (this.getPieType() + " Pie");
	}
	
	
	public static int compare(Pie pie1, Pie pie2) {	//compare method that returns an int
		return pie1.pieType.compareTo(pie2.pieType);
	} 

}
