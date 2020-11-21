//Maria Irum 3911,Maria Jabeen 3932,Dua-e-zehra 3934
public class Circle extends Shape
{
  private double radius=1.0;
  Circle()
  {
	  radius=1.0;
  }
  Circle(double  radius)
  {
	  super();
	  this.radius= radius;
  }
  Circle(double  radius,String col,boolean fill)
  {
	  super(col,fill);
	  this.radius= radius;
  }
  double getradius()
  {
	  return radius;
  }
  void setradius(double  radius)
  {
	  this.radius= radius;
  }
  double getArea()
  {
	  return 3.14*(radius*radius);
  }
  double getPerimeter()
  {
	  return 2*3.14*radius;
  }
  public String toString()
  {
	  return "A Circle with radius="+radius+ ", which is a subclass of Shape;where "+super.toString()+ " is the output of the toString() method from the superclass.";
  }
  void displayDetail()
  {
	  System.out.println("Color of a circle is:"+getcolor());
	  System.out.println("Area of a circle is:"+getArea());
		System.out.println("Radius of a circle is:"+getradius());
		System.out.println("Perimeter of a circle is:"+getPerimeter());
  }
}
