package my_pack;

public class Area {
public static void main(String[] args) {
	Area.areaRectangle(20, 30);
	Area.areaSquare(12);
	Area.areaTrapezium(41, 62, 82);
}
public static void areaRectangle(double height, double width)
{
	double areaOfRectangle =height*width;
	System.out.println("Area Of Rectangle is: "+areaOfRectangle);
	}
public static void areaSquare(double side)
{
	double areaOfSquare=side*side; 
	System.out.println("Area Of Square is: "+areaOfSquare);

	}
public static void areaTrapezium(double a, double b, double h)
{
	double areaOfTrapezium=((a+b)/2)*h;
	System.out.println("Area Of Trapezium is: "+areaOfTrapezium);
	}
}
