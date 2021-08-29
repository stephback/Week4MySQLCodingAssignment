package week4MySQLCodingAssignment;

import java.util.List;
import week4MySQLCodingAssignment.dao.PieData;

public class PieSort {
	static PieData pieData = new PieData();
	
//sort method using Lambda expression
	
	public static List<Pie> sortPie() {
		
		List<Pie> pieList = PieData.getPies();
		pieList.sort((p1,p2)-> Pie.compare(p1, p2));		//lambda 
	
		return pieList; 
	}
	
// sort pies using method reference
	public static List<Pie> SortMethodRef(){
		
		List<Pie> pieList = PieData.getPies();
		pieList.sort(Pie::compare);
		return pieList;
	}	
}
