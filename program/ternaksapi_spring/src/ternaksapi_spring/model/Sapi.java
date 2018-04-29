/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ternaksapi_spring.model;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 *
 * @author indraarianggi
 */

@Entity
@Table(name = "tbl_sapi")
public class Sapi implements Serializable {
     
    @Id
    @Column(name = "id", length = 8)
    private String id;
    
    @Column(name = "jenis", length = 25)
    private String jenis;
    
    @Column(name = "jenis_kelamin", length = 11)
    private String jenis_kelamin;
    
    @Column(name = "umur")
    private int umur;
    
    @Column(name = "lingkar_dada")
    private float lingkar_dada;
    
    @Column(name = "panjang_badan")
    private float panjang_badan;
    
    @Column(name = "berat")
    private float berat;

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the jenis
     */
    public String getJenis() {
        return jenis;
    }

    /**
     * @param jenis the jenis to set
     */
    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    /**
     * @return the jenis_kelamin
     */
    public String getJenis_kelamin() {
        return jenis_kelamin;
    }

    /**
     * @param jenis_kelamin the jenis_kelamin to set
     */
    public void setJenis_kelamin(String jenis_kelamin) {
        this.jenis_kelamin = jenis_kelamin;
    }

    /**
     * @return the umur
     */
    public int getUmur() {
        return umur;
    }

    /**
     * @param umur the umur to set
     */
    public void setUmur(int umur) {
        this.umur = umur;
    }

    /**
     * @return the lingkar_dada
     */
    public float getLingkar_dada() {
        return lingkar_dada;
    }

    /**
     * @param lingkar_dada the lingkar_dada to set
     */
    public void setLingkar_dada(float lingkar_dada) {
        this.lingkar_dada = lingkar_dada;
    }

    /**
     * @return the panjang_badan
     */
    public float getPanjang_badan() {
        return panjang_badan;
    }

    /**
     * @param panjang_badan the panjang_badan to set
     */
    public void setPanjang_badan(float panjang_badan) {
        this.panjang_badan = panjang_badan;
    }

    /**
     * @return the berat
     */
    public float getBerat() {
        return berat;
    }

    /**
     * @param berat the berat to set
     */
    public void setBerat(float berat) {
        this.berat = berat;
    }
}
