/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ternaksapi_hibernate.config;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import ternaksapi_hibernate.dao.SapiDao;
import ternaksapi_hibernate.dao.SapiDaoImpl;
import org.hibernate.cfg.Configuration;
import org.hibernate.HibernateException;

/**
 *
 * @author indraarianggi
 */
public class HibernateUtil {
    private static final SessionFactory SESSION_FACTORY;
    private static final SapiDao SAPI_DAO;
    
    static {
        try {
            SESSION_FACTORY = new Configuration().configure().buildSessionFactory();
            SAPI_DAO = new SapiDaoImpl(SESSION_FACTORY);
        } catch(HibernateException ex) {
            System.err.println("Initial SessionFactory creation failed." +ex);
            throw new ExceptionInInitializerError(ex);
        }
    }
    
    public static SessionFactory getSessionFactory(){
        return SESSION_FACTORY;
    }
    
    public static SapiDao getSapiDao() {
        return SAPI_DAO;
    }
}
