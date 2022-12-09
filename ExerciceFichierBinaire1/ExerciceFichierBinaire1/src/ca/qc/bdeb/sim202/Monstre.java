package ca.qc.bdeb.sim202;

import java.io.Serializable;

public abstract class Monstre implements Serializable{
    protected String nom;
    private int age; // pas besoin de mettre protected

    public Monstre(String nom, int age) {
        this.nom = nom;
        this.age = age;
    }

    // Les classes qui héritent de Monstre doivent redéfinir cette méthode
    public abstract void fairePeur();
}