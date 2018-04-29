/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ternaksapi_spring.dao;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ternaksapi_spring.model.Sapi;

/**
 *
 * @author indraarianggi
 */
@Repository
public class SapiDaoImpl implements SapiDao {
        
    @Autowired
    private SessionFactory sessionFactory;
    
    @Override
    public void saveSapi(Sapi sapi) {
        sessionFactory.getCurrentSession().save(sapi);
    }
    
    @Override
    public List<Sapi> getListSapi() {
        return sessionFactory.getCurrentSession()
                .createCriteria(Sapi.class)
                .list();
    }
    
    @Override
    public void updateSapi(Sapi sapi) {
         sessionFactory.getCurrentSession().update(sapi);
    }
    
    @Override
    public void deleteSapi(Sapi sapi) {
        sessionFactory.getCurrentSession().delete(sapi);
    }
    
}
