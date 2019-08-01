import java.io.*;
import java.util.*;

/*
 * To execute Java, please define "static void main" on a class
 * named Solution.
 *
 * If you need more classes, simply define them inline.
 */

class Solution08 {
  public static void main(String[] args) {
    
    
    int[][] arr = {
    
    {1,3,5,6},                    
    {1,2,4,6},
    {2,2,9,6},
    {1,3,5,8},
      };
    
    int[][] rotatedArr = rotate(arr);
    
    for(int[] i : rotatedArr){
      
      for(int j : i){
        
        System.out.print(" " + j + " ");
        
        
      }
      
      
      
     System.out.println(); 
    }
    
    
    
    
    
    

  }
  
  
  
  
  
  public static int[][] rotate(int[][] givenArr){
    
    int theLength = givenArr.length;
    
    int[][] result = new int[theLength][theLength];
    
    
    for(int i = 0 ; i < result.length ; i++){
      
      for(int j = 0 ; j < result[0].length ; j++){
        
        result[j][result.length-1-i] = givenArr[i][j];
        if (i == 0 && j ==3){
          System.out.println("given[0][3]: " +  givenArr[i][j]);
          
        }
   
        
      }
      
      
      
      
      
    }
    
    
    
    
    
    
       
    
    return result;
  }
  
  
  
  
  
  
  
  
}
