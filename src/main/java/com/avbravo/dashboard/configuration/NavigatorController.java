/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package com.avbravo.dashboard.configuration;

import com.avbravo.jmoordbutils.JsfUtil;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;
import java.io.Serializable;

/**
 *
 * @author avbravo
 */
@Named
@RequestScoped
public class NavigatorController implements Serializable {
// <editor-fold defaultstate="collapsed" desc="fiedls">
        private static final long serialVersionUID = 1L;
// </editor-fold>
    /**
     * Creates a new instance of Navigator
     */
    public NavigatorController() {
    }
     // <editor-fold defaultstate="collapsed" desc="String go(String pathPage)">    

    public String go(String pathPage){
       
        try {
            System.out.println("Test----> voy a agregarlo al context.....................");
//              JmoordbContext.put("pageInView", pathPage);
      
        } catch (Exception e) {
            JsfUtil.errorMessage(JsfUtil.nameOfMethod() + " "+e.getLocalizedMessage());
        }
       
        
      
        return pathPage;
    }
    // </editor-fold>
}
