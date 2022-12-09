package ca.qc.bdeb.sim202;

import java.io.*;
import java.util.Random;

public class Main {
    private static final int NOMBRE_MONSTRES = 5;
    private static final int AGE_MIN_VAMPIRE = 100;
    private static final int AGE_MAX_VAMPIRE = 250;
    // ça, c'est acceptable
    private static final Random aleatoire = new Random();



    public static void main(String[] args) {

        Monstre[] monstres = lireMonstres();

        if (monstres == null) {
            monstres = creerMonstres();
            ecrireMonstres(monstres);
        }
        afficherMonstres(monstres);
    }

    private static Monstre[] lireMonstres() {
        Monstre[] monstres = null;
        // lire le tableau du fichier monstres.txt
        try(ObjectInputStream fichierALire= new ObjectInputStream(new FileInputStream("monstres.txt")))
        {
            monstres=(Monstre[]) fichierALire.readObject();
        }
        catch (FileNotFoundException e)
        {
            System.out.println("Fichier introuvable");
        }
        catch (IOException e)
        {
            System.out.println("Erreur input output");
        }
        catch (ClassNotFoundException e )
        {
            System.out.println("Classe introuvable");
        }
        // Si une exception est générée, on retourne null
        return monstres;
    }

    private static void ecrireMonstres (Monstre[] monstres) {
        try (ObjectOutputStream fichierARemplir = new ObjectOutputStream(new FileOutputStream("monstres.txt"))){
            fichierARemplir.writeObject(monstres);
            fichierARemplir.close();//on s'assure d'ajouter les dernères infos à remplir dans le fils et ca met en gris car ca garantit que on close quand on va dans chaque exception
        }
        catch (FileNotFoundException e)
        {
            System.out.println("Le fichier ne peut pas être ouvert");
        }
        catch (IOException e)
        {
            System.out.println("erreur de input output");
        }
    }

    // Les méthodes dans ce fichier-ci sont toutes static.

    private static int genererAge(int min, int max) {
        // si jdk 17
        //return new Random().nextInt(min, max + 1);
        //
        // sinon
        return aleatoire.nextInt(max - min + 1) + min;
    }

    private static int genererAge() {
        // Quand ce n'est pas un quiz, on se définit des constantes
        // Dans un quiz ou intra, ça passe
        return genererAge(AGE_MIN_VAMPIRE, AGE_MAX_VAMPIRE);
    }

    private static Force genererForce() {
        Force[] tableau = Force.values();
        return tableau[aleatoire.nextInt(tableau.length)];
        //
        //ou
        // return Force.values()[aleatoire.nextInt(Force.values().length)];
    }
    private static Monstre creerMonstre() {
        Monstre monstre;

        // ou aleatoire.nextBoolean()
        if (aleatoire.nextInt() % 2 == 0) {
            monstre = new Vampire(GenerateurNom.genererNom(), genererAge(), genererForce());
        } else {
            monstre = new Zombie(GenerateurNom.genererNom(), genererAge());
        }
        return monstre;
    }

    private static Monstre[] creerMonstres() {
        Monstre[] monstres = new Monstre[NOMBRE_MONSTRES];

        for (int i = 0; i < monstres.length; i++) {
            monstres[i] = creerMonstre();
        }

        return monstres;
    }

    private static void afficherMonstres(Monstre[] monstres) {
        for (Monstre monstre: monstres) {
            // on pourrait vérifier que monstre != null
            monstre.fairePeur();
        }
    }
}
