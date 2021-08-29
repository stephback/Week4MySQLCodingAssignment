package week4MySQLCodingAssignment.dao;


import java.util.NoSuchElementException;
import java.util.Optional;

import week4MySQLCodingAssignment.Pie;

public class PieOptional {
	
	public static void main(String[] args) { 
		methodB();
		
	}
	
	public static Pie pieMethod(Optional<Pie> optionalPie) {	//returns unwrapped pie
		return optionalPie.orElseThrow(() -> new NoSuchElementException("Unable to find pie!")); //exception w/ custom message
	}

	public static void methodB() {	//calls pieMethod with object wrapped by an optional
		Optional<Pie> pies = Optional.of(PieData.pies.get(15));	//15 == coconut cream pie
		System.out.println(pieMethod(pies));	//unwrapped from optional
		
		try {
			pieMethod(pies.empty());		//empty optional
		}
		catch (Exception e) {
			System.out.println(e.getMessage());	//exception message from empty optional 
		}	
	}	
} 
