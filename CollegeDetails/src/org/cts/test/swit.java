package org.cts.test;

import java.util.Scanner;

public class swit {
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
System.out.println("Enter the choice");

int choice = sc.nextInt();

 switch(choice) {

  case 1:
System.out.println("this is case 1 ");
	 
 break;

 case 2:
	
	 System.out.println("this is case 2");
	break;
	
	
default:
	System.out.println("Not valid ");
	break;
	
 }
   }
	}