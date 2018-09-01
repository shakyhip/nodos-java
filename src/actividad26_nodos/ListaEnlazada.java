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
public class ListaEnlazada {
    private Nodo cabeza;
    private int size;

    public ListaEnlazada() {
        cabeza = null;
        size = 0;
    }
    
    public String getObtener(int index){
        int contador = 0;
        Nodo temporal = cabeza;
        while(contador < index){
            temporal = temporal.obtenerSiguiente();
            contador++;
        }
        return temporal.obtenerValor();
    }
    
    public void addPrimero(String valor){
        if(cabeza == null){
            cabeza = new Nodo(valor);
        }else{
            Nodo temp = cabeza;
            Nodo nuevo = new Nodo(valor);
            nuevo.enlazarSiguiente(temp);
            cabeza = nuevo;
        }
        size++;
    }
    
    public int getSize(){
        return size;
    }
    
    public boolean estaVacia(){
        return (cabeza == null)?true:false;
    }
    
}
