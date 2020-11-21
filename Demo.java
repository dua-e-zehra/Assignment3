//Maria Irum 3911,Maria Jabeen 3932,Dua-e-zehra 3934
public class Demo {
	public static void main(String[] args) 
	{
		Circle c=new Circle(4.2,"blue",true);
		System.out.println("    1)Circle  ");
		c.displayDetail();
		System.out.println(c);
		Rectangle r=new Rectangle(2.3,4.5,"brown",true);
		System.out.println("    2)Rectangle   ");
		r.display();
		System.out.println(r);
		Square s=new Square(4,"Gray",true);
		System.out.println("    3)Square   ");
		s.display();
		System.out.println(s);

	}
}
