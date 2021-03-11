package com.metacube.FactoryMethod;
import static org.junit.Assert.*;

import org.junit.Test;
public class CircleTest {
	/*
	 * Testing triangle area
	 */
	//@SuppressWarnings("deprecation")
	@Test
	public void getAreaTest() {
		
		// create a circle shape with specific point
		Shape cir = ShapeFactory.getShape(ShapeType.CIRCLE);
		Circle circle=(Circle)cir;
		(circle).setPoint(new Point(1, 1));
		(circle).setRadius(4);
		(circle).setOriginDistance();
		
		assertEquals(50.265, circle.getArea(),0.01);
	}
	
	/*
	 * Testing the perimeter of circle
	 */
	@Test
	public void getPerimeterTest() {
		
		// create a circle shape with specific point
		Shape cir = ShapeFactory.getShape(ShapeType.CIRCLE);
		Circle circle=(Circle)cir;
		(circle).setPoint(new Point(1, 1));
		(circle).setRadius(4);
		(circle).setOriginDistance();

		assertEquals(25.14, circle.getPerimeter(), 0.01);
	}
	
	/*
	 * checking whether point is inside or not (true case)
	 */
	@Test
	public void isPointEnclosedTrueTest() {
		
		// create a circle shape with specific point
		Shape cir = ShapeFactory.getShape(ShapeType.CIRCLE);
		Circle circle=(Circle)cir;
		(circle).setPoint(new Point(1, 1));
		(circle).setRadius(4);
		(circle).setOriginDistance();
		
		assertTrue(circle.isPointEnclosed(new Point(2, 1)));
	}
	
	/*
	 * checking whether point is inside or not (false case)
	 */
	@Test
	public void isPointEnclosedFalseTest() {
		
		// create a circle shape with specific point
		Shape cir = ShapeFactory.getShape(ShapeType.CIRCLE);
		Circle circle = (Circle)cir;
		(circle).setPoint(new Point(1, 1));
		(circle).setRadius(4);
		(circle).setOriginDistance();
		
		assertFalse(circle.isPointEnclosed(new Point(-100, 10)));
	}

}
