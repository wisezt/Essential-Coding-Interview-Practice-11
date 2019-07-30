import java.io.*;
import java.util.*;

/*
 * To execute Java, please define "static void main" on a class
 * named Solution.
 *
 * If you need more classes, simply define them inline.
 */

class Solution {
  public static void main(String[] args) {
     Integer[] a_arr = {1,3,4,6,7,9};
      Integer[] b_arr = {1,2,4,5,9,10};
    
    
    
      List<Integer> a_list = Arrays.asList(a_arr);
      List<Integer> b_list =Arrays.asList(b_arr);
    
    
    
     common_elements( a_list ,  b_list );
 
    }

  public static List<Integer> common_elements(List<Integer> A, List<Integer> B){
    
     
    List<Integer> longer_Arr = new ArrayList<>();
    List<Integer> short_Arr = new ArrayList<>();
    List<Integer> result = new ArrayList<>();
    int loopTimes = 0;
    
    if (A.size() > B.size()){
      longer_Arr = A;
      short_Arr = B;
      loopTimes =   longer_Arr.size();
      
      
      
    } else{
      longer_Arr = B;
      short_Arr = A;
      loopTimes = short_Arr.size();
    }
    
    int l_Index = 0;
    int s_Index = 0;
    
    while( l_Index <  longer_Arr.size() && s_Index < short_Arr.size()){
      
       System.out.println(longer_Arr.get(l_Index) +"" + short_Arr.get(s_Index));
      
      if ( longer_Arr.get(l_Index) == short_Arr.get(s_Index)){
         result.add( longer_Arr.get(l_Index) ) ;
         l_Index++;
         s_Index++;
      }  else if (longer_Arr.get(l_Index) > short_Arr.get(s_Index)){
         s_Index++;
        
      } else{
         l_Index++;
      }
   
      
      
      
    }
  
    
    System.out.println(result);
    
  return result;
  
  }
    

  
  
  
  
  
  


      
      
      
      
      
      
}
