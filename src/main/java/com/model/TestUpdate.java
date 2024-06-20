package com.model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class TestUpdate {

    public static void main(String[] args) {
        SessionFactory sf = new Configuration().configure().buildSessionFactory();
        Session session = sf.openSession();
        session.beginTransaction();

        Student s = (Student) session.get(Student.class,2);
        s.setAge(23);

        session.update(s);
        session.getTransaction().commit();
        session.close();

    }

}
