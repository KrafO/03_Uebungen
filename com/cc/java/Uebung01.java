package com.cc.java;

import java.util.Scanner;
<<<<<<< HEAD
=======

public class Uebung01 
{
>>>>>>> a6207d41ff5ddb6fa1de4f92baa751efd99831b9

public class Uebung01 {
    public static void main(String[] args) {
<<<<<<< HEAD
        System.out.println("Uebung 1");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bitte gib eine Zahl ein: ");
        int zahl = scanner.nextInt();
        if (zahl % 2 == 0) {
            System.out.println("Gerade");
        } else {
            System.out.println("Ungerade");
        }
        scanner.close();
=======
       
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



>>>>>>> a6207d41ff5ddb6fa1de4f92baa751efd99831b9
    }
}

