/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin20_1;

/**
 *
 * @author Samuel
 */
public class Futbol {
//  int goles[][]=new int[3][3];  

    String[] equipos = {"Celta ", "Depor ", "Malaga"};
    String[] xornadas = {"X1", "X2", "X3"};
    int[][] goles = {{3, 4, 2}, {1, 2, 1}, {3, 0, 1}};
//
    public void imprimirTabla( String[] equipos, String[] xornadas,int[][] goles) {
        System.out.print("Eq/xor  ");
        for (int x = 0; x < goles.length; x++) {
            System.out.print(xornadas[x]+"     ");
        }
            System.out.println("");
        for(int x = 0; x < goles.length; x++){
             System.out.print(equipos[x]);
            for (int y = 0; y < goles[x].length; y++) {
               
                System.out.print(" | ");
                System.out.print(goles[x][y]);
                System.out.print(" | ");

            }
            System.out.println();
        }
        
    }

}
