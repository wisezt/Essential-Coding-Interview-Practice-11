import java.io.*;
import java.util.*;

/*
 * To execute Java, please define "static void main" on a class
 * named Solution.
 *
 * If you need more classes, simply define them inline.
 */

class Solution01 {
  public static void main(String[] args) {
      // mostFrequent(array1) should return 1.
        int[] array1 = {1, 3, 1, 3, 2, 1};
        // mostFrequent(array2) should return 3.
        int[] array2 = {3, 3, 1, 3, 2, 1};
        // mostFrequent(array3) should return null.
        int[] array3 = {};
        // mostFrequent(array4) should return 0.
        int[] array4 = {0};
        // mostFrequent(array5) should return -1.
        int[] array5 = {0, -1, 10, 10, -1, 10, -1, -1, -1, 1};
    
        
    most_frequent(array3);
    }

  
    
    
  
  
  
  public static Integer most_frequent(int[] given_array){
    HashMap<Integer, Integer> counted_Map = new HashMap<>();
    Integer most_fre_value = null;
    Integer most_fre_count = -1;
    
    for (Integer e : given_array){
        if (counted_Map.containsKey(e)){
                var value = counted_Map.get(e);
                value++;
                counted_Map.put(e, value);
             
        }else{
          
          counted_Map.put(e, 1);
          
         }
      
       
      if (counted_Map.get(e) > most_fre_count){
         most_fre_count = counted_Map.get(e); 
          most_fre_value = e;
      }      
  
     }
    
    System.out.println( most_fre_value );
    
    return  most_fre_value ;

    
  }
    
    
    
}


/* 
Your previous JavaScript content is preserved below:

funtion most_freguent(given_array){
  
  var theValueArr=[];
  var theFreArr =[];
  
  

    for(var i = 0 ; i < given_array; i++){
      var element = given_array[i];
      var theNewIndex = -1;
      if (theValueArr.indexOf(element) == -1 ){
        theValueArr.push(element);
        theNewIndex = theValueArr.indexOf(element);
        theFreArr[theNewIndex]++;
        
        ) else {
        theNewIndex = theValueArr.indexOf(element);
        theFreArr[theNewIndex]++;
        }
  
      }
      
      
      
      
      
      
      
}
 */