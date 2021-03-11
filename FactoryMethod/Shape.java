package com.metacube.FactoryMethod;
import java.util.Date;
public interface Shape {
	
	double getArea();
	
	double getPerimeter();
	
	Point getOrigin();
	
	boolean isPointEnclosed(Point point);
	
	ShapeType getShapeType();
	
	double getOriginDistance();
	
	Date getTimeStamp();
	
	void setTimeStamp (Date timeStamp);
}
