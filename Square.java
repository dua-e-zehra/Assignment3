//Maria Irum 3911,Maria Jabeen 3932,Dua-e-zehra 3934
public class Square extends Rectangle
{
  Square(double side)
  {
	  super(side,side);
  }
  Square(double side,String col,boolean fill)
  {
	  super(side,side,col,fill);
  }
  double getside()
  {
	  return super.getLength();
  }
  void setside(double side)
  {
	  super.setLength(side);
  }
  void setLength(double s)
  {
	  super.setLength(s);
  }
  void setWidth(double w)
  {
	  super.setWidth(w);
  }
  double getArea()
  {
	  return getside()*getside();
  }
  double getPerimeter()
  {
	  return 4*getside();
  }
  public String toString()
  {
	  return "A Square with side=" +getside()+ ", which is a subclass of Rectangle, where " +super.toString()+ " is the output of the toString() method from the superclass.";
  }
  void display()
  {
	  System.out.println("Color of a Square is:"+getcolor());
	  System.out.println("Area of a Square is:"+getArea());
		System.out.println("Perimeter of a Square is:"+getPerimeter());
  }
  
 
  
}
