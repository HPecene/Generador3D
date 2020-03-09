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
public class NodoLogico {
    public LinkedList <String> etiquetasVerdaderas;
    public LinkedList <String> etiquetasFalsas;
    public String codigo;
    
    public NodoLogico(String code, LinkedList <String> verdad, LinkedList <String> mentira){
        codigo = code;
        etiquetasFalsas = mentira;
        etiquetasVerdaderas = verdad;
    }
    
    public String getCodigo( ){
        return codigo;
    }
    
    public LinkedList <String> getVerdades( ){
        return etiquetasVerdaderas;
    }

    public LinkedList <String> getMentiras( ){
        return etiquetasFalsas;
    }
}
