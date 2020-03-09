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
public class NodoAritmetico {
    public Temporal temp;
    public String codigo;
    
    public NodoAritmetico(String code, Temporal tem){
        codigo = code;
        temp = tem;
    }
    
    public String getCodigo( ){
        return codigo;
    }
    
    public Temporal getTemp( ){
        return temp;
    }
}
