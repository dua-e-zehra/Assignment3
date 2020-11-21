//Maria Irum 3911,Maria Jabeen 3932,Dua-e-zehra 3934
package hospital;

import javax.swing.JOptionPane;
public class IndoorPatient extends Patient
{
	private int wardNo;
	private int roomNo;
	private int bedNo;
	private Doctor doc;
	private double fee;
	dateTime.Date da;
	IndoorPatient()
	{
	super();
	wardNo=0;
	roomNo=0;
	bedNo=0;
	fee=0.0;
	}
	IndoorPatient(String name, String cnic,String address, String phone_no, String gender, int age,int wardNo,
			int roomNo,int bedNo,Doctor doc,double fee,dateTime.Date da)
	{
		super(name, cnic,address,phone_no,gender,age);
		this.wardNo=wardNo;
		this.roomNo=roomNo;
		this.bedNo=bedNo;
		this.doc=doc;
		this.fee=fee;
		this.da=da;
	}
	void addindoorPatient(String name, String cnic, String phone_no, String gender, String address, int age,int wardNo,
			int roomNo,int bedNo,Doctor doc,double fee,dateTime.Date da)
	{
		super.addPatient(name, cnic,address,phone_no,gender, age);
		this.wardNo=wardNo;
		this.roomNo=roomNo;
		this.bedNo=bedNo;
		this.fee=fee;
		this.doc=doc;
		this.da=da;
	}
	dateTime.Date getdayy()
	{
		return da;
	}
	 String appointments(int day,IndoorPatient d[])
	   {
			   String str1="";
		   for(int i=0;i<d.length;i++)
		   {
			   if(d[i]!=null)
			   {
				   if(d[i].da.getDay()==day)
					   str1=str1+d[i].getName()+ "";
				   else
					   str1="";
			   }
		   }
			   if(str1=="")
			      str1="No indoor patient appointments on day:";	 
		   return str1;
	   }
	 void displayindoor(IndoorPatient d[])
	 {
		 String str="";
		 for(int i=0;i<d.length;i++)
		 {
			 if(d[i]!=null)
			 str=str+" Name\n"+d[i].getName();
		 }
		 JOptionPane.showMessageDialog(null, str,"LIST OF INDOOR PATIENTS",JOptionPane.WARNING_MESSAGE);
	 }
	 public String appointDoctor(String name, IndoorPatient f[]) 
	 {
			String str1 = "";
			String str2 = " with Doctor '" + name +"'.";
			for (int i = 0; i < f.length; i++) {
				if (f[i] != null) {
					if (f[i].getName().compareTo(name) == 0)
						str1 = str1 + str2 + " ";
				}
			}
			return str1;
	 }
	 int getwardNo()
	 {
		 return wardNo;
	 }
	 void setwardNo(int w)
	 {
		 wardNo=w;
	 }
	int getroomNo()
	{
		return roomNo;
	}
	int getbedNo()
	{
		return bedNo;
	}
     Doctor doc()
     {
    	 return doc;
     }
	double getfee()
	{
		return fee;
	}
	dateTime.Date da()
	{
		return da;
	}
}
