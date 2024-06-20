package com.model;

import jakarta.persistence.EntityManager;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class TestInsert {
    public static void main(String[] args) {
        add();
    }
    static void add(){
        SessionFactory sf = new Configuration().configure().buildSessionFactory();
        Session session = sf.openSession();
        session.beginTransaction();

        Student s = new Student();
        s.setFname("Suyog");
        s.setLname("Sharma");
        s.setAge(25);
        s.setCollege("HCOE");
        session.save(s);

        session.getTransaction().commit();

        session.close();
    }
}
