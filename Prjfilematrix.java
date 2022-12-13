package com.company;
import java.io.*;

public class Prjfilematrix
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader lecture= new BufferedReader(new FileReader("Notes.csv"));
        String chaine;
        chaine=lecture.readLine();
        int cpt=0;// nombre de lignes dans le fichier
        while (chaine !=null)
        {
            System.out.println(chaine);
            cpt++;
            chaine=lecture.readLine();
        }
        lecture.close();
        String[][] tab = new String [cpt-1][1];
        //chercher la taille du fichier
        lecture= new BufferedReader(new FileReader("Notes.csv"));
        int i=0;
        lecture.readLine();
        chaine=lecture.readLine();
        while (chaine !=null)
        {
            tab[i]=chaine.split(";");
            System.out.println(tab[i][0]);
            i++;
            chaine=lecture.readLine();
        }
        lecture.close();
        System.out.println("Contenu de la matrice:");
        for(i=0; i < tab.length;i++)
        {
            for(int j=0; j < tab[i].length;j++ )
            {
                System.out.print (tab[i][j]+" ");
            }
            System.out.println();
        }
    }
}