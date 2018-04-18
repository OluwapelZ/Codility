
import java.util.ArrayList;
import java.util.Arrays;
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
public class LodgerShuffler {

    public static void main(String args[]) {
        
        LodgerShuffler solve = new LodgerShuffler();
        Scanner scanner = new Scanner(System.in);
        int family_number = scanner.nextInt();
        System.out.println();
        ArrayList<String> availableLodges = new ArrayList<>();
        for (int i = 0; i < family_number; i++) {
            String line  = scanner.nextLine();
            String[] array = line.split("\\s+");
            for(int j = 0; j < family_number; j++){
                if(Arrays.asList(array).contains(array[j])){
                    //Do nothing.
                }
                else if(j == i){
                    //Do nothing
                }
                else{
                    availableLodges.add(array[i]);
                }
            }

            for(int k = 0; k < availableLodges.size(); k++){
                System.out.print(availableLodges.get(i) + " ");
            }
        }

    }
}
