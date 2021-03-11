package com.metacube.FactoryMethod;
import org.junit.Test;
import static org.junit.Assert.*;
public class RectangleTest {
	/*
	 * Testing rectangle area
	 */
	@Test
	public void getAreaTest() {
		
		// create a rectangle shape with specific point
		Shape rect = ShapeFactory.getShape(ShapeType.RECTANGLE);
		Rectangle rectangle=(Rectangle)rect;
		(rectangle).setOrigin(new Point(1, 1));
		(rectangle).setLength(4);
		(rectangle).setBreadth(2);
		(rectangle).setOriginDistance();
		
		assertEquals(8.0, rectangle.getArea(), 0.01);
	}
	
	/*
	 * Testing the perimeter of rectangle
	 */
	@Test
	public void getPerimeterTest() {
		
		// create a rectangle shape with specific point
		Shape rect = ShapeFactory.getShape(ShapeType.RECTANGLE);
		Rectangle rectangle=(Rectangle)rect;
		(rectangle).setOrigin(new Point(1, 1));
		(rectangle).setLength(4);
		(rectangle).setBreadth(2);
		(rectangle).setOriginDistance();

		assertEquals(12.0, rectangle.getPerimeter(), 0.01);
	}
	
	/*
	 * checking whether point is inside or not (true case)
	 */
	@Test
	public void isPointEnclosedTrueTest() {
		
		// create a rectangle shape with specific point
		Shape rect = ShapeFactory.getShape(ShapeType.RECTANGLE);
		Rectangle rectangle=(Rectangle)rect;
		(rectangle).setOrigin(new Point(1, 1));
		(rectangle).setLength(4);
		(rectangle).setBreadth(2);
		(rectangle).setOriginDistance();
		
		assertTrue(rectangle.isPointEnclosed(new Point(2, 1)));
	}
	
	/*
	 * checking whether point is inside or not (false case)
	 */
	@Test
	public void isPointEnclosedFalseTest() {
		
		// create a rectangle shape with specific point
		Shape rect = ShapeFactory.getShape(ShapeType.RECTANGLE);
		Rectangle rectangle=(Rectangle)rect;
		(rectangle).setOrigin(new Point(1, 1));
		(rectangle).setLength(4);
		(rectangle).setBreadth(2);
		(rectangle).setOriginDistance();
		
		assertFalse(rectangle.isPointEnclosed(new Point(-2, 1)));
	}

}
