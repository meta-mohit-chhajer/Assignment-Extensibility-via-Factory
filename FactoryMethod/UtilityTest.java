package com.metacube.FactoryMethod;
import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.*;
import org.junit.Test;
public class UtilityTest {
	/*
	 * Positive test case for adding shape
	 */
	@Test
	public void addShapePositiveTest () {
		
		// creating a virtual screen
		Screen screen = new Screen (100, 100);
		
		// creating rectangle shape
		Shape rect = ShapeFactory.getShape(ShapeType.RECTANGLE);
		Rectangle rectangle=(Rectangle)rect;
		(rectangle).setOrigin(new Point(1, 1));
		(rectangle).setLength(4);
		(rectangle).setBreadth(2);
		(rectangle).setOriginDistance();
		
		// adding rectangle to screen
		screen.addShape(rectangle);
	}
	
	/*
	 * Test case for adding shape to screen on passing null
	 */
	@Test(expected = AssertionError.class)
	public void addShapeOnNull () {
		// creating a virtual screen
		Screen screen = new Screen (100, 100);
		
		screen.addShape(null);
	}
	
	/*
	 * Test case for adding shape whose point is out of screen
	 */
	@Test(expected = AssertionError.class)
	public void addShapeOnPointOutsideScreen () {
		// creating a virtual screen
		Screen screen = new Screen (100, 100);
		
		// creating rectangle shape with point outside the screen
		Shape rect = ShapeFactory.getShape(ShapeType.RECTANGLE);
		Rectangle rectangle=(Rectangle)rect;
		(rectangle).setOrigin(new Point(120, 1));
		(rectangle).setLength(4);
		(rectangle).setBreadth(2);
		(rectangle).setOriginDistance();
		
		// adding shape to screen
		screen.addShape(rectangle);
	}
	
	/*
	 * Test case for deleting shape from screen
	 */
	@Test
	public void deleteShape () {
		// creating a virtual screen
		Screen screen = new Screen (100, 100);
		
		// creating a rectangle shape
		Shape rect = ShapeFactory.getShape(ShapeType.RECTANGLE);
		Rectangle rectangle=(Rectangle)rect;
		(rectangle).setOrigin(new Point(1, 1));
		(rectangle).setLength(4);
		(rectangle).setBreadth(2);
		(rectangle).setOriginDistance();
		
		// adding rectangle to screen
		screen.addShape(rectangle);
		
		// deleting rectangle from screen
		screen.deleteShape(rectangle);
	}
	
	/*
	 * Deleting shape from screen on passing null
	 */
	@Test
	public void deleteShapeOnNull () {
		// creating a virtual screen
		Screen screen = new Screen (100, 100);
		
		screen.deleteShape(null);
	}
	
	/*
	 * Test case for deleting shape type from screen
	 */
	@Test
	public void deleteShapeType () {
		// creating a virtual screen
		Screen screen = new Screen (100, 100);
		
		// creating a rectangle shape
		Shape rect = ShapeFactory.getShape(ShapeType.RECTANGLE);
		Rectangle rectangle=(Rectangle)rect;
		(rectangle).setOrigin(new Point(1, 1));
		(rectangle).setLength(4);
		(rectangle).setBreadth(2);
		(rectangle).setOriginDistance();
		
		// adding rectangle to screen
		screen.addShape(rectangle);
		
		// creating another rectangle shape
		Shape rect2 = ShapeFactory.getShape(ShapeType.RECTANGLE);
		Rectangle rectangle2=(Rectangle)rect2;
		(rectangle2).setOrigin(new Point(1, 1));
		(rectangle2).setLength(4);
		(rectangle2).setBreadth(2);
		(rectangle2).setOriginDistance();
		
		// adding shape to screen
		screen.addShape(rectangle2);
		
		screen.deleteShapeType(ShapeType.RECTANGLE);
	}
	
	/*
	 * Test case for deleting shape type from screen on passing null
	 */
	@Test
	public void deleteShapeTypeOnNull () {
		// creating a virtual screen
		Screen screen = new Screen (100, 100);
		
		screen.deleteShapeType(null);
	}
	
	/*
	 * Test case for sorting shapes by area
	 */
	@Test
	public void sortByArea () {
		// creating a virtual screen
		Screen screen = new Screen (100, 100);
		
		// creating a rectangle shape
		Shape rect = ShapeFactory.getShape(ShapeType.RECTANGLE);
		Rectangle rectangle=(Rectangle)rect;
		(rectangle).setOrigin(new Point(1, 1));
		(rectangle).setLength(4);
		(rectangle).setBreadth(2);
		(rectangle).setOriginDistance();
		
		// adding rectangle to screen
		screen.addShape(rectangle);
		
		// creating a square shape
		Shape squa = ShapeFactory.getShape(ShapeType.SQUARE);
		Square square=(Square)squa;
		(square).setOrigin(new Point(1, 1));
		(square).setSide(4);
		(square).setOriginDistance();
		
		// adding square to screen
		screen.addShape(square);
		
		// getting list of sorted shapes by area
		List<Shape> sortByArea = screen.sortByArea();
		
		assertEquals(sortByArea, Arrays.asList(rectangle, square));
	}
	
	/*
	 * Test case for sorting shapes by area on passing null
	 */
	@Test(expected = AssertionError.class)
	public void sortByAreaOnNull () {
		// creating a virtual screen
		Screen screen = new Screen (100, 100);
		
		screen.sortByArea();
	}
	
	/*
	 * Test case for sorting screen by origin distance of shapes
	 */
	@Test
	public void sortByOriginDistance () {
		// creating a virtual screen
		Screen screen = new Screen (100, 100);
		
		// creating a rectangle shape
		Shape rect = ShapeFactory.getShape(ShapeType.RECTANGLE);
		Rectangle rectangle=(Rectangle)rect;
		(rectangle).setOrigin(new Point(1, 1));
		(rectangle).setLength(4);
		(rectangle).setBreadth(2);
		(rectangle).setOriginDistance();
		
		// adding shape to screen
		screen.addShape(rectangle);
		
		// creating a square shape
		Shape squa = ShapeFactory.getShape(ShapeType.SQUARE);
		Square square=(Square)squa;
		(square).setOrigin(new Point(1, 1));
		(square).setSide(4);
		(square).setOriginDistance();
		
		// adding square to screen
		screen.addShape(square);
		
		// getting sorted list of shapes by origin distance
		List<Shape> sortByArea = screen.sortByOriginDistance();
		
		assertEquals(sortByArea, Arrays.asList(rectangle, square));
	}
	
	/*
	 * Test case for sorting screen by area of shapes and passing as null
	 */
	@Test(expected = AssertionError.class)
	public void sortByOriginDistanceOnNull () {
		// creating a virtual screen
		Screen screen = new Screen (100, 100);
		
		// sorting by area on null
		screen.sortByArea();
	}
}
