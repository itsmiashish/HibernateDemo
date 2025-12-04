package com.jspider.project.bms;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.List;
import java.util.Scanner;

public class HQLDemo2 {
    public static void main(String[] args) {
        System.out.println(" program start..");

        //load configuration
        Configuration config = new Configuration();
        config.configure("hibernate.cfg.xml");

        //build session factory
        SessionFactory sessionFactory = config.buildSessionFactory();
        System.out.println("sessionFactory created..");

        Session session = sessionFactory.openSession();//connect to db
        System.out.println("session created..");

//        String selectMovieByName_HQL = "FROM Movie mve WHERE mve.id = 2";
//
//        Query<Movie> query = session.createQuery(selectMovieByName_HQL, Movie.class);
//      List<Movie> movies = query.getResultList();
//      for (Movie movie : movies) {
//          System.out.println(movie);
//      }
//        System.out.println(movies);



        String selectMovieByName_HQL = "FROM Movie mve WHERE mve.id = :id";
        Query<Movie> query = session.createQuery(selectMovieByName_HQL, Movie.class);
        Scanner  sc = new Scanner(System.in);
        System.out.println(" enter movie id");
 Long id=sc.nextLong();
        query.setParameter("id", id);
        List<Movie> movies = query.getResultList();
        for (Movie movie : movies) {
            System.out.println(movie);
        }
        System.out.println(movies);







        session.close();
        System.out.println("session closed..");
        //close session factory
        sessionFactory.close();
        System.out.println("sessionFactory closed..");

        System.out.println("Program ends...");
        System.out.println(" Thank you for using this program.💀");

    }
}

