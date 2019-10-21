
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author oluwapelumi.olaoye
 */
public class Fibonacci {
    
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int test_cases = scanner.nextInt();
        Fibonacci fibo = new Fibonacci();
        for(int i = 0; i < test_cases; i++){
            int number = scanner.nextInt();
            int result = fibo.fibonacci(number - 2) + fibo.fibonacci(number - 1);
            int final_result = result % 10;
            System.out.println(final_result);
        }
        
    }
    
    public int fibonacci(int n) {
        if(n == 0)
            return 0;
        else if(n == 1)
            return 1;
        else
            return fibonacci(n - 1) + fibonacci(n - 2);
    }
    
}
