package com.company;

public class Main {

    public static void main(String[] args) {
        int nettoPreis;
        nettoPreis = 200;
        float steuersatz = 0.05f;
        float bruttoPreis = nettoPreis + nettoPreis * steuersatz;
        System.out.println("Ergebnis: "+ bruttoPreis + "€");

        float maximalWert = 0.2f;

        boolean zuHoch;
        zuHoch = maximalWert > steuersatz;
        System.out.println("Steuer sind zu hoch " + zuHoch );

        boolean zuNiedrig = maximalWert == steuersatz;
        System.out.print(zuNiedrig);

    }
}
