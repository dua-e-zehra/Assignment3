//Maria Irum 3911,Maria Jabeen 3932,Dua-e-zehra 3934
package dateTime;

public class Date {
	private int day;
	private int month;
	private int year;
	Date()
	{
		day=0;
		month=0;
		year=0;
	}
	public Date(int day,int month,int year)
	{
		this.day=day;
		this.month=month;
		this.year=year;
	}
	public int getDay()
	{
		return day;
	}
	int getmonth()
	{
		return month;
	}
	int getYear()
	{
		return year;
	}
	void setDay(int day)
	{
		this.day=day;
	}
	void  setmonth(int month)
	{
		this.month=month;
	}
	void setYear(int year)
	{
		this.year=year;
	}
	public String toString()
	{
		return day+ "-" +month+ "-" +year;
	}
	

}
