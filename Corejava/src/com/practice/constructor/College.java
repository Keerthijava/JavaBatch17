package com.practice.constructor;

public class College {
	public static void main(String args[]) {
		Student s1 = new Student("keerthi", 101);
		s1.setName("sunil");
		System.out.println(s1.getName() + "\n id is :" + s1.getRollno());
		
		Student s2 =new Student("bunny");
		//Assigning the object reference to one more reference
		/*Student s3 =s2;
		System.out.println(s3.getName());*/
	}
	
	

}
