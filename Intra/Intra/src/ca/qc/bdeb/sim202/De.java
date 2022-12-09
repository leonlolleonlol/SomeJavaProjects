package ca.qc.bdeb.sim202;

import java.util.Random;

/**
 * Dé utilisable pour obtenir un nombre aléatoire qui
 * reste le même d'une exécution à l'autre.
 * <p>
 * Dans le jeu, chaque personnage devrait avoir son propre De
 */
public class De {
    private static long germeAleatoire = 0;

    private Random random;

    public De() {
        this.random = new Random(germeAleatoire);
        germeAleatoire++;
    }

    /**
     * Permet d'obtenir un nombre aléatoire comme avec un roulement de Dé
     *
     * @param nbFaces le nombre de faces du dé pour ce lancer
     * @return un nombre compris entre 1 et nbFaces
     */
    public int rouler(int nbFaces) {
        return (int) Math.floor(random.nextDouble() * nbFaces) + 1;
    }
}
