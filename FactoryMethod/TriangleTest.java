package com.metacube.FactoryMethod;
import static org.junit.Assert.*;
import org.junit.Test;
public class TriangleTest {
	/*
	 * Testing triangle area
	 */
	@Test
	public void getAreaTest() {
		
		// create a triangle shape with specific point
		Shape tri = ShapeFactory.getShape(ShapeType.TRIANGLE);
		Triangle triangle=(Triangle)tri;
		(triangle).setOrigin(new Point(1, 1));
		(triangle).setSide1(4);
		(triangle).setSide2(3);
		(triangle).setSide3(2);
		(triangle).setHeight(1);
		(triangle).setOriginDistance();
		
		assertEquals(2.904, triangle.getArea(), 0.01);
	}
	
	/*
	 * Testing the perimeter of triangle
	 */
	@Test
	public void getPerimeterTest() {
		
		// create a triangle shape with specific point
		Shape tri = ShapeFactory.getShape(ShapeType.TRIANGLE);
		Triangle triangle=(Triangle)tri;
		(triangle).setOrigin(new Point(1, 1));
		(triangle).setSide1(4);
		(triangle).setSide2(3);
		(triangle).setSide3(2);
		(triangle).setHeight(1);
		(triangle).setOriginDistance();

		assertEquals(9.0, triangle.getPerimeter(), 0.01);
	}
	
	/*
	 * checking whether point is inside or not (true case)
	 */
	@Test
	public void isPointEnclosedTrueTest() {
		
		// create a triangle shape with specific point
		Shape tri = ShapeFactory.getShape(ShapeType.TRIANGLE);
		Triangle triangle=(Triangle)tri;
		(triangle).setOrigin(new Point(1, 1));
		(triangle).setSide1(4);
		(triangle).setSide2(3);
		(triangle).setSide3(2);
		(triangle).setHeight(1);
		(triangle).setOriginDistance();
		
		assertFalse(triangle.isPointEnclosed(new Point(3, 3)));
	}
	
	/*
	 * checking whether point is inside or not (false case)
	 */
	@Test
	public void isPointEnclosedFalseTest() {
		
		// create a triangle shape with specific point
		Shape tri = ShapeFactory.getShape(ShapeType.TRIANGLE);
		Triangle triangle=(Triangle)tri;
		(triangle).setOrigin(new Point(1, 1));
		(triangle).setSide1(4);
		(triangle).setSide2(3);
		(triangle).setSide3(2);
		(triangle).setHeight(1);
		(triangle).setOriginDistance();
		assertFalse(triangle.isPointEnclosed(new Point(-5, 0)));
	}
}
