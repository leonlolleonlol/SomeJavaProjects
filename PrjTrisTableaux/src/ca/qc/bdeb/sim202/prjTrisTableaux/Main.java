package ca.qc.bdeb.sim202.prjTrisTableaux;

import java.io.IOError;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //int tableau[] = initialisation(new int[10000]);
        //System.out.println(rechercherDicho(tableau, 60));
        //afficherMenu(scanner);
        ArrayList<String> listeDeStrings = new ArrayList<>();
        listeDeStrings.add("Gregor Clegane");
        inserer(listeDeStrings, "Khal Drogo");
        inserer(listeDeStrings, "Cersei Lannister");
        inserer(listeDeStrings, "Sandor Clegane");
        inserer(listeDeStrings, "Tyrion Lannister");
        inserer(listeDeStrings, "Robert Baratheon");
        inserer(listeDeStrings, "Joffrey Baratheon");
        inserer(listeDeStrings, "Mélisandre");
        inserer(listeDeStrings, "Ramsay Bolton");
        inserer(listeDeStrings, "Walder Frey");
        inserer(listeDeStrings, "Theon Greyjoy");
        inserer(listeDeStrings, "Sansa Stark");
        inserer(listeDeStrings, "Catelyn Tully");
        listeDeStrings.remove(listeDeStrings.get(listeDeStrings.size()-1));
        inserer(listeDeStrings, "Gregor Clegane");
        for (int i = 0; i < listeDeStrings.size(); i++) {
            System.out.print(listeDeStrings.get(i)+" ");
        }
    }

    private static ArrayList<String> inserer(ArrayList<String> listeDeStrings, String string) {
        boolean found = false;
        int tailleInitiale = listeDeStrings.size();
            for (int i = 0; i < tailleInitiale; i++) {
                int h = 0;
                if(!found)
                    found = comparaison(listeDeStrings, i, h, string);
                else
                    break;
            }
        return listeDeStrings;
    }
    public static boolean comparaison(ArrayList<String> listeDeStrings, int i,int h,String string)
    {
        boolean found=false;
        int i1 = string.charAt(h);
        int i2=listeDeStrings.get(i).charAt(h);
        int difference = i2-i1;
        if (difference < 0 || i == listeDeStrings.size() - 2) {
            found = true;
            listeDeStrings.add(i, string);
        }
        else if(difference==0)
        {
            h++;
            comparaison(listeDeStrings, i, h, string);
        }
        return found;
    }
    public static int[] initialisation(int[] tableau) {
        for (int i = 0; i < tableau.length; i++) {
            tableau[i] = (i + 1) * 2;
        }
        return tableau;
    }

    private static int rechercherDicho(int[] tableau, int valeur) {
        int min = 0;
        int max = tableau.length - 1;
        int indice = ((min + max) / 2);
        while (tableau[indice] != valeur) {
            indice = ((min + max) / 2);
            if (min >= max && tableau[indice] != valeur)
                return -1;
            else {
                if (tableau[indice] > valeur)
                    max = indice - 1;
                else
                    min = indice + 1;
            }
        }
        return tableau[indice];
    }

    private static void afficherMenu(Scanner scanner) {
        try {
            int reponse = 0;
            while (reponse != 3) {
                System.out.println();
                System.out.println("Choisis un nombre entre 1 et 1000! Quand tu es prêt,");
                System.out.println("Choisis comment tu veux que l'ordinateur se comporte:");
                System.out.println();
                System.out.println("1. Mode Super Efficace : je vais le trouver en 10 coups ou moins");
                System.out.println("2. Mode Normal: pas aussi efficace, je vais le trouver un moment donné");
                System.out.println("3. Sortir.");
                System.out.println("Entrer un nombre: ");
                reponse = scanner.nextInt();
                switch (reponse) {
                    case 1:
                        modeNormal(true);
                        break;
                    case 2:
                        modeNormal(false);
                        break;
                    case 3:
                        System.out.println("A plus!");
                }
            }
        } catch (NumberFormatException e) {
            System.out.println("erreur");
        }
    }

    private static void modeNormal(boolean dicho) {
        int cpt = 1;
        int min = 1;
        int max = 1000;
        boolean quitter = false;
        afficherMenuDeux(cpt, min, max, quitter, dicho);
    }

    private static void afficherMenuDeux(int cpt, int min, int max, boolean quitter, boolean dicho) {
        try {
            int guess = 0;
            while (!quitter || max - min == 1) {
                if (!dicho)
                    guess = new Random().nextInt(max - min + 1) + min;
                else
                    guess = (max - min) / 2 + min;
                Scanner input = new Scanner(System.in);
                System.out.println("L'ordinateur a choisi: " + guess + " (essai # " + cpt + ")");
                System.out.println("1. Bravo, vous avez trouvé mon nombre!!!!");
                System.out.println("2. Mon nombre est plus petit.");
                System.out.println("3. Mon nombre est plus grand.");
                int choix = Integer.parseInt(input.nextLine());
                switch (choix) {
                    case 1:
                        quitter = true;
                        break;
                    case 2:
                        if (!dicho)
                            max = guess - 1;
                        else
                            max = guess;
                        break;
                    case 3:
                        if (!dicho)
                            min = guess + 1;
                        else
                            min = guess;
                        break;
                    default:
                        System.out.println("erreur");
                }
                cpt++;
            }
            System.out.println("Nice! Le nombre est " + guess + " et je l'ai trouvé en " + (cpt - 1) + " essais.");
        } catch (NumberFormatException e) {
            System.out.println("Erreur de conversion en entier");
        } catch (IOError e) {
            System.out.println("Erreur input output");
        } catch (IllegalArgumentException e) {
            System.out.println("Le range du min au max n'est pas positif");
        }
    }
}
