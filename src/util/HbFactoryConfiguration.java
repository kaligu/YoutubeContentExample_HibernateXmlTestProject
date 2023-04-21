/*
  @ Author       : C.Kaligu Jayanath
  @ Prjoect Name : OrmXmlTest
  @ Date         : 4/8/2023
  @ Time         : 10:19 AM
*/
package util;

import entity.Reservation;
import entity.Room;
import entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HbFactoryConfiguration {
    private static HbFactoryConfiguration hbFactoryConfiguration;
    private SessionFactory sessionFactory;

    private HbFactoryConfiguration(){
        //create configuration
        Configuration configuration = new Configuration().configure()
                .addAnnotatedClass(Room.class)
                .addAnnotatedClass(Student.class)
                .addAnnotatedClass(Reservation.class);

        //create session factory
        sessionFactory = configuration.buildSessionFactory();

    }

    //getinstance inthis class
    public static HbFactoryConfiguration getInstance(){
        return (hbFactoryConfiguration == null) ? hbFactoryConfiguration = new HbFactoryConfiguration():hbFactoryConfiguration;
    }

    //get session
    public Session getSession(){
        return sessionFactory.openSession();  //open session
    }
}
