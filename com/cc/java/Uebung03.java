package com.cc.java;

import java.util.Scanner;

public class Uebung03 
{

    public static void main(String[] args) {
       
        /*
         *  Rechenoperationen mit zwei Zahlen
         */
        
        Scanner scan = new Scanner(System.in);

         // Deklaration von Variablen vom Typ double --> ggf. werden gebrochene Zahlen erwartet
        double zahl1 = 0;
        double zahl2 = 0;
        double ergebnis = 0; 
        // Deklaration von Variablen vom Typ String --> Text
        String op; 
        
        // Systemausgabe in die Konsole:
        System.out.println("Bitte geben Sie eine Ganzzahl ein:");
        // Warten auf Eingabe, Wert wird in int konvertiert
        zahl1 = scan.nextInt();
        // Systemausgabe in die Konsole:
        System.out.println("Bitte geben Sie eine weitere Ganzzahl ein:");
        // Warten auf Eingabe, Wert wird in int konvertiert
        zahl2 = scan.nextInt();

         // Systemausgabe in die Konsole:
        System.out.println("Welche Operation möchten Sie ausführen (+, -, *, :)?:");
        op = scan.next();

       // System.out.println(op); // Testausgabe

        switch (op) {
            case "+":
                ergebnis = zahl1 + zahl2;
                break;
            case "-":
                ergebnis = zahl1 - zahl2;
                break;
            case "*":
                ergebnis = zahl1 * zahl2;
                break;
            case ":":
                ergebnis = zahl1/zahl2;
                break;
        }

        // Ausgabe:
        System.out.println("Das Ergebnis ist: " + ergebnis +".");

        // Objekt schließen
        scan.close();






    }
    
}


