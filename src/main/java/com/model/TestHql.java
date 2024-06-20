package com.model;

import javassist.CodeConverter;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionBuilder;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class TestHql {
    public static void main(String[] args) {
        SessionFactory sf = new Configuration().configure().buildSessionFactory();
        Session s = sf.openSession();

        s.beginTransaction();
        Query query = s.createQuery("from Student");
        List<Student> slist = query.list();
        System.out.println(slist);
    }
}
