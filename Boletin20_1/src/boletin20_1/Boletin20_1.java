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
public class Boletin20_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Futbol obx= new Futbol();
     String[] equipos = {"Celta", "Depor", "Malaga"};
    String[] xornadas = {"X1", "X2", "X3"};
        int[][] goles = {{3,4,2},{1,2,1},{3,0,1}};
   obx.imprimirTabla(equipos, xornadas, goles);
    }
    
}
