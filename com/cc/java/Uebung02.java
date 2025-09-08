package com.cc.java;

<<<<<<< HEAD
=======
import java.util.Scanner;

>>>>>>> a6207d41ff5ddb6fa1de4f92baa751efd99831b9
public class Uebung02 
{

    public static void main(String[] args) {
       
        /*
         * Addition von zwei Zahlen
         */
        
       
        Scanner scan = new Scanner(System.in);

         // Deklaration von Variablen vom Typ int --> Ganzzahl
        int zahl1;
        int zahl2;
        int summe;
        
        // Systemausgabe in die Konsole:
        System.out.println("Bitte geben Sie eine Ganzzahl ein:");
        // Warten auf Eingabe, Wert wird in int konvertiert
        zahl1 = scan.nextInt();
        // Systemausgabe in die Konsole:
        System.out.println("Bitte geben Sie eine weitere Ganzzahl ein:");
        // Warten auf Eingabe, Wert wird in int konvertiert
        zahl2 = scan.nextInt();

        // Summenbildung
        summe = zahl1 + zahl2;

        // Ausgabe:
        System.out.println("Die Summe von " + zahl1 + " und "+ zahl2 + " ist " + summe +".");

        // Objekt schließen
        scan.close();


    }
    
}


