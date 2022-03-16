/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package com.avbravo.dashboard.controller;

import com.avbravo.jmoordbutils.JsfUtil;
import jakarta.faces.view.ViewScoped;

import jakarta.inject.Named;
import java.io.Serializable;
import lombok.Data;

/**
 *
 * @author avbravo
 */
@Named(value = "helloController")
@ViewScoped
@Data
public class HelloController implements Serializable {
// <editor-fold defaultstate="collapsed" desc="field">
    private String name;
// </editor-fold>
    /**
     * Creates a new instance of HelloController
     */
    public HelloController() {
    }
    
    // <editor-fold defaultstate="collapsed" desc=" String saludar()">
    public String saludar(){
        JsfUtil.successMessage("Bienvenido "+ name + " a Jakarta EE 9.0");

        return "";
    }
// </editor-fold>
    
}
