package com.company;

public class Main {

    public static void main(String[] args) {
        int nettoPreis;
        nettoPreis = 200;
        double steuersatz = 0.05;
        double bruttoPreis = nettoPreis + nettoPreis * steuersatz;
        System.out.println("Ergebnis: "+ bruttoPreis + "€");

        double maximalWert = 0.04;

        boolean zuHoch;
        zuHoch = steuersatz > maximalWert;
        System.out.println("Steuer sind zu hoch " + zuHoch );

        boolean istUngleich = maximalWert != steuersatz;
        System.out.print(istUngleich);

    }
}
