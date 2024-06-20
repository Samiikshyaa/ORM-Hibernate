package com.model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class TestDelete {
    public static void main(String[] args) {
        SessionFactory sf = new Configuration().configure().buildSessionFactory();
        Session session = sf.openSession();
        session.beginTransaction();
//        int id =1;
        Student s = (Student) session.get(Student.class, 2);

        session.delete(s);
        session.getTransaction().commit();
        session.close();
    }
}
