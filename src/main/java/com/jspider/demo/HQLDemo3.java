package com.jspider.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.Scanner;

public class HQLDemo3 {
    public  static void login(){
        //load configuration
        Configuration config = new Configuration();
        config.configure("hibernate.cfg.xml");

        SessionFactory sessionFactory = config.buildSessionFactory();
        System.out.println("sessionFactory created..");


        Session session = sessionFactory.openSession();//connect to db
        System.out.println("session created..");
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter  phone number : ");
        String mobile =sc.nextLine();
        System.out.println("enter password ");
        String password=sc.nextLine();

        String selectUserByName_HQL = "FROM Users use WHERE use.mobile = :mobile AND use.password = :password";
        Query<Users> query = session.createQuery(selectUserByName_HQL, Users.class);
      query.setParameter("mobile",mobile);
      query.setParameter("password",password);

       Users users = query.uniqueResult();
        System.out.println(users);
//       if(users!=null){
//           System.out.println(" login successfully..");
//       }
//       else {
//           System.out.println("login failed..");
//       }






    }
    public static void main(String[] args) {
        System.out.println(" progarm start..");
        login();
        System.out.println(" progarm ends..");
    }
}
