package ca.qc.bdeb.inf202.remplissage;

import java.util.Stack;

class Remplissage {

    public static void dessinerTab(char[][] tab) {
        for (char[] ligne : tab) {
            for (char c : ligne) {
                System.out.print(c);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        char[][] tableau = new char[][]{
                "+---------------------+------------------------+".toCharArray(),
                "|                     |                        |".toCharArray(),
                "|                     |                        |".toCharArray(),
                "|                     |                        |".toCharArray(),
                "|                     |                        |".toCharArray(),
                "|                     |                        |".toCharArray(),
                "|                     |                        |".toCharArray(),
                "|                     |                        |".toCharArray(),
                "|                     |                        |".toCharArray(),
                "+---------------------+------------------------+".toCharArray(),
                "|     x        x      |                        |".toCharArray(),
                "|     x    x   x      |        +-----+         |".toCharArray(),
                "|     x    x   x      |        |     |         |".toCharArray(),
                "|     x    x   x      |        |               |".toCharArray(),
                "|     x    x   x      |        +-----+         |".toCharArray(),
                "|     x    x   x      |                        |".toCharArray(),
                "|          x   x      |                        |".toCharArray(),
                "+---------------------+------------------------+".toCharArray(),
        };

        dessinerTab(tableau);

        // Ligne 12, Colonne 7 => remplir dans la zone en bas à gauche
        remplissageParDiffusionRec(tableau, 12, 26, '!');

        dessinerTab(tableau);

    }

    public static void remplissageParDiffusion(char[][] tab,
                                               int departLigne, int departCol,
                                               char symbole) {

        // VERSION AVEC LinkedList : regarder les plus vieilles
        // cases ajoutées en premier (décommenter pour tester)
        // LinkedList<Coordonnee> casesARegarder = new LinkedList<>();

        // VERSION AVEC Stack : regarder les cases les plus récentes ajoutées en premier
        Stack<Coordonnee> casesARegarder = new Stack<>();

        // casesARegarder.offer(new Coordonnee(departLigne, departCol));
        casesARegarder.push(new Coordonnee(departLigne, departCol));


        while (!casesARegarder.isEmpty()) {

            Coordonnee coordonnee = casesARegarder.pop();

            int ligne = coordonnee.getLigne();
            int col = coordonnee.getCol();

            if (tab[ligne][col] == ' ') {

                tab[ligne][col] = symbole;

                dessinerTab(tab);

                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }


                for (int i = -1; i <= 1; i++) {
                    for (int j = -1; j <= 1; j++) {
                        if ((i == 0 && j == 0) ||
                                (ligne + i < 0 || ligne + i >= tab.length ||
                                        col + j < 0 || col + j >= tab[ligne].length))
                            continue;

                        // casesARegarder.offer(new Coordonnee(ligne - i, col - j));
                        casesARegarder.push(new Coordonnee(ligne + i, col + j));
                    }
                }

            }

        }

    }

    public static void remplissageParDiffusionRec(char[][] tab,
                                               int ligne, int col,
                                               char symbole) {

        if (tab[ligne][col] == ' ') {

            tab[ligne][col] = symbole;

            dessinerTab(tab);

            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


            for (int i = -1; i <= 1; i++) {
                for (int j = -1; j <= 1; j++) {
                    if ((i == 0 && j == 0) ||
                            (ligne + i < 0 || ligne + i >= tab.length ||
                                    col + j < 0 || col + j >= tab[ligne].length))
                        continue;

                    remplissageParDiffusionRec(tab, ligne - i, col - j, symbole);
                }
            }

        }


    }
}
