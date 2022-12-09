package ca.qc.bdeb.sim202.cartes;

public class Cartes
{
    private final CouleursCartes couleur;
    private int lettre;

    public Cartes(CouleursCartes couleur, int lettre) {
        this.couleur = couleur;
        this.lettre = lettre;
    }

    public CouleursCartes getCouleur() {
        return couleur;
    }

    public int getLettre() {
        return lettre;
    }

    public void setLettre(int lettre) {
        this.lettre = lettre;
    }

    @Override
    public String toString() {
        return "Cartes{" +
                "couleur=" + couleur +
                ", lettre=" + lettre +
                '}';
    }
}
