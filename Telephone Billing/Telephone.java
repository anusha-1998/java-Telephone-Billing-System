package TelephoneBillingSystem;

import java.util.Scanner;

public class Telephone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float ncpermin = 0.80f,icpermin = 1.50f,tpernmsg = 1.0f,tperimsg = 2.0f,perMB = 8.7f;
		double tntnmin,tntncall,tntimin,tnticall,tnmsg,tnmsgcost,timsg,timsgcost,useddata,data,totalcost,finalcost,totaldiscount; 
		
		System.out.println("Enter array size : ");
		Scanner scan=new Scanner(System.in);
		int size=scan.nextInt();
		
		int a[]=new int[size];
		int i = 0;
		
		for(i=0; i<a.length;i++)
		{
		
		Scanner sc = new Scanner(System.in);
	    System.out.println("enter client First Name: ");
	    String fname = sc.next();
	
	    System.out.println("enter client Second Name: ");
	    String lname = sc.next();
	
	    System.out.println("Enter Phone number: ");
	    String phno = sc.next();
	    String number ="\\d{10}";
	    boolean phoneno = phno.matches(number);
	    if(phoneno){
	    	int ch;
	    	char ch1;
	    	Scanner s = new Scanner(System.in);
	    	do
	    	{
	    		System.out.println("Given number is valid");
	    		System.out.println("Enter your choice : "+"\n 1.Normal Calls Bill"+"\n 2.InterNational Calls Bill"+"\n 3.Normal Messages Bill"+"\n 4.InterNational Messages Bill"+"\n 5.DataUsed Bill"+"6.Total Bill\n ");
	    		ch = s.nextInt();
	    		
	    		switch(ch)
				{
				case 1:
					System.out.println("Enter Total Normal Calling in minutes :");
				    tntnmin = sc.nextDouble();
				    tntncall = tntnmin*ncpermin;
				    System.out.println("your normal phone calling amount is : "+tntncall);
				    break;
				case 2:
					System.out.println("Enter total international calls in minutes :");
					tntimin = sc.nextInt();
					tnticall = tntimin*icpermin;
					System.out.println("your international phone calling amount is :" +tnticall);
					break;
				case 3:
					System.out.println("Enter Total Normal Messages you send :");
					tnmsg = sc.nextDouble();
					tnmsgcost = tnmsg*tpernmsg;
					System.out.println("Your Total Normal Message Cost is :"+tnmsgcost);
					break;
				case 4:
					System.out.println("Enter Total InterNational Messages you send :");
					timsg = sc.nextDouble();
					timsgcost = timsg*tperimsg;
					System.out.println("YOur Total InterNational Message Cost is :"+timsgcost);
					break;
				case 5:
					System.out.println("Enter how much data used in MB");
					useddata = sc.nextDouble();
					data = useddata*perMB;
					System.out.println("your data usage amount is : "+data);
					break;
				case 6:
					System.out.println("Enter total normal calling in minutes : ");
					tntnmin = sc.nextDouble();
					tntncall=tntnmin*ncpermin;
					System.out.println("Enter total InterNational calling in minutes : ");
					tntimin = sc.nextDouble();
					tnticall = tntimin*icpermin;
					System.out.println("Enter Total Normal Messages you send :");
					tnmsg = sc.nextDouble();
					tnmsgcost = tnmsg*tpernmsg;
					System.out.println("Enter Total InterNational Messages you send :");
					timsg = sc.nextDouble();
					timsgcost = timsg*tperimsg;
					System.out.println("Enter how much data used in MB");
					useddata = sc.nextDouble();
					data = useddata*perMB;
					totalcost = (tntncall+tnticall+tnmsgcost+timsgcost+data);
					System.out.println("your amount is : ");
					if(totalcost>=1000)
					{
						System.out.println("your are eligible for discount");
					    totaldiscount=totalcost*5/100;
					    finalcost=totalcost-totaldiscount;
					    System.out.println("Your total amount is : " +finalcost);
					    
					}
					
					else
					{
						System.out.println("Sorry you are not eligible for discount");
					    finalcost=totalcost;
					    System.out.println("Your total amount is : "+finalcost);
					    
					}
					
					break;
				case 7:
					break;
					default:
						System.out.println("invalid choice");
				}
				System.out.println("Do you want to continue(y/n)");
				ch1=s.next().charAt(0);
			}
			while(ch1=='y' || ch1=='Y');

	    }
	    else
		{
			System.out.println("enter valid phone number");
		}
	    
	    	}
	}
}
	    
	    
