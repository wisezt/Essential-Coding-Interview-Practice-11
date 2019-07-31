import java.io.*;
import java.util.*;

/*
 * To execute Java, please define "static void main" on a class
 * named Solution.
 *
 * If you need more classes, simply define them inline.
 */

class Solution05 {
  public static void main(String[] args) {

    
      System.out.println( is_one_away("xyz", "xyaz"));
    

    
  }

  
  
  
  public static Boolean is_one_away(String strA, String strB){
    
    Boolean result = false;
    
    int index_a = 0;
    int index_b = 0;
    int max_diff = 0;
    
    while (index_a < strA.length() && index_b < strB.length()){
    
        System.out.println(strA.charAt(index_a) + "   " + strB.charAt(index_b) );
      System.out.println( "result: " +  result);
      
     
      if(strA.charAt(index_a) == strB.charAt(index_b)){
         
          index_a++;  
          index_b++;
          
        result = true;
        
        
      }  else if ( max_diff <1 ){
        
            max_diff++;
        
        if (strA.length() ==  strB.length()){
           index_a++;  
          index_b++;
          
        }else if (strA.length() <  strB.length()){
          
          index_a++;
          
          
        }else {
          
          index_b++;
        }
        
        
        
        }
         else {
          result = false;
          break;
          
        
        
        
        
        
      } 
      
      
    }
    
    
    
    
    
    
    
    
    return result;
    
  }
  
  
  
  
  





}
