package com.company;
import java.io.*;

public class Main
{
    public static void main(String[] args) throws Exception
    {
        //Déclaration et ouverture du fichier physique Notes.csv en mode lecture
        BufferedReader lecture= new BufferedReader(new FileReader("Notes.csv"));
        String chaine; //pour contenir la ligne lue du fichier
        chaine= lecture.readLine();//lecture de  la 1iere ligne du fichier
        while((chaine=lecture.readLine()) !=null)
        {
            System.out.println(chaine);
            //lignes suivantes
        }
        lecture.close();
        lecture= new BufferedReader(new FileReader("Notes.csv"));
        //Stoker chaque ligne dans un tableau
        String tab[];//pour récupérer une ligne et la mettre dans le tableau de String
        chaine=lecture.readLine();
        int cpt=1;//compteur de lignes
        while((chaine=lecture.readLine()) !=null)
        {
            tab=chaine.split(";");//une ligne a été spliter dans les cases de tab
            //  System.out.println("Taille du tableau="+tab.length);
            //Afficher le prénom et le nom
            //System.out.println(tab[1]+"\t"+tab[2]);
            if(cpt !=1)
            {
                for(int i=3; i< tab.length;i++ )
                {  // afficher si echec ou réussite
                    if(Integer.parseInt(tab[i])  >= 60 )
                        System.out.print("\tRéussite:"+"\t"+tab[i]);
                    else
                        System.out.print("\tEchec"+"\t"+tab[i]);
                }
                System.out.println();
            }
            //lecture suivant
            cpt++;
        }
        lecture.close();
    }
}
