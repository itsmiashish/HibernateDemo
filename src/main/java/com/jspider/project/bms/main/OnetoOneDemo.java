package com.jspider.project.bms.main;

import com.jspider.project.bms.Audi2;
import com.jspider.project.bms.AudiAddress;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class OnetoOneDemo {
    static SessionFactory sessionfactory;
        static
        {
            System.out.println("1.Load Configuration");
            Configuration config = new Configuration();
            config.configure("hibernate.bms.cfg.xml");

            //create sessionfactory
            System.out.println("2.Create SessionFactory");
           sessionfactory = config.buildSessionFactory();
        }


public  static  void addaudi()
{
    System.out.println(" open session");
    Session session = sessionfactory.openSession();

    System.out.println(" create transaction..");
    Transaction tx = session.beginTransaction();

    System.out.println(" crating object of audi2 and AudiAddress");
    Audi2 audi2 = new Audi2();
    AudiAddress audiAddress = new AudiAddress();
    audi2.setName("newAudi");
    audi2.setSeatRows(34);
    audi2.setColRows(45);
    audiAddress.setCity("New York");
    audiAddress.setPincode(451237);
    audiAddress.setStreet("4Bcv");
    System.out.println(" save address in  database");
    audi2.setAddress(audiAddress);
    System.out.println(" save auditoriums details in  database");
    session.persist(audi2);
    System.out.println(" transaction commit");
    tx.commit();
    System.out.println(" session close");
    session.close();
    System.out.println(" session factory close");
    sessionfactory.close();
}

public static void getdetails()
{
    Session session = sessionfactory.openSession();

    Transaction tx = session.beginTransaction();
    Audi2 a1=session.find(Audi2.class,1);
    System.out.println(a1.getName());
    System.out.println(a1.getSeatRows());
    System.out.println(a1.getColRows());

    System.out.println(a1.getAddress().getAaid());
    System.out.println(a1.getAddress().getCity());
    System.out.println(a1.getAddress().getPincode());
    System.out.println(a1.getAddress().getStreet());

}
public  static void getdetails2(Long id)
{
    Session session = sessionfactory.openSession();
    Transaction tx = session.beginTransaction();
AudiAddress a1=session.find(AudiAddress.class, id);

    System.out.println();
    System.out.println(a1.getAaid());
    System.out.println(a1.getCity());
    System.out.println(a1.getPincode());
    System.out.println(a1.getStreet());

    System.out.println();
    System.out.println(" =========  audi details");
    System.out.println(a1.getAudi2().getName());
    System.out.println(a1.getAudi2().getSeatRows());
    System.out.println(a1.getAudi2().getColRows());


}
    public static void main(String[] args) {

        System.out.println(" program start");
//       addaudi();
//getdetails();
        getdetails2(1l);
sessionfactory.close();
        System.out.println(" program ends..");
    }
}
