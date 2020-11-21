//Maria Irum 3911,Maria Jabeen 3932,Dua-e-zehra 3934
package hospital;

import javax.swing.JOptionPane;

public class Doctor {
	private String docname;
	private String cnic;
	private String phone_no;
	private String gender;
	private String department;
	private String specialization;
	Doctor()
	{
		docname="";
		cnic="";
		phone_no="";
		gender="";
		department="";
		specialization="";
	}
	Doctor(String Dn,String cn,String ph,String g,String dep,String spe)
	{
		 docname=Dn;
		 cnic=cn;
		 phone_no=ph;
		 gender=g;
		 department=dep;
		 specialization=spe;
	}
	void getDocdata()
	{
		docname=JOptionPane.showInputDialog("Enter Doctor name:");
		cnic=JOptionPane.showInputDialog("Enter Doctor CNIC:");
		phone_no=JOptionPane.showInputDialog("Enter doctor phone no:");
		gender=JOptionPane.showInputDialog("Enter doctor gender");
		department=JOptionPane.showInputDialog("Enter department name of doctor:");
		specialization=JOptionPane.showInputDialog("Enter specilization of doctor:");
	}
	boolean searchName(String name,Doctor d[])
	 {
		for(int i=0;i<d.length;i++)
		{
			if(d[i]!=null)
			{
				if(d[i].getdocname()==docname)
					return true;
			}
		}
		return false;
	 }
	boolean searchDepartment(String dep,Doctor d[])
	{
	     for(int i=0;i<d.length;i++)
	      {
		    if(d[i]!=null)
		     {
			  if(d[i].department==dep)
				return true;
		     }        
	      }		
	     return false;
	}
	String getdocname()
	{
		return docname;
	}
	String  getcnic()
	{
		return cnic;
	}
	String getphoneno()
	{
		return phone_no;
	}
	String getgender()
	{
	return gender;
	}
	String getdepartment()
	{
		return department;
	}
	String getspecialization()
	{
		return specialization;
	}
	void setphoneno(String ph)
	{
		 phone_no=ph;
	}
	void setdepartment(String d)
	{
		department=d;
	}
	void setspcialization(String s)
	{
		specialization=s;
	}
	

}
