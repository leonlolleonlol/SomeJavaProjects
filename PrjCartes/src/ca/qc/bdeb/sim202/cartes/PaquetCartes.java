package ca.qc.bdeb.sim202.cartes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class PaquetCartes {
    private ArrayList<Cartes> cartes = new ArrayList<Cartes>();

    public PaquetCartes() {
        Random random = new Random();
        for (int i = 0; i < 52; i++) {
            Cartes carte1 = new Cartes(CouleursCartes.values()[i / 14], (i % 13) + 2);
            cartes.add(carte1);
        }
    }

    public ArrayList<Cartes> getCartes() {
        return cartes;
    }

    public void setCartes(ArrayList<Cartes> cartes) {
        this.cartes = cartes;
    }

    public Cartes pigerUneCarte() {
        return cartes.get(0);
    }

    public Cartes[] pigerPlusieursCartes(int nombre) {
        Cartes[] cartespiges = new Cartes[nombre];
        if (nombre > 1 && nombre <= cartes.size()) {
            for (int i = 0; i < nombre; i++) {
                cartespiges[i] = pigerUneCarte();
                cartes.remove(cartes.get(i));
            }
        } else {
            System.out.println("Le nombre désiré est soit en bas de 2 ou plus grand que le nombre de cartes dans le paquet");
        }
        return cartespiges;
    }

    public void melangerCartes() {
        Collections.shuffle(cartes);
    }

    public void ajouterDessus(Cartes carte) {
        cartes.add(carte);
    }

    public int getNombreCartes() {
        return cartes.size();
    }

    public boolean estDansLePaquet(Cartes carte) {
        boolean trouve = false;
        for (Cartes c : cartes) {
            if (carte.getCouleur()==c.getCouleur()&&carte.getLettre()==c.getLettre()) {
                trouve = true;
                break;
            }
        }
        return trouve;
    }
}
