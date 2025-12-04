package com.jspider.project.bms.main;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class OnetoMany {
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
    public static void main(String[] args) {
        System.out.println(" program start");
        System.out.println(" program ends..");

    }
}
