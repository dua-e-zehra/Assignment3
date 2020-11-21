//Maria Irum 3911,Maria Jabeen 3932,Dua-e-zehra 3934
public abstract class Shape {
	String color="Red";
	boolean filled=true;
	Shape()
	{
		color="Green";
		filled=true;
	}
	Shape(String color,boolean filled)
	{
		this.color=color;
		this.filled=filled;
	}
	String getcolor()
	{
		return color;
	}
	void setcolor(String color)
	{
		this.color=color;
	}
	abstract double getArea();
	abstract double getPerimeter();
	boolean isfilled()
	{
		if(filled==true)
			return true;
		else
			return false;
	}
	void setfilled(boolean filled)
	{
		this.filled=filled;
	}
	public String toString()
	{
		return "A Shape with color of "+color+ " and "+filled+" filled ";
	}

}
