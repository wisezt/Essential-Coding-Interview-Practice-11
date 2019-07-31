import java.io.*;
import java.util.*;

/*
 * To execute Java, please define "static void main" on a class
 * named Solution.
 *
 * If you need more classes, simply define them inline.
 */

class Solution03 {
  public static void main(String[] args) {

    
    
   int[] list1 = {1, 2, 3, 4, 5, 6, 7};
   int[] list2a = {4, 5, 6, 7, 1, 2, 3};
    
    System.out.println(  is_rotation(list1, list2a));
    
    
    
    
 
    }

 
    public static Boolean is_rotation(int[] A, int[] B){
      
      Boolean result = false;
      
    
      int key = A[0];
      int key_i = -1;
      
      for (int i = 0 ; i < B.length ; i ++){
       if ( key == B[i]){
          key_i = i;
         break;
         
       }
        
      }
      
        if (key == -1 ){
          
         return false; 
          
          
        }
      
        
        
        for (int i = 0 ; i < A.length ;  i ++ ){
              System.out.println( A[i] + "" +  B[key_i]);
                  System.out.println(    key_i );
          
            
          if (A[i] != B[key_i]){
            
           return false; 
            
          } else {result = true;
               key_i++  ;
           key_i = (key_i) % A.length;
             System.out.println(    key_i );
               
                  
                 
           }
          
          
          
          
        }
        
        
         return result;    
        
        
        
        
      }
      
      
      
      
      
      
      
      
   
      
}
  
    

  
  
  
  
  
  


      
      
      
      
      
    
