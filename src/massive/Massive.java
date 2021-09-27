/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package massive;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author User
 */
public class Massive {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] matrix = new int [5][5];
        for (int i = 0; i <matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = i*j;
            }
        }
        int [] sumCols = new int [5]; 
        for (int i = 0; i < matrix.length; i++) {
            int sum = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf("%4d",matrix[i][j]);
                sum += matrix[i][j];
                sumCols[j] += matrix[i][j];
                
            }
            System.out.printf("| сумма строки = "+sum);
            System.out.println("");
        }
        System.out.println("\n--Сумма столбцов--\n");
        for (int i = 0; i < sumCols.length; i++) {
            System.out.printf("%4d", sumCols[i]);
        }
        System.out.println("\n--------------------------------------------");
        
        int[][] matrixZ = new int [5][];
        matrixZ [0] = new int[1];
        matrixZ [1] = new int[2];
        matrixZ [2] = new int[3];
        matrixZ [3] = new int[4];
        matrixZ [4] = new int[5];
        Random random = new Random();
        int min = 0, max = 9;
        for (int i = 0; i < matrixZ.length; i++) {
            for (int j = 0; j < matrixZ[i].length; j++) {
                matrixZ[i][j] = random.nextInt(max - min + 1)+ min;
            }
        }
//        for (int i = 0; i <matrixZ.length; i++) {
//            for (int j = 0; j < matrixZ[i].length; j++) {
//                matrixZ[i][j] = i*j;
//            }
//        }
        int [] sumCols2 = new int [5]; 
        for (int i = 0; i < matrixZ.length; i++) {
            int sum2 = 0;
            for (int j = 0; j < matrixZ[i].length; j++) {
                System.out.printf("%4d",matrixZ[i][j]);
                sum2 += matrixZ[i][j];
                sumCols2[j] += matrixZ[i][j];
            }
        System.out.printf(" | сумма строки = "+sum2);
        System.out.println("");
        }
    System.out.println("\n--Сумма столбцов--\n");
        for (int i = 0; i < sumCols2.length; i++) {
            System.out.printf("%4d", sumCols2[i]);
        }
        System.out.println("");
    }
}
