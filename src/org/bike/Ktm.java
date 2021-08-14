package org.bike;

public class Ktm extends Student{

	@Override
	public void StudentId() {
		System.out.println("Student ID is : 123");
		
	}

	public static void main(String[] args) {
		Ktm k = new Ktm();
		k.StudentId();
		k.studentName("Ayup"
				);
				
	}
	
	
	
}
