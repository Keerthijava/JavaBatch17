package com.practice.constructor;



public class ObjectReferenceExample {

	public static void main(String[] args) {
		Student s1 =new Student("keerthi");
		Student s2=new Student("keerthi");
//		printme(s1);
//		System.out.println(s1.getName());
		String name = null;
		printstring(name);
		
		/*String name = "keer";
		String name1 = "keer";   o/p is true
		System.out.println(name==name1);*/
		/*
		String name = new String("keer");
		String name1 = new String("keer"); //o/p is false bcz two different objects are created
		System.out.println(name==name1);*/
		
	
	}
	
	public static void printme(Student stud){
	    System.out.println(stud.getName() + " " + stud.getRollno());
		stud.setName("default");
		}
	
	public static void printstring(String name){
		 
		System.out.println("name" + name);//String objects are immutable (not changable)
		name ="how r u" ;
		
	}

}
