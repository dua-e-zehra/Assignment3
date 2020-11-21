//Maria Irum 3911,Maria Jabeen 3932,Dua-e-zehra 3934
package hospital;

public class Patient {
	private String name;
	private String cnic;
	private String address;
	private String phone_no;
	private String gender;
	private int age;
	Patient()
	{
	 name="";
     cnic="";
	 address="";
	 phone_no="";
	 gender="";
	 age=0;
	}
	Patient(String n,String cn,String add,String ph,String g,int a)
	{
		 name=n;
	     cnic=cn;
		 address=add;
		 phone_no=ph;
		 gender=g;
		 age=a;
	}
	void addPatient( String name, String cnic, String phone_no, String gender, String address, int age)
	{
	this.name = name;
	this.cnic = cnic;
	this.phone_no = phone_no;
	this.gender = gender;
	this.address = address;
	this.age = age;
	}
	String getName()
	{
		return name;
	}
	String getcnic()
	{
		return cnic;
	}
	String getadd()
	{
		return address;
	}
	String getph()
	{
		return phone_no;
	}
	String getgender()
	{
	return gender;
	}
	int getage()
	{
		return age;
	}
	void setadd(String add)
	{
		address=add;
	}
	void setage(int a) 
	{
		age=a;
	}
}
