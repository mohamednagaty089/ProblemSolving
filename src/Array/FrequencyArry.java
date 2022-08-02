/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array;

import java.util.ArrayList;

/**
 *
 * @author Samy
 */
public class FrequencyArry {
    
  public static int[] getFrequency(int array[]){
      int max=getMaxValue(array);
      int frequency[]=new int[max+1];
      for(int i=0;i<array.length;i++){
          frequency[array[i]]++;
      }
      return frequency;
  }
  
  public static int getMaxValue(int array[]){
     int max=array[0];
     for(int i=1;i<array.length;i++){
         if(array[i]>max)max=array[i];
         
     }
     return max;   
 }
  public static ArrayList<Integer> getRepeatElement(int arr[]){
      int max=getMaxValue(arr);
      ArrayList<Integer> repeat=new ArrayList<Integer>();
      int freq[]=new int[max+1];
      for(int i=0;i<arr.length;i++){
          freq[arr[i]]++;
          
      }
      for(int i=0;i<freq.length;i++){
          if(freq[i]>=2){
              repeat.add(arr[i]);
          }
      }
      return repeat;
  }
  public static boolean checkSum(int arr[],int sum){
      int max=FrequencyArry.getMaxValue(arr);
      int freq[]=FrequencyArry.getFrequency(arr);
      int result;
      boolean flag=false;
      
      for(int i=0;i<arr.length;i++){
         result=sum-arr[i];
          if(result<=max){
             if(freq[result]!=0){
              flag=true;
              break;
      }
    }
   }
      return flag;
  }
 
    
}