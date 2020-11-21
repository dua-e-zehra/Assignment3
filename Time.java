//Maria Irum 3911,Maria Jabeen 3932,Dua-e-zehra 3934
package dateTime;

public class Time {
	int hour;
	int min;
	String m;
	Time()
	{
		hour=0;
		 min=0;
		 m="";	
	}
	public Time(int hour,int min,String m)
	{
		this.hour=hour;
		 this.min=min;
		 this.m=m;
	}
	int getHour()
	{
		return hour;
	}
	int getMin()
	{
		return min;
	}
	String getAmPm()
	{
		return m;
	}
	void setHour(int hour)
	{
		this.hour=hour;
	}
	void setMins(int min)
	{
		this.min=min;
	}
	void setAmPm(String m)
	{
		this.m=m;
	}
	public String toString()
	{
		return hour+ ":" +min+ ":" +m;
	}
	

}
