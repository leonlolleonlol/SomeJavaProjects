package ca.qc.bdeb.sim202;

import java.io.Serializable;

public class Vampire extends Monstre {
    private Force force;

    public Vampire(String nom, int age, Force force) {
        super(nom, age);
        this.force = force;
    }

    @Override
    public void fairePeur() {
        System.out.println("Mon nom est " + nom + " et je mords " + force);

        // bon, j'avais dit utiliser un switch mais maintenant qu'on sait qu'on peut
        // redéfinir le toString() d'un enum, ce code est plus beau.
    }
}
