package ca.qc.bdeb.sim202;

import java.io.Serializable;

public class Zombie extends Monstre {

    public Zombie(String nom, int age) {
        super(nom, age);
    }

    @Override
    public void fairePeur() {
        System.out.println("Aaaaaaaaa !!!");
    }
}
