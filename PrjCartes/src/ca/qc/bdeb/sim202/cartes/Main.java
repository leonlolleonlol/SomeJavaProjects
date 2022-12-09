package ca.qc.bdeb.sim202.cartes;

import java.util.InputMismatchException;

public class Main {

    public static void main(String[] args) {
        try {
            PaquetCartes paquetCartes = new PaquetCartes();
            paquetCartes.melangerCartes();
            PartieDeCartes partieDeCartes= new PartieDeCartes(paquetCartes);
            System.out.println(partieDeCartes);
        } catch (InputMismatchException e) {
            System.out.println("Erreur de conversion en entier");
        }
    }
}
