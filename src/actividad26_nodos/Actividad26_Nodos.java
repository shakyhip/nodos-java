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
public class Actividad26_Nodos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Nodo primer = new Nodo("Primero");
        Nodo segundo = new Nodo("Segundo");
        Nodo tercer = new Nodo("Tercero");
        
        primer.enlazarSiguiente(segundo);
        primer.obtenerSiguiente().enlazarSiguiente(tercer);
        
        System.out.println(primer.obtenerSiguiente().obtenerSiguiente().obtenerValor());
        
        
        
        ListaEnlazada lista = new ListaEnlazada();
        
        System.out.println("Esta vacia: " + lista.estaVacia());
        
        lista.addPrimero("Sofia");
        lista.addPrimero("Jorge");
        lista.addPrimero("Fernanda");
        lista.addPrimero("Luis");
        lista.addPrimero("Maria");
        
        System.out.println("Primer elemento: " + lista.getObtener(0));
        System.out.println("Ultimo elemento: " + lista.getObtener(lista.getSize()-1));
        System.out.println("Index 2: " + lista.getObtener(2));
        System.out.println("Esta vacia: " + lista.estaVacia());
        System.out.println("Tamaño: " + lista.getSize());
    }
    
}
