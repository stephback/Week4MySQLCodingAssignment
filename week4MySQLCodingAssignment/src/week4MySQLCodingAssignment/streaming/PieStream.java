package week4MySQLCodingAssignment.streaming;

import java.util.List;
import java.util.stream.Collectors;
import week4MySQLCodingAssignment.Pie;
import week4MySQLCodingAssignment.dao.PieData;


public class PieStream {
	
	public static void main(String[] args) {
		PieData pieOne = new PieData();
		List<Pie> pies = pieOne.getPies();
		String pieString = pies.stream() 	//stream of pies
				.map(String::valueOf) 		//stream of pies to stream of string
				.sorted()					//sort stream
				.collect(Collectors.joining(", "));	//collect stream and return comma-separated string
		System.out.println(pieString);		//print string		
	}
}
