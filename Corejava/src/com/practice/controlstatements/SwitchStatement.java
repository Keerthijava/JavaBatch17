package com.practice.controlstatements;


/*//by using if else loop it wl go to each and every case so its a performance is low 
//By using switch it will jump directly to the value given by us
*/public class SwitchStatement {

	public static void main(String[] args) {
		int value =Integer.parseInt(args[0]);
		
		switch(value)
		{
		case 1 :
		System.out.println("one");
		break;
		case 2 :
			System.out.println("two");
			break;
		case 3 :
			System.out.println("three");
			break;
		}

	}

}
