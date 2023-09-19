import java.util.Iterator;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class DisplayData {

	public static void main(String[] args) {
		
		
		Configuration con=new Configuration();
		con.configure("hibernate.cfg.xml");
		SessionFactory sess=con.buildSessionFactory();
		Session ses=sess.openSession();
		Query query=ses.createQuery("from Model");
		List<Model> list=query.list();
		for(Model reg:list) {
			
			System.out.println(reg.getId()+"  "+reg.getName()+"  "+reg.getTime());
		}
		

	}

}
