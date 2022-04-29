package com.bl.workshop1;

public class Main {

	public static void main(String[] args) {
System.out.println("Welcome to line comparision problem");

		Line line1 = new Line();
		Line line2 = new Line();
		
		line1.p1 = new Point();
		line1.p1.x = 2;
		line1.p2.y =4;
		line1.p2 = new Point();
		line1.p2.x = 6;
		line1.p2.y = 8;
		
		line1.p1 = new Point();
		line1.p1.x = 3;
		line1.p2.y =7;
		line1.p2 = new Point();
		line1.p2.x = 9;
		line1.p2.y = 11;
		
		float length1 = line1.getLength();
		float length2 = line1.getLength();
		
		System.out.println("Length of Line 1 : "+length1);
		System.out.println("Length of Line 2 : "+length1);
	}
}
