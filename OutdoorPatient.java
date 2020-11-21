//Maria Irum 3911,Maria Jabeen 3932,Dua-e-zehra 3934
package hospital;

public class OutdoorPatient extends Patient 
{
	dateTime.Date dateofappointment;
	dateTime.Time timeofappointment;
	Doctor doc;
	private double fee;
	OutdoorPatient()
     {
    	 super();
    	 fee=0.0;
     }
     OutdoorPatient(String name, String cnic, String phone_no, String gender, String address, int age,int fee,Doctor doc,
    		 dateTime.Date dateofappointment,dateTime.Time timeofappointment)
     {
    	 super(name, cnic, phone_no, gender, address, age);
			this.fee = fee;
			this.doc = doc;
			this.dateofappointment = dateofappointment;
			this.timeofappointment = timeofappointment;
     }
     void addOutdoorPatient(String name, String cnic, String phone_no, String gender, String address, int age,
    		 double fee,Doctor doc,dateTime.Date dateofappointment,dateTime.Time timeofappointment)
 	   {
		super.addPatient(name, cnic, phone_no, gender, address, age);
 		this.fee=fee;
 		this.doc=doc;	
 		this.dateofappointment = dateofappointment;
		this.timeofappointment = timeofappointment;
	   }
     String appointments(int day,OutdoorPatient j[])
	   {
			   String str1="";
		   for(int i=0;i<j.length;i++)
		   {
			   if(j[i]!=null)
			   {
				   if(j[i].dateofappointment.getDay()==day)
					   str1=str1+j[i].getName()+" ";
			   }
		   }
			   if(str1=="")
			  		   str1="No outdoor patient appointments on day:";	 
			    return str1;
	   }
     dateTime.Date getdateofappointment()
     {
    	 return dateofappointment;
     }
 	dateTime.Time gettimeofappointment()
 	{
 		return timeofappointment;
 	}
 	Doctor getdoc()
 	{
 		return doc;
 	}
 	 double getfee()
 	 {
 		 return fee;
 	 }

}
