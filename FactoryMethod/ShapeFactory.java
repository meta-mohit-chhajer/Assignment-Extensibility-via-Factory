package com.metacube.FactoryMethod;

public class ShapeFactory {
	/*
	 * Used to get the object of type any Shape
	 * @param shapeType of type ShapeType
	 * @return same object of type ShapeType
	 */
	public static Shape getShape (ShapeType shapeType) {
	
		Shape shape = null;
		switch (shapeType) {
			
			case CIRCLE:
				shape = new Circle();
				break;
				
			case RECTANGLE:
				shape = new Rectangle();
				break;
				
			case SQUARE:
				shape = new Square();
				break;
				
			case TRIANGLE:
				shape = new Triangle();
				break;
				
			default:
				System.out.println("Invalid shape type");
				System.exit(0);
		}
		
		return shape;
		
	}
}
