/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eventcontrol.util;

import com.eventcontrol.model.Evento;
import java.util.List;

/**
 *
 * @author Gomes
 */
public class PeriodoCronograma {
    private String descricao;
    private List<Evento> Eventos;

    public PeriodoCronograma(String descricao, List Eventos) {
        this.descricao = descricao;
        this.Eventos = Eventos;
    }

    public PeriodoCronograma() {
        this.descricao="";
        this.Eventos = null;
            
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public List getEventos() {
        return Eventos;
    }

    public void setEventos(List Eventos) {
        this.Eventos = Eventos;
    }
    
}
