package ca.qc.bdeb.sim202.cartes;

import java.util.ArrayList;

public class PartieDeCartes {
    private ArrayList<Joueur> joueurs = new ArrayList<Joueur>();

    public ArrayList<Joueur> getJoueurs() {
        return joueurs;
    }

    public void setJoueurs(ArrayList<Joueur> joueurs) {
        this.joueurs = joueurs;
    }

    public PartieDeCartes(PaquetCartes paquetCartes) {
        for (Position p : Position.values()) {
            Joueur nord = new Joueur(p);
            joueurs.add(nord);
        }
        for (int i = 0; i < paquetCartes.getCartes().size(); i++) {
            joueurs.get(i % 4).updateList(paquetCartes.getCartes().get(i));
        }
    }

    @Override
    public String toString() {
        String string = null;
        for (Joueur j : joueurs) {
            string += j+"\n";
        }
        return string;
    }
}
