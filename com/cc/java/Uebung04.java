package com.cc.java;

import java.util.Scanner;

public class Uebung04 
{

    public static void main(String[] args) {
       
        /*
         * Konvertieren einer Dezimal- in eine Dualzahl
         * nach dem Restwertverfahren
         * https://www.matheretter.de/wiki/dezimal-binar-rest
         */
        
       
        Scanner scan = new Scanner(System.in);

         // Deklaration einer Variablen vom Typ int --> Ganzzahl
        int decimal;
        int tmp;
        String dual = "";

        // Systemausgabe in die Konsole:
        System.out.println("Bitte geben Sie eine Ganzzahl von 0 - 15 ein:");
        
        // Warten auf Eingabe, Wert wird in int konvertiert
        decimal = scan.nextInt();
        tmp = decimal;

        do {
            dual = Integer.toString(tmp%2) + dual;
            tmp = tmp / 2;
        } while (tmp > 0);


        // Ausgabe:
        System.out.println("Die Zahl:" + decimal + " ist " + dual + " als Dualzahl.");

        // Objekt schließen
        scan.close();

    }
    
}


