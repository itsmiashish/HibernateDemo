package com.jspider.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CreateTableDemo {
    public static void main(String[] args) {
        System.out.println(" program start..");
        Configuration config=new Configuration();
        config.configure("hibernate.cfg.xml");
        System.out.println(" table created");
        SessionFactory sessionFactory=config.buildSessionFactory();
        Session session=sessionFactory.openSession();
        session.close();
        sessionFactory.close();



        System.out.println(" program ends..");
    }
}
