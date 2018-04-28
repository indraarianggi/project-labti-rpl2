/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ternaksapi_hibernate.controller;

import java.util.List;
import javax.swing.JOptionPane;
import ternaksapi_hibernate.config.HibernateUtil;
import ternaksapi_hibernate.config.SapiTableModel;
import ternaksapi_hibernate.dao.SapiDao;
import ternaksapi_hibernate.model.Sapi;
import ternaksapi_hibernate.view.SapiView;

/**
 *
 * @author indraarianggi
 */
public class SapiController {
    
    private final SapiView sapiView;
    private SapiTableModel sapiTableModel;
    private List<Sapi> listSapi;
    private final SapiDao sapiDao = HibernateUtil.getSapiDao();
    
    public SapiController(SapiView bukuView) {
        this.sapiView = bukuView;
    }
    
    public void tampilData() {
        listSapi = sapiDao.getListSapi();
        sapiTableModel = new SapiTableModel(listSapi);
        this.sapiView.getTblSapi().setModel(sapiTableModel);
    }
    
    public void simpanSapi() {
        Sapi sapi = new Sapi();
        
        sapi.setId(this.sapiView.getTxtId().getText());
        sapi.setJenis(this.sapiView.getTxtJenis().getText());
        sapi.setJenis_kelamin(this.sapiView.getCbJenisKelamin().getSelectedItem().toString());
        sapi.setUmur(Integer.parseInt(this.sapiView.getTxtUmur().getText()));
        sapi.setLingkar_dada(Float.parseFloat(this.sapiView.getTxtLingkarDada().getText()));
        sapi.setPanjang_badan(Float.parseFloat(this.sapiView.getTxtPanjangBadan().getText()));
        sapi.setBerat(Float.parseFloat(this.sapiView.getTxtBerat().getText()));
        
        sapiDao.saveSapi(sapi);
        clearField();
        
        JOptionPane.showMessageDialog(null, "Data sapi berhasil disimpan", "Info",
                JOptionPane.INFORMATION_MESSAGE);
        tampilData();
    }
    
    public void updateSapi() {
        Sapi sapi = new Sapi();
        
        sapi.setId(this.sapiView.getTxtId().getText());
        sapi.setJenis(this.sapiView.getTxtJenis().getText());
        sapi.setJenis_kelamin(this.sapiView.getCbJenisKelamin().getSelectedItem().toString());
        sapi.setUmur(Integer.parseInt(this.sapiView.getTxtUmur().getText()));
        sapi.setLingkar_dada(Float.parseFloat(this.sapiView.getTxtLingkarDada().getText()));
        sapi.setPanjang_badan(Float.parseFloat(this.sapiView.getTxtPanjangBadan().getText()));
        sapi.setBerat(Float.parseFloat(this.sapiView.getTxtBerat().getText()));
        
        sapiDao.updateSapi(sapi);
        clearField();
        
        JOptionPane.showMessageDialog(null, "Data sapi berhasil diupdate", "Info",
                JOptionPane.INFORMATION_MESSAGE);
        tampilData();
    }
    
    public void deleteSapi() {
        Sapi sapi = new Sapi();
        
        sapi.setId(this.sapiView.getTxtId().getText());
        sapi.setJenis(this.sapiView.getTxtJenis().getText());
        sapi.setJenis_kelamin(this.sapiView.getCbJenisKelamin().getSelectedItem().toString());
        sapi.setUmur(Integer.parseInt(this.sapiView.getTxtUmur().getText()));
        sapi.setLingkar_dada(Float.parseFloat(this.sapiView.getTxtLingkarDada().getText()));
        sapi.setPanjang_badan(Float.parseFloat(this.sapiView.getTxtPanjangBadan().getText()));
        sapi.setBerat(Float.parseFloat(this.sapiView.getTxtBerat().getText()));
        
        sapiDao.deleteSapi(sapi);
        clearField();
        
        JOptionPane.showMessageDialog(null, "Data sapi berhasil dihapus", "Info",
                JOptionPane.INFORMATION_MESSAGE);
        tampilData();
    }
    
    public void cekSapi() {
        int index =  this.sapiView.getTblSapi().getSelectedRow();
        
        this.sapiView.getTxtId().setText(
                String.valueOf(this.sapiView.getTblSapi()
                        .getValueAt(index, 0))
        );
        this.sapiView.getTxtId().setEditable(false);
        
        this.sapiView.getTxtJenis().setText(
                String.valueOf(this.sapiView.getTblSapi()
                        .getValueAt(index, 1))
        );
        
        this.sapiView.getCbJenisKelamin().setSelectedItem(
                String.valueOf(this.sapiView.getTblSapi()
                        .getValueAt(index, 2))
        );
        
        this.sapiView.getTxtUmur().setText(
                String.valueOf(this.sapiView.getTblSapi()
                        .getValueAt(index, 3))
        );
        
        this.sapiView.getTxtLingkarDada().setText(
                String.valueOf(this.sapiView.getTblSapi()
                        .getValueAt(index, 4))
        );
        
        this.sapiView.getTxtPanjangBadan().setText(
                String.valueOf(this.sapiView.getTblSapi()
                        .getValueAt(index, 5))
        );
        
        this.sapiView.getTxtBerat().setText(
                String.valueOf(this.sapiView.getTblSapi()
                        .getValueAt(index, 6))
        );
        
    }
    
    private void clearField() {
        this.sapiView.getTxtId().setEditable(true);
        this.sapiView.getTxtId().setText(null);
        this.sapiView.getTxtJenis().setText(null);
        this.sapiView.getCbJenisKelamin().setSelectedIndex(0);
        this.sapiView.getTxtUmur().setText(null);
        this.sapiView.getTxtLingkarDada().setText(null);
        this.sapiView.getTxtPanjangBadan().setText(null);
        this.sapiView.getTxtBerat().setText(null);
    }
}
