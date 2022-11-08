//Java Program to Implement Shape Interface using Circle and Rectangle Class

interface Shape{	
	double area();
	double perimeter();
}

class Circle implements Shape{
	int radius;

	Circle(){		
	}
	
	Circle(int radius){
		this.radius = radius;
	}
	
	public double area(){
		return (3.14*radius*radius);
	}
	
	public double perimeter(){
		return (2*3.14*radius);
	}
}

class Rectangle implements Shape{
	int length;
	int breadth;
	
	Rectangle(){
	}
	
	Rectangle(int length, int breadth){
		this.length = length;
		this.breadth = breadth;
	}
	
	public double area(){
		return (length*breadth);
	}
	
	public double perimeter(){
		return (2*length + 2*breadth);
	}
}

class ImplementShapeInterfaceUsingCircleAndRectangleClassDemo{
	public static void main(String args[]){
		Shape sObj1 = new Circle(10);
		Shape sObj2 = new Rectangle(5,5);
		
		System.out.println("Area of circle is: "+sObj1.area());
		System.out.println("Perimeter of circle is: "+sObj1.perimeter());
		
		System.out.println("Area of rectangle is: "+sObj2.area());
		System.out.println("Perimeter of rectangle is: "+sObj2.perimeter());
	}
}