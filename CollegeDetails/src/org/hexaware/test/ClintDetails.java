package org.hexaware.test;

import org.cts.test.same;
import org.cts.test.same1;

public class ClintDetails {
	public  void clintId() {
		
		System.out.println("54321");

	}
	public  void clintName() {
		
		System.out.println("Dlf");

	}
	
	public  void clintLoc() {
System.out.println("PORUR");

	}
	public static void main(String[] args) {
		
		ClintDetails d=new ClintDetails();
		d.clintId();
		d.clintLoc();
		d.clintName();
		
		same a=new same();
		a.empId();
		a.empNmae();
		a.empLoc();
		
		same1 s=new same1();
		s.cmpId();
		s.cmpName();
		s.cmpAdd();
		
		
	}

}
