/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ternaksapi_spring.service;

import java.util.List;
import ternaksapi_spring.model.Sapi;

/**
 *
 * @author indraarianggi
 */
public interface SapiService {
    public void saveSapi(Sapi sapi);
    public void updateSapi(Sapi sapi);
    public void deleteSapi(Sapi sapi);
    public List<Sapi> getListSapi();
}
