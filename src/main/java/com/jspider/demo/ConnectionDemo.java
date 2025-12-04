package com.jspider.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ConnectionDemo {
    public static void main(String[] args) {
        System.out.println(" program start..");


        //load configuration
        Configuration config = new Configuration();
        config.configure("hibernate.cfg.xml");

        // build session factory
        SessionFactory sf= config.buildSessionFactory();
        System.out.println(" SessionFactory created ");
        //get session from session factory

        Session session=sf.openSession();
        System.out.println(" session created");
        //logics.

        //close session
        session.close();
        System.out.println(" session closed");
        // close session factory.
        sf.close();
        System.out.println(" SessionFactory closed");


        System.out.println(" program end.");
    }
}
