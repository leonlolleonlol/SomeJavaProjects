package ca.qc.bdeb.sim202;

public enum Force {
    FAIBLE("faiblement"),
    MOYEN("moyennement"),
    FORT("fortement");

    private String texte;

    Force(String texte) {
        this.texte = texte;
    }

    @Override
    public String toString() {
        return texte;
    }
}
