package ca.qc.bdeb.sim202;

import java.util.Random;

/**
 * Classe pour générer un nom aléatoirement
 *
 * @author un prof
 */
public class GenerateurNom {

    private static final int ALPHABET = 26;
    private static final int NOM_MIN = 5;
    private static final int NOM_MAX = 7;
    private static final Random random = new Random();
    private static final char[] voyelles = {'a', 'e', 'i', 'o', 'u'};

    /**
     * Vérifie si le caractère est une voyelle ou pas
     *
     * @param ch un caractère
     * @return vrai si le caractère est une voyelle. Faux si c'est une consonne
     */
    private static boolean isVoyelle(char ch) {
        for (int i = 0; i < voyelles.length; i++) {
            if (voyelles[i] == ch) {
                return true;
            }
        }
        return false;
    }

    /**
     * Génère une voyelle aléatoirement.
     *
     * @return une voyelle
     */
    private static char genererVoyelle() {
        return voyelles[random.nextInt(voyelles.length)];
    }

    /**
     * Génère une consone au hasard.
     *
     * @return une consonne
     */
    private static char genererConsonne() {
        char ch = (char) (random.nextInt(ALPHABET) + 'a');
        while (isVoyelle(ch)) {
            ch = (char) (random.nextInt(ALPHABET) + 'a');
        }
        return ch;
    }

    /**
     * Générer un nom. Consonne suivi d'une voyelle
     *
     * @return String le nom généré
     */
    public static String genererNom() {
        int longueur = random.nextInt(NOM_MAX - NOM_MIN + 1) + NOM_MIN;
        char ch = genererConsonne();
        String nom = "";
        nom += Character.toUpperCase(ch);

        while (nom.length() < longueur) {
            nom += (nom.length() % 2 == 1) ? genererVoyelle()
                    : genererConsonne();
        }

        return nom;
    }

}
