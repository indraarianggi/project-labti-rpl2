/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ternaksapi_hibernate.config;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import ternaksapi_hibernate.model.Sapi;

/**
 *
 * @author indraarianggi
 */
public class SapiTableModel extends AbstractTableModel {
    
    private List<Sapi> listSapi = new ArrayList<>();
    private final String HEADER[] = {"ID", "Jenis Sapi", "Jenis Kelamin", "Umur", 
                                    "Lingkar Dada", "Panjang Badan", "Berat"};
    
    public SapiTableModel(List<Sapi> listSapi){
        this.listSapi = listSapi;
    }

    @Override
    public int getRowCount() {
        return listSapi.size();
    }

    @Override
    public int getColumnCount() {
        return HEADER.length;
    }
    
    @Override
    public String getColumnName(int columnIndex) {
        return HEADER[columnIndex];
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Sapi sapi = listSapi.get(rowIndex);
        
        switch(columnIndex) {
            case 0:
                return sapi.getId();
            case 1:
                return sapi.getJenis();
            case 2:
                return sapi.getJenis_kelamin();
            case 3:
                return sapi.getUmur();
            case 4:
                return sapi.getLingkar_dada();
            case 5:
                return sapi.getPanjang_badan();                
            case 6:
                return sapi.getBerat();
            default:
                return null;
        }
    }
    
}
