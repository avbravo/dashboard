/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package com.avbravo.dashboard.controller;

//import jakarta.inject.Named;
//import jakarta.faces.view.ViewScoped;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Named;
import java.io.Serializable;

/**
 *
 * @author avbravo
 */
@Named
@ViewScoped
public class IndexController implements Serializable {
private String  message="Hola mundo";

    public String getMessahe() {
        return message;
    }

    public void setMessahe(String messahe) {
        this.message = messahe;
    }


    /**
     * Creates a new instance of IndexController
     */
    public IndexController() {
    }
    
}
