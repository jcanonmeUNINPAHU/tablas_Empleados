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
public class Linked_List <T> implements I_LinkedList<T>{
    private int count;          //Cuantos Elementos Tengo
    private List_Node <T> startNode;        //Nodo Inicio
    private List_Node <T> lastNode;
    
    public Linked_List(){
        this.count = 0;
        this.startNode = null;
    }
    
    //Metodos de I_LinkedList
    
    @Override
    public boolean IsEmpty(){
        return count > 0;
    }
   @Override
   public void AddObject(T obj, int index){
       List_Node<T> temp = new List_Node<>(null);
       List_Node<T> nodeToAdd = new List_Node<>(obj);
       if(index == 0){
           nodeToAdd.ChangeNextNode(this.startNode);
           this.startNode = nodeToAdd;
           count++;
       }
       
       if(index >= count -1){
           this.lastNode.ChangeNextNode(nodeToAdd);
           count++;
       }
        if(index > 0){  //manejo de excepciones 
          for(int i = 0 ; i <= index-1; i++){
                if(i == 0){
                    temp = startNode;
                }else{
                    temp = temp.GetNextNode();
                }
            }
          nodeToAdd.ChangeNextNode(temp);
          temp.ChangeNextNode(nodeToAdd);
          count++;
        }
   }
    
    
    @Override
    public void AddObject(T obj){
        if(count == 0){
            startNode = new List_Node <T> (obj);
            lastNode = startNode;
            count++;
        }else{
            List_Node<T> node = new List_Node<>(obj);
            this.lastNode.ChangeNextNode(node);
            this.lastNode = node;
            count++;
        }
    }
    
    @Override
    public int GetSize(){
        return count;
    }
    
    @Override
    public T GetObjectAtIndex(int index){
        List_Node<T> temp = new List_Node<>(null);
        T item = null;
        
        if(index < 0 || index >= count)
            return item ;
            for(int i = 0 ; i <= index; i++){
                if(i == 0){
                    temp = startNode;
                }else{
                    temp = temp.GetNextNode();
                }
            }
       
        return temp.GetItem();
    }
    
    @Override
    public T RemoveObject(){
        T obj = lastNode.GetItem();
        
        List_Node<T> temp = new List_Node<>(null);
        for(int i = 0; i < count-1; i++){
            if(i == 0){
                temp = startNode;
            }else{
                temp = temp.GetNextNode();
            }
        }
        temp.ChangeNextNode(null);
        lastNode = temp;
        return obj;
    }
    
    @Override
    public T RemoveObject(int index){
        
        List_Node<T> temp1 = new List_Node<>(null);
        List_Node<T> temp2 = new List_Node<>(null);
        T obj = null;
        if(index == 0){
            startNode = startNode.GetNextNode();
        }else{
        for(int i = 0; i < index-1; i++){
            if(i == 0){
                temp1 = startNode;
                temp2 = temp1.GetNextNode();
            }else{
                temp1 = temp1.GetNextNode();
                temp2 = temp1.GetNextNode();
            }
            
        }
         obj = temp2.GetItem();
        temp1.ChangeNextNode(temp2.GetNextNode());
      } 
     count--;
     return obj;
    }
    
    @Override
    public int IndexOf(T obj){
        int result = -1;
        T compare;
        List_Node<T> temp1 = new List_Node<>(null);
        for(int i = 0; i < count; i++){
            if(i == 0){
                temp1 = startNode;
                compare = temp1.GetItem();
            }else{
                temp1 = temp1.GetNextNode();
                compare = temp1.GetItem();
            }
            if(compare.equals(obj)){
                result = i;
                break;
            }
        }
        
        return result; 
    }
    
    public int [] IndexesOf(T obj){
        int [] result = null ;
        T compare;
        List_Node<T> temp11 = new List_Node<>(null);
        for(int i = 0; i < count; i++){
            if(i == 0){
                temp11 = startNode;
                compare = temp11.GetItem();
            }else{
                temp11 = temp11.GetNextNode();
                compare = temp11.GetItem();
            }
            if(compare.equals(obj)){
                result[i]++;
            }
        }
        
        return result; 
    }
}

