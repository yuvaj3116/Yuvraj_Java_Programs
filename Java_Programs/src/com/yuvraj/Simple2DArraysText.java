package com.yuvraj;

public class Simple2DArraysText {
	public static void main(String[] args) {
		String [][] chocolateBoxes = {
				{"Ball 1","Ball 2","Ball 3"},   //row 0
				{"Ball 4","Ball 5","Ball 6"},   //row 1
				{"Ball 7","Ball 8","Ball 9"},   //row 2
		};
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.print(chocolateBoxes[i] [j]); //if we remove ln it will print in the same line, if used ln it will print every element in the next line.
			}
			System.out.println();
		}
		
	}

}


