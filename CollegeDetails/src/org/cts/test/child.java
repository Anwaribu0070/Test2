package org.cts.test;

public class child implements noo,NewOne {

	@Override
	public void empId() {
		System.out.println("7654321");
		
	}

	@Override
	public void empName() {
		System.out.println("asdfghui");
		
	}

	@Override
	public void cmpId() {
		System.out.println("0987654321");
	}

	@Override
	public void cmpName() {
		System.out.println("asdfghjklkpoiuytrew");
		
	}
	
	
	public static void main(String[] args) {
		
		child o= new child();
		o.empId();
		o.empName();
		o.cmpName();
		o.cmpId();
	}
	

}
