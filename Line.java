package com.bl.workshop1;

public class Line {
Point p1;
Point p2;
float length;

float getLength() {
return length = (float) (Math.sqrt(Math.pow( p1.x - p2.x, 2)) + (Math.pow( p2.y - p2.y, 2)));
	}
}


