/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author oluwapelumi.olaoye
 */
public class FrogRiverOne {
    public int sum = 0;
    
    public static void main(String[] args){
        int[] array = {1, 3, 1, 4, 2, 3, 5, 4};
        FrogRiverOne solve = new FrogRiverOne();
        System.out.println(solve.solution(5, array));
    }
    
    public int solution(int X, int[] A) {
        // write your code in Java SE 8
        int arraySize = A.length;
        
        for(int i = 1; i <= X; i++) {
            sum += i;
        }
        
        for(int i = 0; i < arraySize; i++) {
            if((A[i] != X)) {
                sum ^= A[i];
            }
            if(A[i] == X) {
                return i;
            }
        }
        return -1;
    }
    
}
