/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nodos;

import java.util.LinkedList;

/**
 *
 * @author hp_ec
 */
public class NodoSubIf {
    public String inicio;
    public String fin;
    public LinkedList<String> etiquetasSalida;
    
    public NodoSubIf(String begin, String end, LinkedList<String> list){
        inicio = begin;
        fin = end;
        etiquetasSalida = list;
    }
    
    public String getInicio(){
        return inicio;
    }
    
    public String getFin(){
        return fin;
    }
    
    public LinkedList<String> getLista(){
        return etiquetasSalida;
    }
    
    public void addLista(String etiqueta){
        etiquetasSalida.add(etiqueta);
    }
    
    public void setInicio(String begin){
        inicio = begin;
    }
    
    public void setFin(String end){
        fin = end;
    }
}
