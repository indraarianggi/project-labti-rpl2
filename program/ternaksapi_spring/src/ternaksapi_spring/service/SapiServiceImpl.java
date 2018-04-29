/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ternaksapi_spring.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ternaksapi_spring.dao.SapiDao;
import ternaksapi_spring.model.Sapi;

/**
 *
 * @author indraarianggi
 */
@Service("BukuService")
@Transactional(readOnly = true)
public class SapiServiceImpl implements SapiService {
    
    @Autowired
    private SapiDao sapiDao;

    @Override
    @Transactional
    public void saveSapi(Sapi sapi) {
        sapiDao.saveSapi(sapi);
    }

    @Override
    @Transactional
    public void updateSapi(Sapi sapi) {
        sapiDao.updateSapi(sapi);
    }

    @Override
    @Transactional
    public void deleteSapi(Sapi sapi) {
        sapiDao.deleteSapi(sapi);
    }

    @Override
    public List<Sapi> getListSapi() {
        return sapiDao.getListSapi();
    }
    
}
