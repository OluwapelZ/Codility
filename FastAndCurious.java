
import java.util.ArrayList;
import java.util.Collections;
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
public class FastAndCurious {

    public static void main (String args[]){
        ArrayList<Integer> result = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int city_number = scanner.nextInt();
        int connecting_roads = scanner.nextInt();
        int[][] routes = new int[city_number][2];
        for(int i = 0; i < city_number; i++){
            routes[i][0] = scanner.nextInt();
            routes[i][1] = scanner.nextInt();
        }

        int count = 0;
        for(int k = 1; k <= city_number; k++) {
            for (int i = 0; i < city_number; i++) {
                for (int j = 0; j < 2; j++) {
                    if (k == routes[i][j]) {
                        count += 1;
                    }
                }
            }
            if(count <= city_number - 3){
                result.add(k);
                count = 0;
            }
        }

        Collections.sort(result);
        //Print content of list.
        for(int i = 0; i < result.size(); i++){
            System.out.println(result.get(i));
        }
    }
}