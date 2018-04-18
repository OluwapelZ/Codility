
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author oluwapelumi
 */
public class Solution {
    
    public int solution(int N) {
        int binaryGap = 0;
        String binaryString = Integer.toBinaryString(N);
        System.out.println(binaryString);
        String[] binaryArray = binaryString.split("");
        int increment = 0;
        for (String binaryArray1 : binaryArray) {
            if (binaryArray1.equals("0")) { 
                increment++;
            } else {
                if(increment > binaryGap)
                    binaryGap = increment;
                increment = 0;
            }
                
        }
        return binaryGap;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        Solution solution = new Solution();
        System.out.println(solution.solution(input));
    }
    
}
