/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ulatina;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author laboratorio
 */
@ManagedBean(name="beanMensaje")
@RequestScoped
public class Mensaje {
    private String msj;
    private String username;
    private String contraseña;
    
    public Mensaje() {
        this.msj="Bienvenido al sistema";

    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }


    public String getMsj() {
        return msj;
    }

    public void setMsj(String msj) {
        this.msj = msj;
    }
    
    public String ingresar(){
        String retorno="";
        if (this.username.equals("coco") && this.contraseña.equals("coco")){
            this.msj="Hola "+this.username;
            retorno="second.xhtml";
        }else{
            FacesContext.getCurrentInstance().addMessage(null, 
            new FacesMessage( FacesMessage.SEVERITY_FATAL,"Usuario o contraseña incorrectos",""));
            retorno="index.xhtml";
        }
                 return retorno;
    }
    
}
