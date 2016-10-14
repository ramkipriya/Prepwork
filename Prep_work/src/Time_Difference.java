
import java.io.*;

public class Time_Difference {	
     static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
     int month[]={0,31,28,31,30,31,30,31,31,30,31,30,31};
     
	  public static void main(String[] args)throws IOException{
		  	Time_Difference ob=new Time_Difference();
		  	System.out.print("Enter the 1st date in (dd/mm/yyyy) format: ");
		  	String date1=br.readLine().trim();
		  	int p,q;
		  
		  //Extracting the day
		    p=date1.indexOf("/");
		  	int d1=Integer.parseInt(date1.substring(0,p));
		  	
		 //Extracting the month
		  	q=date1.lastIndexOf("/");
		     int m1=Integer.parseInt(date1.substring(p+1,q));
		  	
		  //Extracting the year
		  	int y1=Integer.parseInt(date1.substring(q+1));
		  	
	  	
		  	System.out.print("Enter the 2nd date in (dd/mm/yyyy) format: ");
		  	String date2=br.readLine().trim();
		  	p=date2.indexOf("/");
		  	int d2=Integer.parseInt(date2.substring(0,p));
		  	q=date2.lastIndexOf("/");
		  	int m2=Integer.parseInt(date2.substring(p+1,q));
		  	int y2=Integer.parseInt(date2.substring(q+1));
		  	

		  	//validating both the date
		  	if(ob.dateValidate(d1,m1,y1)==true && ob.dateValidate(d2,m2,y2)==true)
		  	{
		  		int a=ob.dayno(d1,m1,y1);
		  		int b=ob.dayno(d2,m2,y2);
		  		int dn=Math.abs(a-b);
		  		long time=dn*24;
		  		System.out.println("------------------------------------");
		  		System.out.println("The Difference in 2 dates ="+dn+"days.");
		  		System.out .println("------------------------------------");
		  		System.out.println("The Difference in time ="+time+"hours");
		  	}else
		  		System.out.println("Invalid dates");
		  		
		  	}
	  
	  //Function to check for Leap year
	  int Leapyear(int y)
	  {
		  if((y%400==0)||((y%100!=0)&&(y%4==0)))
		  return 29;
		  
		  else
			  return 28;
		  }
	  
	  //Function for checking date validation
	  boolean dateValidate(int d,int m,int y)
	  {
	  month[2]=Leapyear(y);
	  if(m<0 || m>12 || d<0 || d>month[m] || y<0 || y>9999)
			  return false;
	  else 
		      return true;
	  	  }
	  
	  int dayno(int d,int m,int y)
	  {
		  int dn=0;
		  month[2]=Leapyear(y);
		  for(int i=1;i<m;i++)
		  {dn=dn+month[i];}
		  dn=dn+d;
		  for(int i=1; i<y; i++)
		  {if(Leapyear(i)==29)
			  dn=dn+366;
		  else
			  dn=dn+365;}
		  return dn;		  
	  	  }
	}

