/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author oluwapelumi.olaoye
 */
public class CountDiv {
    
    public static void main(String[] args) {
        CountDiv solve = new CountDiv();
        System.out.println(solve.solution(0, 0, 11));
    }
    
    //return number of element within range A,B that are divisible by K.
    public int solution(int A, int B, int K){
        int res  = (B - A) + 1;
        int result = (int) Math.ceil(res/K);
            
        return result;
        
    }
    
}
