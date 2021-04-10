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
public interface I_LinkedList <T> {
    
    boolean IsEmpty();
    void AddObject(T obj);
    void AddObject(T obj, int index);
    int GetSize();
    T GetObjectAtIndex(int index); 
    
    T RemoveObject();
    T RemoveObject(int index);
    
    int IndexOf(T obj);
    public int[] IndexesOf(T obj);
}
