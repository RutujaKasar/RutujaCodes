package my_pack;

public class Quadrilateral {
//double height, width, side;
public static void main(String[] args) {
	Rectangle t = new Rectangle();
	t.areaRectangle(20, 30);
	Square s= new Square();
	s.areaSquare(20);
	Trapezium z= new Trapezium();
	z.areaTrapezium(10, 20, 30);
}
}
class Rectangle extends Quadrilateral
{ 
	public void areaRectangle(double height, double width)
	{
	double area=height*width;
	System.out.println("Area of rectangle is: "+area);
	}
}
class Square extends Quadrilateral
{
	public void areaSquare(double side)
	{
	double area=side*side;
	System.out.println("Area of square is: "+area);
	}
	}
class Trapezium
{
	public void areaTrapezium(double height, double width, double side)
	{
	double area=((side+width)/2)*height;
	System.out.println("Area of trapezium is: "+area);
	}	
}
