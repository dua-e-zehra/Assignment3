//Maria Irum 3911,Maria Jabeen 3932,Dua-e-zehra 3934
public class Rectangle extends Shape
{
private double length=1.0;
private double width=1.0;
Rectangle()
{
	super();
	length=1.0;
	width=1.0;
}
Rectangle(double length,double width)
{
	this.length=length;
	this.width=width;
}
Rectangle(double length,double width,String col,boolean fill)
{
	super(col,fill);
	this.length=length;
	this.width=width;
}
 double getWidth()
 {
	return width;
}
 void setWidth(double width)
 {
	this.width=width; 
 }
 double getLength()
 {
	 return length;
 }
 void setLength(double length)
 {
	 this.length=length;
 }
 double getArea()
 {
	 return length*width;
 }
 double getPerimeter()
 {
	 return 2*(length+width);
 }
 public String toString()
 {
	 return "A Rectangle with width=" +width+ " and length=" +length+ ", which is a subclass of Shape, where " +super.toString()+ " is the output of the toString() method from the superclass.";
 }
 void display()
 {
	    System.out.println("Color of a Rectangle is:"+getcolor());
	    System.out.println("Length of a Rectangle is:"+getLength());
		System.out.println("Width of a Rectangle is:"+getWidth());
		System.out.println("Area of a Rectangle is:"+getArea());
		System.out.println("Perimeter of a Rectangle is:"+getPerimeter());
 }
}
