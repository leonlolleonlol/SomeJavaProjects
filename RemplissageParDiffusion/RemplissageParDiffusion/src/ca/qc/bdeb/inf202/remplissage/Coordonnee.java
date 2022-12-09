package ca.qc.bdeb.inf202.remplissage;

public class Coordonnee {
    private int ligne;
    private int col;

    public Coordonnee(int ligne, int col) {
        this.ligne = ligne;
        this.col = col;
    }

    public int getLigne() {
        return ligne;
    }

    public int getCol() {
        return col;
    }
}
