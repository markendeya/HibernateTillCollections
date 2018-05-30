package com.app.Test;




import java.util.Date;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.app.model.Employee;
import com.app.util.HibernateUtil;

public class Test {

	public static void main(String[] args) {
		Transaction tx=null;
		try(Session ses=HibernateUtil.getSf().openSession())
		{
			tx=ses.beginTransaction();
			//opertion
		Employee e=new Employee();
		  e.setEmpid(111);
		  e.setEmpname("nmk");
		  e.setEmpsal(200.00);
		  e.setD1(new Date());
		  e.setD2(new Date());
		  e.setD3(new Date());
		  e.getPrjs().add("p1");
		  e.getPrjs().add("p2");
		  e.getPrjs().add("p3");
		e.getLs().add("p1");
		e.getLs().add("p2");
		e.getLs().add("p3");
		e.getMap().put(10,"p1");
		e.getMap().put(20, "p2");
		e.getMap().put(30, "p3");
		 // File f=new File("D:/firstapp/1.jpg");
		 // FileInputStream fis=new FileInputStream(f);
		 // byte[] arr=new byte[fis.available()];
		//  fis.read(arr);
		//  e.setDte(arr);
		  
		  
		  String s="hello ,how r u";
		  char[] carr=s.toCharArray();
		  e.setDte1(carr);
		  ses.save(e);
		// fis.close();
		 
		  tx.commit();
			
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
			tx.rollback();
		}

	}

}
