/*
  @ Author       : C.Kaligu Jayanath
  @ Prjoect Name : OrmXmlTest
  @ Date         : 4/8/2023
  @ Time         : 10:29 AM
*/
package main;

import entity.Reservation;
import entity.Room;
import entity.Student;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HbFactoryConfiguration;

public class main {
    public static void main(String[] args){
        System.out.println("Hi Hibernate");

        Session session= HbFactoryConfiguration.getInstance().getSession();  //initialize a session

        Transaction transaction= session.beginTransaction(); //initialize a transaction

//
//        Student student= new Student("s001" , "Kaligu");
//
//        //pass this object to session
//        session.save(student);
//
//
//
//        Reservation reservation=new Reservation("r001",student);
//
//        session.save(reservation);

//        Student student = new Student("s001","ssss","sss","sss","ffff");
//        session.save(student);
//        Room room = new Room("r001","ac",4455,3);
//        session.save(room);
//
//
//        Reservation reservation= new Reservation("r001",student,room);
//        session.save(reservation);


        session.delete(session.get(Room.class,"r001"));

        //set transaction commit
        transaction.commit();

        //close session
        session.close();


    }
}
