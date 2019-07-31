import java.io.*;
import java.util.*;

/*
 * To execute Java, please define "static void main" on a class
 * named Solution.
 *
 * If you need more classes, simply define them inline.
 */

class Solution04 {
  public static void main(String[] args) {

 
    System.out.println(non_repeating("aadd"));
    
 
    }

 
  
  public static Character non_repeating(String str){
    
 
    Map<Character, Integer> theMap = new HashMap<>();
    
    for (int i = 0 ; i < str.length() ; i++){
      
      if (theMap.get(str.charAt(i)) == null){
       
        theMap.put(str.charAt(i), 1);
        
        
      } else {
        
        int value = theMap.get(str.charAt(i)) + 1;
        theMap.put(str.charAt(i), value);
       
      }
      
    
    }
    
    
    Character theResult = null;
    
    for (Map.Entry<Character, Integer> theEntry : theMap.entrySet()){
       
      if (theEntry.getValue() ==1){
        theResult = theEntry.getKey();
      
      }
      
    }
    
    
    return  theResult;
    
    
    
    
    
  }
  
      
      
      
      
      
   
      
}
  
    

  
  
  
  
  
  


      
      
      
      
      
    
