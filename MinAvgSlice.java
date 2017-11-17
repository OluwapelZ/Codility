/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author oluwapelumi.olaoye
 */
public class MinAvgSlice {
    
    public static void main(String[] args) {
        int[] array = {4, 2, 2, 5, 1, 5, 8};
        MinAvgSlice solution = new MinAvgSlice();
        System.out.print(solution.solution(array, array.length));
    }
    
    public int solution(int[] A, int N) {
        int average = 0;
        int answer = 0;
      
        for(int i = 0; i < N; i++) {
           int sum = 0;
           if(i + 1 < N) {
            sum ^= A[i] + A[i + 1];
           if(A[i + 1] > A[i]){
            average = sum / ((A[i + 1] - A[i]) + 1);
           }
            if(i + 2 < N && (A[i + 2] > A[i])) {
                sum ^= A[i + 2];
                if(A[i + 2] > A[i + 1]){
                int result = sum / ((A[i + 2] - A[i]) + 1);
                    if(result < average) {
                        average = result;
                        answer = i;
                        break;
                    }
                }
            }
           }
        }
        
        return answer;
    }
    
}
