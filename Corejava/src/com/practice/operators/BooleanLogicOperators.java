package com.practice.operators;

public class BooleanLogicOperators {

	public static void main(String[] args) {
		int ScienceMarks = 40;
		int SocialMarks = 50;
		int MathMarks = 80;
		//&& - if lefthand condition is false it will not even go to righthand evalutation 
		
		/*if( (ScienceMarks > SocialMarks) && (MathMarks >75)) {
			System.out.println("good student");
		}
		else{
			System.out.println("average student");
		}*/
		
	
// || - if left hand condition is true or false it goes and evaluates righthand side 
		if( (ScienceMarks > SocialMarks) || (MathMarks >75)) {
			System.out.println("good student");
		}
		else{
			System.out.println("average student");
		}
	}

}
