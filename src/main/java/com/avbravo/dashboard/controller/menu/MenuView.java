/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package com.avbravo.dashboard.controller.menu;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;
import java.io.Serializable;
import lombok.Data;

/**
 *
 * @author avbravo
 */
@Named(value = "menuView")
@RequestScoped
@Data
public class MenuView implements Serializable{
private String model;
    /**
     * Creates a new instance of MenuView
     */
    public MenuView() {
    }
    
}
