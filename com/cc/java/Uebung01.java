package com.cc.java;

import java.util.Scanner;

public class Uebung01 {
    public static void main(String[] args) {
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
    }
}

