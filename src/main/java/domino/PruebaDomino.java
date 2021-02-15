/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domino;

import java.util.Scanner;

/**
 *
 * @author raquel
 */
public class PruebaDomino {

    static Scanner entrada = new Scanner(System.in);

    //Metodo que lee numeros por teclado usando Scanner
    public static int leeNumero() {

        int numero;

        System.out.println("Introduce un numero: ");
        do {
            numero = entrada.nextInt();
        } while (numero < 0 || numero > 6);

        return numero;

    }

    //Metodo que devuelve si la ficha es seis doble o no
    public static boolean esSeisDoble(FichaDomino ficha) {
        return ficha.getParteUno() == 6 && ficha.getParteDos() == 6;
    }

    public static void main(String[] args) {

        //Creacion del objeto f1
        System.out.println("Creacion del objeto f1. Valores de la ficha: ");
        int parteUno = leeNumero();
        int parteDos = leeNumero();

        FichaDomino f1 = new FichaDomino(parteUno, parteDos);
        
        //Creacion del objeto f2
        System.out.println("Creacion del objeto f2. Valores de la ficha: ");
        int f2Uno = leeNumero();
        int f2Dos = leeNumero();
        
        FichaDomino f2 = new FichaDomino(f2Uno,f2Dos);
        
        //Imprimir por pantalla los dos objetos usando toString 
        System.out.println("Ficha f1: " + f1.toString() + 
                "\nFicha f2: " + f2.toString());
        
        
        //Crear un objeto con datos erroneos usando el constructor
        System.out.println("Creacion de un objeto erroneo");

        FichaDomino f3 = new FichaDomino(9, 8);
        System.out.println(f3.toString());

        //Creacion de objeto f4
        FichaDomino f4 = new FichaDomino();

        //Cambio de los valores de f4
    }

}
