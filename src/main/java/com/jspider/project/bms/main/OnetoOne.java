package com.jspider.project.bms.main;

import com.jspider.project.bms.Address;
import com.jspider.project.bms.Audi;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class OnetoOne {
    private static SessionFactory sessionFactory = null;
    static
    {
        //load configuration
        System.out.println("1.Load Configuration");
        Configuration config = new Configuration();
        config.configure("hibernate.bms.cfg.xml");

        //create sessionfactory
        System.out.println("2.Create SessionFactory");
        sessionFactory = config.buildSessionFactory();
    }

    public static void saveAudi(){
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        System.out.println(" creating audi data");
        Audi audi = new Audi();
        audi.setAudiName("Audi");
        audi.setSeatRow(20);
        audi.setSeatCol(52);

        System.out.println(" crating address data");
        Address address = new Address();
        address.setStreet("street-1");
        address.setCity("city-1");
        address.setArea("HBR");
        System.out.println(" linking audi to  address data");
        audi.setAddress(address); // link audi Adress


        session.persist(audi);
        System.out.println("Audi and Address saved!!");
        tx.commit();
        session.close();
    }
public static void  deleteaudi(){

        Session session = sessionFactory.openSession();
        Audi audi = session.find(Audi.class, 1);
    session.remove(audi);
    System.out.println(" Audi and  address is  deleted ");
    Transaction tx = session.beginTransaction();
tx.commit();
    session.close();
}


    public static void getAudiDetails(){
 Session session = sessionFactory.openSession();
 Transaction tx = session.beginTransaction();
 Audi a1=session.find(Audi.class, 2);
        System.out.println(a1);
        tx.commit();
        session.close();
        System.out.println(" session closed");

    }

    public static void updateAudi(){
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        Audi a1=session.find(Audi.class, 2);
        Address address=session.find(Address.class, 2);
        System.out.println(a1);
        System.out.println(" trying to update audi data");
        a1.setAudiName("Gayatri Vihar ");
        a1.setSeatRow(20);
        a1.setSeatCol(52);
        address.setStreet("RajajiNagar");
        address.setCity("BNC");
        address.setArea("HSR");
        session.merge(a1);
        tx.commit();
        session.close();
    }



    public static void main(String[] args) {
        System.out.println(" program start");
//        saveAudi(); // insert data
//deleteaudi();// delete audi and address
//getAudiDetails();// getdetails
//        updateAudi(); // update
        System.out.println(" 3.session closed");
        System.out.println("4.Close Session Factory");

        sessionFactory.close();

        System.out.println("Program ends...");

    }
}
