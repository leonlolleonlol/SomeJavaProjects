package com.company;
import java.io.*;

public class $$$
{
    public static void main(String[] args) throws Exception
    {
        afficher("Banque.txt");
        splitter("Banque.txt","Depot.txt","Retrait.txt");
        afficher("Depot.txt");
        afficher("Retrait.txt");
        int sommed=somme("Depot.txt");
        int sommer=somme("Retrait.txt");
        System.out.println("Somme des dépots:   "+sommed+"$");
        System.out.println("Somme des retraits: "+sommer+"$");
        if((sommer+sommed)<0)
            System.out.println("Vous avez des dettes de :"+-1*(sommer+sommed)+"$");
        else
            System.out.println("Compte en règle: vous avez: "+(sommer+sommed)+"$");
    }
    public static int somme(String nom)throws Exception
    {
        int somme=0;
        String ligne;
        BufferedReader file= new BufferedReader(new FileReader(nom));
        while((ligne=file.readLine())!=null)
        {
            somme+=Integer.parseInt(ligne.trim());
        }
        file.close();
        return somme;
    }
    public static void afficher(String nom) throws Exception
    {
        BufferedReader f= new BufferedReader(new FileReader(nom));
        System.out.println("Contenu du fichier "+nom);
        String ligne;
        while((ligne=f.readLine())!=null)
        {
            System.out.println(ligne);
        }
        f.close();
    }
    public static void splitter(String nomb,String nomd, String nomr) throws Exception
    {
        BufferedReader f= new BufferedReader(new FileReader(nomb)); //lecture
        PrintWriter fd= new PrintWriter(new FileOutputStream(nomd));//écriture
        PrintWriter fr= new PrintWriter(new FileOutputStream(nomr));//écriture
        String ligne;
        while((ligne=f.readLine())!=null)
        {
            if(Integer.parseInt(ligne.trim())>0)
                fd.println(ligne.trim());
            else
                fr.println(ligne.trim());
        }
        f.close();
        fd.close();
        fr.close();
    }
}