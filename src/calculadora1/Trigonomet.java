/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora1;
import java.lang.Math.*;
/**
 *
 * @author davidvargas
 */
public class Trigonomet {
    
    double b;
    double a;

    
        
       double seno(){
        
        b=Math.sin(a);
        return b;       
    }
       double coseno(){
        b =Math.cos(a);
        return b;
        
    } 
         double tangente (){
        b=Math.tan(a);
        return b;
    }
     
    double cotangente (){
        b=1/Math.tan(a);
        return b;
    }
       
    
   
  
}