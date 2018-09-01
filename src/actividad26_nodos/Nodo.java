/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad26_nodos;

/**
 *
 * @author SHAVA
 */
public class Nodo {
    private String valor;
    private Nodo siguiente;
    
    public Nodo(String valor){
        this.valor = valor;
        this.siguiente = null;
    }
    
    public String obtenerValor(){
        return valor;
    }
    public void enlazarSiguiente(Nodo n){
        siguiente = n;
    }
    public Nodo obtenerSiguiente(){
        return siguiente;
    }
}