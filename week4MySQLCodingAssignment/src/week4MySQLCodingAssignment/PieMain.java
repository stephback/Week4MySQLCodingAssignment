package week4MySQLCodingAssignment;

import java.util.List;

public class PieMain {

//main method that calls sorting method
	public static void main(String[] args) {
		List<Pie> sortedPieList = PieSort.sortPie();
		System.out.println(sortedPieList);	//prints list after sorting pies
	}	
}
