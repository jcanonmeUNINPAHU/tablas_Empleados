/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vectors;

/**
 *
 * @author User
 */
public class Vector2 implements Operaciones {
    float x;
    float y;
    static final float  errorMargin = 0.00001f;
    
    public Vector2(float x, float y){
        this.x = x;
        this.y = y;
    }
    
    public float Magnitude(){
      double  square = Math.pow(x, 2) + Math.pow(y, 2);
        float sqrt = (float)Math.sqrt((float)square);
        return sqrt;            
    }
    
    @Override
    public float Sumar(){
        return x+y;
    }
    
    @Override
    public float Restar(){
        return x-y;
    }
    
    @Override
    public float Multiplicar(){
        return x*y;
    }
    
    @Override
    public float Dividir(){
        return x/y;
    }
   
    @Override
    public boolean equals(Object v2){
        Vector2 cast = (Vector2) v2;
        boolean r1 = Math.abs(this.x - cast.x) < errorMargin;
        boolean r2 = Math.abs(this.y - cast.y) < errorMargin;
        
       //return (this.x == v2.x && this.y == v2.y) ? true:false;
       return (r1 && r2 );
    }
}

