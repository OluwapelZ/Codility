
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.*;
import java.util.*;

/**
 * 
 *
 * @author oluwapelumi
 */
public class BestRecord {
    static int[] breakingRecords(int[] scores) {
        int highest = 0;
        int lowest = 0;
        //Count
        int highest_count = 0;
        int lowest_count = 0;
        
        int record_count = scores.length;
        for (int i = 0; i < record_count; i++) {
            if (i == 0) {
                highest = scores[i];
                lowest = scores[i];
            }
            
            if (scores[i] > highest) {
                highest = scores[i];
                highest_count += 1;
            }
            
            if (scores[i] < lowest) {
                lowest = scores[i];
                lowest_count += 1;
            }
        }
        
        int[] result_array = {highest_count, lowest_count};
        return result_array;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] scores = new int[n];

        String[] scoresItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int scoresItem = Integer.parseInt(scoresItems[i]);
            scores[i] = scoresItem;
        }

        int[] result = breakingRecords(scores);

        for (int i = 0; i < result.length; i++) {
            bufferedWriter.write(String.valueOf(result[i]));

            if (i != result.length - 1) {
                bufferedWriter.write(" ");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }   
    
}
