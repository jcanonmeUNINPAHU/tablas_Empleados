/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista;

/**
 *
 * @author User
 */
public class Lista <TipoCualquiera> {
    
    int tamaño;
    NodoLista n_inicio;
    NodoLista n_final;
    
    public Lista(){      // creando lista vacia 
        tamaño = 0;
        n_inicio = null;
        n_final = null;
    }
    
    public void AgregarElemento(TipoCualquiera objeto){
        NodoLista<TipoCualquiera> nodo = new NodoLista<>(objeto);
        if( tamaño == 0){
   
            n_inicio = nodo;
            n_final = nodo;
        }
        else{
            n_final.DefinirSiguienteNodo(nodo);
            n_final = nodo;
        }
    }
    
    private class NodoLista <TipoCualquiera>
    {
        //propiedad para apuntar al siguiente nodo :
        NodoLista Siguiente;
        //propiedad para contener el objeto del nodo :
        TipoCualquiera contenedor;
        
        public NodoLista(TipoCualquiera objeto){
            contenedor = objeto;
            
        }
    
        public void DefinirSiguienteNodo(NodoLista nodoSiguiente){
            Siguiente = nodoSiguiente;
        }
        
    }
}
