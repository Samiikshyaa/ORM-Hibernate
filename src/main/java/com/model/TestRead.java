package com.model;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import java.util.List;

public class TestRead {
    public static void main(String[] args) {
        SessionFactory sf = new Configuration().configure().buildSessionFactory();
        Session session = sf.openSession();
        Criteria ctr = session.createCriteria(Student.class);
//        ctr.add(Restrictions.eq("college","HCOE"));
//        ctr.add(Restrictions.gt("age",20));
        List<Student> list = ctr.list();
        System.out.println(list);
    }
}
