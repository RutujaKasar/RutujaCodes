package my_pack;
//Calculating Area Using Method Overloading
public class Area_Task {
	public static void main(String[] args) {
		System.out.println("Area Of Triangle is: "+calculateArea(20, 30));
		System.out.println("Area Of Square is: "+calculateArea(20));
		System.out.println("Area of Trapezium is "+calculateArea(20, 30, 40));


	}
public static double calculateArea(double height, double width)
{
	return height*width;
}
public static double calculateArea(double side)
{
	return side*side;
	}
public static double calculateArea(double a, double b,double h)
{
	return ((a+b)/2)*h;
	}
}
