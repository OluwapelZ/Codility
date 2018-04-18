/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author oluwapelumi.olaoye
 */
public class MaxCounter {
    
    public static void main(String args[]){
        
    }
    
    //The return type should be int[]
    public void solution(int N, int[] A) {
        // write your code in Java SE 8
        int size = A.length;
        int[] result_array = new int[N];
        int max;
        for(int i = 0; i < size; i++){
            if(A[i] != (N + 1)){
                result_array[A[i]] += 1;
            }
            else{
                for(int j = 0; j < result_array.length; j++){
                    
                }
            }
        }
    }
    
    public int setMax(int[] givenArray){
        int max = 0;
        for(int i = 0; i < givenArray.length; i++){
            //I can do a sort and then set the last element being the heighest.
            
        }
        return max;
    }
    
    
}
