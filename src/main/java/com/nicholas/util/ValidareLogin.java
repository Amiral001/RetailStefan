package com.nicholas.util;

import com.nicholas.entity.Users;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.sql.PreparedStatement;
import java.util.List;

public class ValidareLogin {

    private SessionFactory sessionFactory;
    private Session session;

    public void getSessionAndTransaction() {
        sessionFactory = new Configuration().configure().buildSessionFactory();
        session = sessionFactory.getCurrentSession();
        session.beginTransaction();
    }

    public void commitTransactionAndCloseSession() {
        session.getTransaction().commit();
        session.close();
    }

    public void displayAll() {
        getSessionAndTransaction();
        List<Users> allUsers = null;

        CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
        CriteriaQuery<Users> criteriaQuery = criteriaBuilder.createQuery(Users.class);
        Root<Users> root = criteriaQuery.from(Users.class);
        CriteriaQuery<Users> all = criteriaQuery.select(root);

        TypedQuery<Users> allQuery = session.createQuery(all);
        allUsers = allQuery.getResultList();

        commitTransactionAndCloseSession();

        for (Users user : allUsers) {
            System.out.println(user);
        }
    }

    public String validateUser(String user, String password) {
        getSessionAndTransaction();
        Query query = session.createQuery("SELECT u from Users u where userName = :name and userPass = :pass");
        query.setParameter("name", user);
        query.setParameter("pass", password);
        List result = query.getResultList();
        String message;
        if (result.size() > 0) {
            message = "Login successful";
        } else {
            message = "Acces denied";
        }
        commitTransactionAndCloseSession();
        return message;
    }

    public void insertUser (Users users){
        getSessionAndTransaction();
        session.save(users);
        commitTransactionAndCloseSession();
    }

}
