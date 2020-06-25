/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1teoria;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Lab1Teoria {

    static char[] caracteres;
    boolean aceptacion = false;
    int contador = 0;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        Lab1Teoria automata = new Lab1Teoria();
        MatrizTransaccion mt= new MatrizTransaccion();

        System.out.println("Ingrese La cadena");

        String cadena;

        cadena = sc.nextLine();

        while (cadena.contains(" ")) {
            System.out.println("Cadena no Aceptada");
            System.out.println("\n");
            System.out.print("Ingrese La cadena que desea determinar si se encuentra en el AFD: ");
            cadena = sc.nextLine();
            System.out.println("\f");
        }
        caracteres = cadena.toCharArray();
        automata.inicial();
        mt.CrearMatrizTransaccion();
        if (automata.aceptacion) {
            System.out.println("\n");
            System.out.println("La Cadena es Aceptada en el AFD");

        } else {
            System.out.println("\n");
            System.out.println("La Cadena no es Aceptada en el AFD");
        }
    }

    public void inicial() {
        contador = 0; //Declaramos en 0 para empezar las transiciones
        q0();

    }



    public void q0() {
        System.out.println("Estado q0 ");

        aceptacion = false;
        if (contador < caracteres.length) {
            if (caracteres[contador] == '0') { //Si es el caracter que define el automata para la transicion
     

                System.out.println("Estado q0 --> 0 q0");
                System.out.println("-------------------");
                contador++;
                q0(); //Transiciones si vale 'a' se mantenga en el estado q0

            } else if (caracteres[contador] == '1') {
                System.out.println("Estado q0 --> 1 q1");
                System.out.println("-------------------");
                contador++;
                q1();
            }
        }
    }

    public void q1() {

        System.out.println("Estado q1 ");
        aceptacion = false;
        if (contador < caracteres.length) {
            if (caracteres[contador] == '0') {
                System.out.println("Estado q1 --> 0 q2");
                System.out.println("-------------------");
                contador++;
                q2();
            } else if (caracteres[contador] == '1') {
                System.out.println("Estado q1 --> 1 q1");
                System.out.println("-------------------");
                contador++;
                q1();
            }
        }
        

    }

    public void q2() {

        aceptacion = false;

        if (contador < caracteres.length) {

            if (caracteres[contador] == '0') {
                System.out.println("Estado q2 --> 0 q0");
                System.out.println("-------------------");
                contador++;
                q0();
            } else if (caracteres[contador] == '1') {
                System.out.println("Estado q2 --> 1 q3");
                System.out.println("-------------------");
                contador++;
                q3();

            }

        }

    }

    public void q3() {
        System.out.println("Estado q3 ACEPTACION");
        aceptacion = true;

        if (contador < caracteres.length) {

            if (caracteres[contador] == '0') {
                System.out.println("Estado q3 --> 0 q2");
                System.out.println("-------------------");
                contador++;
                q2();
            } else if (caracteres[contador] == '1') {
                System.out.println("Estado q3 --> 1 q2");
                System.out.println("-------------------");
                contador++;
                q2();

            }

        }

    }

}
