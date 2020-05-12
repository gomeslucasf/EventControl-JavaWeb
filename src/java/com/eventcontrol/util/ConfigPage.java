/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eventcontrol.util;

/**
 *
 * @author Gomes
 */
public class ConfigPage {
    private String caminhoPagina;
    private String tituloPagina; 

    public ConfigPage() {
    }

    public ConfigPage(String caminhoPagina, String tituloPagina) {
        this.caminhoPagina = caminhoPagina;
        this.tituloPagina = tituloPagina;
    }
    

    public String getCaminhoPagina() {
        return caminhoPagina;
    }

    public void setCaminhoPagina(String caminhoPagina) {
        this.caminhoPagina = caminhoPagina;
    }

    public String getTituloPagina() {
        return tituloPagina;
    }

    public void setTituloPagina(String tituloPagina) {
        this.tituloPagina = tituloPagina;
    }
    
       
}
