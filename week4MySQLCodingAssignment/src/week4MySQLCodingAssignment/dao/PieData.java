package week4MySQLCodingAssignment.dao;

import java.util.ArrayList;
import java.util.List;

import week4MySQLCodingAssignment.Pie;

public class PieData {
//list of objects
	 public static List<Pie> pies = new ArrayList<Pie>(List.of(new Pie("Apple"), 
			new Pie("Blueberry"), new Pie("Cherry"), new Pie("Chocolate Cream"), 
			new Pie("Huckleberry"), new Pie("Rhubarb"), new Pie("Banana cream"),
			new Pie("Key Lime"), new Pie("Shoofly"), new Pie("Mississippi Mud"), 
			new Pie("French Silk"), new Pie("Minced Meat"), new Pie("Lemon Meringue"),
			new Pie("Banoffee"), new Pie("Blackberry"), new Pie("Coconut Cream"),
			new Pie("Buttermilk"), new Pie("Peach"), new Pie("Pumpkin"),
			new Pie("Raspberry"), new Pie("Tamale"), new Pie("Pecan")));

	public static List<Pie> getPies(){
		return pies;
	}
}
