package assignment5;	//package declaration
import java.util.Scanner;
abstract class Figure 	//abstract class definition
{
	double dim1;
	abstract void findArea();	//abstract method declaration
    abstract void findPerimeter();	//abstract method declaration
}
class Circle extends Figure 
{
 	private final double radius;	//private final variable radius of type double
	public Circle()
	{
		this(1);
	}   
    public Circle(double radius) 	//parameterized constructor for assigning value to radius
	{
		this.radius = radius;
	}
	void findArea()		//implementing findArea() method
	{
        	double area1 = 3.14*radius*radius;
        	System.out.println("Area of Circle: "+area1);
    }
	void findPerimeter()	//implementing findPerimeter() method
	{
		double peri1 =2*3.14*radius;
		System.out.println("Perimeter of Circle: "+peri1);
	}
}
class Rectangle extends Figure 
{
 	private final double width, length;		//private final variable width and length of type double
	public Rectangle() 
	{
		this(1,1);
	}
    public Rectangle(double width, double length)	//parameterized constructor for assigning value to width and length
	{
		this.width = width;
		this.length = length;
    	}
	void findArea()		//implementing findArea() method
	{
        double area2=width*length;
        System.out.println("Area of Rectangle: "+area2);
    }
	void findPerimeter()	//implementing findPerimeter() method
	{
		double peri2 =2*(width+length);
		System.out.println("Perimeter of Rectangle: "+peri2);
	}
}
class Triangle extends Figure 
{
 	private final double a,b,c,h;	////private final variable a,b,c,h of type double 
	public Triangle() 
	{
		this(1,1,1,1);
	}
	public Triangle(double a, double b, double c,double h) //parameterized constructor for assigning value to width and length
	{
		this.a = a;
		this.b = b;
		this.c = c;
		this.h = h;
    }
	void findArea()		//implementing findArea() method
	{
		double area3 = (b*h) / 2;
        	System.out.println("Area of Triangle: "+area3);
    }
	void findPerimeter()	//implementing findPerimeter() method
	{
		double peri3 =a + b + c;
		System.out.println("Perimeter of Triangle: "+peri3);
	}
}        
public class Assignment5_2 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		double l,b,r,a,c,h;		//variable declaration
        Scanner get = new Scanner(System.in);
        System.out.print("\nEnter Radius of Circle: ");
        r=get.nextDouble();
        Figure circle = new Circle(r);	//passing parameter to Circle class constructor
        circle.findArea();	//invoking findArea method of Circle class
        circle.findPerimeter();	//invoking findPerimeter method of Circle class
        System.out.print("\nEnter Length & Breadth of Rectangle: ");
        l=get.nextDouble();
        b=get.nextDouble();
        Figure rectangle = new Rectangle(l,b);	//passing parameters to Rectangle class constructor
        rectangle.findArea();	//invoking findArea method of Rectangle class
        rectangle.findPerimeter();	//invoking findPerimeter method of Rectangle class
        System.out.print("\nEnter Sides & Vertical Height of Triangle: ");
        a=get.nextDouble();
        b=get.nextDouble();
        c=get.nextDouble();
        h=get.nextDouble();
        Figure triangle = new Triangle(a,b,c,h);	//passing parameters to Triangle class constructor
        triangle.findArea();	//invoking findArea method of Triangle class
        triangle.findPerimeter();	//invoking findPerimeter method of Triangle class
	}    
}