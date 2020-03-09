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
public class Temporal {
    
    public String valorTemporal;
    
    public Temporal(int contador){
        valorTemporal =  "T" + contador;
    }
    
    public Temporal(String numero){
        valorTemporal =  numero;
    }
    
    public String getValorTemporal( ){
        return valorTemporal;
    }
}
