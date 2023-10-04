package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		
		//border
		StdDraw.setPenRadius(0.01);
		StdDraw.setPenColor(0, 0, 0);
		StdDraw.rectangle(0.5, 0.5, 0.44, 0.32);
		
		
		
		//circles
		for(int i = 0; i < 15 ; i++)
		{
			double x = Math.random()*0.6 + 0.2;
			double y = Math.random()*0.45 + 0.27;
			
			int red = (int)(Math.random()*255 + 1);
			int green = (int)(Math.random()*255 + 1);
			int blue = (int)(Math.random()*255 + 1);
			
			StdDraw.setPenColor(red, green, blue);
			StdDraw.filledCircle(x, y, 0.1);
		}
		

		
		

		
		/*
		String shapeType = in.next();
		int redComponent = in.nextInt();
		int greenComponent = in.nextInt();
		int blueComponent = in.nextInt();
		boolean isFilled = in.nextBoolean();
		double parameterOne = in.nextDouble();
		double parameterTwo = in.nextDouble();
		double parameterThree = in.nextDouble();
		double parameterFour = in.nextDouble();
		 */
		
		//StdDraw.setPenRadius(0.01);
		//StdDraw.setPenColor(redComponent, greenComponent, blueComponent);
		
		//StdDraw.ellipse(parameterOne, parameterTwo, parameterThree, parameterFour);
	}
}