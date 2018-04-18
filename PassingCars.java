/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author oluwapelumi.olaoye
 */
public class PassingCars {
    
    public static void main(String args[]) {
        
    }
    
    public int solution(int[] A) {
        int size = A.length;
        int sum = 0;
        int count = 0;
        for(int i = 0; i < size; i++) {
            if(A[i] == 1)
                count++;
        }
        
        int zero_count = 0;
        for(int i = 0; i < size; i++) {
            //Preceeding zeros
            if(A[i] == 0){
                zero_count++;
            }
            else {
                if(zero_count != 0){
                    sum = sum + (zero_count * count);
                }
                zero_count = 0;
                count--;
            }
            
        }
        
        return sum;
    }
}
