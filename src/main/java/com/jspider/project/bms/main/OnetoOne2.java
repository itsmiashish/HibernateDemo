package com.jspider.project.bms.main;
import com.jspider.project.bms.Address;
import com.jspider.project.bms.Audi;
import com.jspider.project.bms.Movie;
import com.jspider.project.bms.MovieMeta;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class OnetoOne2 {
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
    public static void saveMovie(){
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        System.out.println(" creating audi data");
       Movie movie = new Movie();
        movie .setTitle("K.G.F2");
        movie .setDuration(120);

        System.out.println(" crating address data");
        MovieMeta movieMeta = new MovieMeta();
        movieMeta.setFormate("2D");
        movieMeta .setRating(4.5F);

        System.out.println(" linking audi to  address data");
        movie.setMovieMeta(movieMeta); // link audi Adress


        session.persist(movie);
        System.out.println("Audi and Address saved!!");
        tx.commit();
        session.close();
    }



    public static void main(String[] args) {
        System.out.println(" program start");
        saveMovie();
        System.out.println(" program end");
    }
}
