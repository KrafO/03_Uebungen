package com.cc.java;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Uebung01a
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
        

        // Var. 1 Falsche Eingabe --> Abbruch

         System.out.println("Bitte geben Sie eine Zahl von 1 - 100 ein:");

        try {
             zahl = scan.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Falsche Eingabe, Abbruch!");
            scan.close();
            return; // Abbruch der Funktion
        }
       

        // Var 2. mit Kopfgesteuerter Schleife
        
        // boolean isInputValid = false;
       
        // //  Schleife läuft so lange, bis eine gültige Zahl eingegeben wurde
        // while (!isInputValid) {

        //    System.out.println("Bitte geben Sie eine Zahl von 1 - 100 ein:");

        //     try {
        //         zahl = scan.nextInt();
        //         isInputValid = true; // Eingabe OK, Schleife beenden
            
        //     } catch (InputMismatchException e) {
        //         System.out.println("Input nicht korrekt");
        //         scan.next(); // Scanne-Puffer leeren
        //     }
        // }



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


