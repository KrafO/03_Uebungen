package com.cc.java;

import java.util.Scanner;

public class Uebung01 
{

    public static void main(String[] args) {
       
        /*
         * Entscheiden, ob Zahl gerade oder ungerade ist
         */
        
        // Hier wird ein Objekt der Klasse Scanner erstellt
        // mit dessen Hilfe Eingaben in der Konsole eingelesen 
        // werden können

        Scanner scan = new Scanner(System.in);

         // Deklaration einer Variablen vom Typ int --> Ganzzahl
        int zahl = 0;
        String oddeven = "";
        boolean check;
        
        // Systemausgabe in die Konsole:
        System.out.println("Bitte geben Sie eine Zahl von 1 - 100 ein:");
        
        // Warten auf Eingabe, Wert wird in int konvertiert
        zahl = scan.nextInt();

        // Test  / even: %2 = 0 | odd: %2 != 0
        // Aussage wahr? --> true | false
        check = (zahl % 2 == 0);  

        // Verzweigung (if-else)
        if (check) {
           oddeven = "gerade"; 
        } else {
           oddeven = "ungerade";  
        }

        // Ausgabe:
        System.out.println("Die Zahl:" + zahl + " ist " + oddeven +".");

        // Objekt schließen
        scan.close();



    }
    
}


