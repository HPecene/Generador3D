/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nodos;

/**
 *
 * @author hp_ec
 */
public class NodoIf {
    public String inicio;
    public String fin;
    
    public NodoIf(String begin, String end){
        inicio = begin;
        fin = end;
    }
    
    public String getInicio(){
        return inicio;
    }
    
    public String getFin(){
        return fin;
    }
    
    public void setInicio(String begin){
        inicio = begin;
    }
    
    public void setFin(String end){
        fin = end;
    }
}
