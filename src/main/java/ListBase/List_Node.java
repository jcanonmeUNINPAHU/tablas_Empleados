/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListBase;

/**
 *
 * @author User
 */
public class List_Node <T> {
    
    //definir un nodo de una lista
    
    private T Container;                 //contenedor  
    private List_Node nextNode;            //encabezado
    
    public List_Node(T data, List_Node next){    //constructor nodo intermedio
        this.Container = data;
        this.nextNode = next;
    }
    
    public List_Node(T data){        //nodo final
        this.Container = data;
        this.nextNode = null;
    }
    
    //HAY POSIBLE CAMBIO
    public void ChangeNextNode(List_Node next){
        this.nextNode = next;
    }
    public T GetItem(){
        return Container;
    }
    public List_Node<T> GetNextNode(){
        return nextNode;
    }
    
}
