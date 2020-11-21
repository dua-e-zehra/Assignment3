//Maria Irum 3911,Maria Jabeen 3932,Dua-e-zehra 3934
package hospital;

import javax.swing.JOptionPane;

public class Democlass {
	public static void main(String args[])
	{
	String opt="";
	String str="";
	int no;
	Doctor doc[]=new Doctor[10];
	IndoorPatient i[]=new IndoorPatient[10];
	OutdoorPatient j[]=new OutdoorPatient[10];
	dateTime.Date d[]=new dateTime.Date[5];
	dateTime.Time t[]=new dateTime.Time[5];	
	d[0]=new dateTime.Date(2,4,2020);
	d[1]=new dateTime.Date(13,8,2011);
	d[2]=new dateTime.Date(22,12,2019);		
	t[0]=new dateTime.Time(4,8,"am");
	t[1]=new dateTime.Time(8,12,"pm");
	t[2]=new dateTime.Time(12,45,"pm");
	doc[0]=new Doctor("Farah","611014275336","986497","female","gyne","gynecologists");
	doc[1]=new Doctor("Asim","611014275336","986497","male","crdic","cardiologists");
	do 
	{
		JOptionPane.showMessageDialog(null,"1:Add an indoor patient.\n2:Add an outdoor patient.\n"
				+"3:See the list of all doctors.\n4:Search a doctor by name or department.\n"
				+ "5:See the list of all indoor patients.\n6:See the list of all appointments on a certain day\n"
				+ "7:See the list of appointments of a certain doctor\n8:Change the date or time of appointment of a certain patient\n"
				+ "9 Exit\n","Select Option",JOptionPane.WARNING_MESSAGE);
				opt=JOptionPane.showInputDialog("Enter Option:");
		no=Integer.parseInt(opt);
		if(no==1)
		{
			IndoorPatient in=new IndoorPatient();
			in.addindoorPatient("Haider","42101-5453453","031243454","Male","street1 H-6", 23,1, 1, 1, doc[1],2500,d[1]);			
		}
		else if(no==2)
		{
			OutdoorPatient op=new OutdoorPatient();
			op.addOutdoorPatient("Maria","42101-53455","03243445","Female","atreet5 gh-3",20,340, doc[1],d[1],t[1]);
		}
		else if(no==3)
		{
			String dis="";
			for(int g=0;g<doc.length;g++)
			{
				if(doc[g]!=null)
					dis=dis+" name is :"+doc[g].getdocname()+"\n";
				else
					dis=dis+"";
			}
			JOptionPane.showMessageDialog(null,dis);
		}
		else if(no==4)
		{
			int x;
			JOptionPane.showMessageDialog(null, "1:Search doctor by Name.\n 2:Search doctor by Department.\n","OPTION SELECTION",JOptionPane.WARNING_MESSAGE);
			str=JOptionPane.showInputDialog("Select option");
			  x=Integer.parseInt(str);
			  String dis="";
			  if(x==1)
			  {
				  int mat=0;
				  dis=JOptionPane.showInputDialog("Enter Doctor Name");
				for(int g=0;g<doc.length;g++)
				{
					if(doc[g]!=null)
					{
						if(doc[g].getdocname()==dis)
							mat=1;	
					}
				}
				if(mat==1)
				 JOptionPane.showMessageDialog(null, "Doctor exists ","SEARCH RESULTS",JOptionPane.WARNING_MESSAGE);
					else
						JOptionPane.showMessageDialog(null, "Doctor does not exist ","SEARCH RESULTS",JOptionPane.WARNING_MESSAGE);
			  }
			  else if(x==2)
			  {
				  int mat=0;
				  dis=JOptionPane.showInputDialog("Enter Department Name");
				  for(int g=0;g<doc.length;g++)
				{
					if(doc[g]!=null)
					{
						if(doc[g].getdepartment()==dis)
							mat=1;
							 
					}
				}
				  if(mat==1)
				  JOptionPane.showMessageDialog(null, "Doctor exists ","SEARCH RESULTS",JOptionPane.WARNING_MESSAGE);
					else
						JOptionPane.showMessageDialog(null, "Doctor does not exist ","SEARCH RESULTS",JOptionPane.WARNING_MESSAGE);
			  }
		}
		else if(no==5)
		{
			IndoorPatient y=new IndoorPatient();
			y.displayindoor(i);
		}
		else if(no==6)
		{
			int x;
			IndoorPatient y=new IndoorPatient();
			OutdoorPatient z=new OutdoorPatient();
			str=JOptionPane.showInputDialog("Day ");
			x=Integer.parseInt(str);
			str=y.appointments(x,i);
			str=str+z.appointments(x, j);
			 JOptionPane.showMessageDialog(null,str,"APPOINTMENT ON CERTAIN DATE",JOptionPane.WARNING_MESSAGE);
		}
		else if(no==7)
		{
			String s;
			IndoorPatient y=new IndoorPatient();
			String str2=JOptionPane.showInputDialog("Doctor name:");
			s=y.appointDoctor(str2,i);
			 JOptionPane.showMessageDialog(null,s,"APPOINTMENT WITH CERTAIN DOCTOR",JOptionPane.WARNING_MESSAGE);
		}
		
	}while(no!=9);
	}
}