/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ternaksapi_hibernate.dao;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import ternaksapi_hibernate.model.Sapi;

/**
 *
 * @author indraarianggi
 */
public class SapiDaoImpl implements SapiDao {
    
    private final SessionFactory sessionFactory;
    
    public SapiDaoImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void saveSapi(Sapi sapi) {
        Session session = sessionFactory.openSession();
        try {
            session.beginTransaction();
            session.save(sapi);
            session.getTransaction().commit();
        } catch(Exception e) {
            session.getTransaction().rollback();
        } finally {
            session.close();
        }
    }

    @Override
    public void updateSapi(Sapi sapi) {
        Session session = sessionFactory.openSession();
        try {
            session.beginTransaction();
            session.update(sapi);
            session.getTransaction().commit();
        } catch(Exception e) {
            session.getTransaction().rollback();
        } finally {
            session.close();
        }
    }

    @Override
    public void deleteSapi(Sapi sapi) {
        Session session = sessionFactory.openSession();
        try {
            session.beginTransaction();
            session.delete(sapi);
            session.getTransaction().commit();
        } catch(Exception e) {
            session.getTransaction().rollback();
        } finally {
            session.close();
        }
    }

    @Override
    public List<Sapi> getListSapi() {
        Session session = sessionFactory.openSession();
        try {
            session.beginTransaction();
            List<Sapi> listSapi;
            listSapi = session.createCriteria(Sapi.class).list();
            session.getTransaction().commit();
            return listSapi;
        } catch(Exception e) {
            session.getTransaction().rollback();
            return null;
        } finally {
            session.close();
        }
    }
    
}
