/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TextList;

import ListBase.*;
import Vectors.*;
import Lista.Lista;
import java.util.Arrays;



/**
 *
 * @author User
 */
public class TestList {
    
    public static void main(String[ ] args)
    {
     
        Linked_List<Vector2> otraLista = new Linked_List<>();
        
        otraLista.AddObject(new Vector2(1f, 2f));
        otraLista.AddObject(new Vector2(1f, 1f));
        otraLista.AddObject(new Vector2(1f, 1f));
        
        ArrayLinked_List<Vector2> maslista = new ArrayLinked_List<>();
        maslista.AddObject(new Vector2(1f, 2f));
        maslista.AddObject(new Vector2(1f, 1f));
        maslista.AddObject(new Vector2(1f, 1f));
        maslista.AddObject(new Vector2(1f, 1f));
        System.out.println(Arrays.toString(maslista.IndexesOf(new Vector2(1f, 1f))));
        
       
    }
}
