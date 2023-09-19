import java.time.LocalTime;
import java.util.Scanner;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.type.LocalTimeType;

public class Insert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Configuration con=new Configuration();
		con.configure("hibernate.cfg.xml");
		SessionFactory sf=con.buildSessionFactory();
		Session ses=sf.openSession();
		Transaction ts=ses.beginTransaction();
		System.out.println("1");
		Scanner scan=new Scanner(System.in);
		System.out.println("Hello Employee");
		System.out.println("Please enter your name: ");
		String name=scan.next();
		System.out.println("Time of arrival: "); 
		String time=scan.next();
//		LocalTime UserTime=LocalTime.parse(time);
//		
//		LocalTime startTime =LocalTime.parse("09:00:00");
//		LocalTime endTime =LocalTime.parse("09:10:00");
//		
//		if(UserTime.isAfter(startTime) && UserTime.isBefore(endTime))
//		{
//			System.out.println("you are on time, goodjob");
//					}
//		else {
//			System.out.println("YOu are Late, please be on time tomorrow");
//		}
		
		
		Model reg=new Model() ;
		reg.setName(name);
		reg.setTime(time);
		
		ses.save(reg);
		ts.commit();
		
		System.out.println("Data inserted");
		
 
	}

}
