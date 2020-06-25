/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1teoria;

/**
 *
 * @author Usuario
 */
public class MatrizTransaccion {

    public void CrearMatrizTransaccion() {

        String matriz[][] = new String[5][4];
        System.out.println("//////////////////////////////");
        System.out.println("Matriz de transacción Automata");
        System.out.println("--------------------------------");
        matriz[0][0] = "/";
        matriz[1][0] = "q0";
        matriz[2][0] = "q1";
        matriz[3][0] = "q2";
        matriz[4][0] = "q3";
        matriz[0][1] = " 0";
        matriz[0][2] = " 1";
        matriz[1][1] = "q0";
        matriz[1][2] = "q1";
        matriz[2][1] = "q2";
        matriz[2][2] = "q1";
        matriz[3][1] = "q0";
        matriz[3][2] = "q3";
        matriz[4][1] = "q2";
        matriz[4][2] = "q2";
        for (int i = 0; i <= 4; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("--------------------------------");

    }
}
