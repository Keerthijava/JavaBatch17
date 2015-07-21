package com.practice.constructor;

public class GarbageCollector {

	public static void main(String[] args) {
		Student stud = null;
		for(int i=0; i<500000 ;i++){
			stud =new Student("stud" +i);
			//System.out.println(stud);
		}
	}

}
