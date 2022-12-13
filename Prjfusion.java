package com.company;
import java.io.*;

public class Prjfusion
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader fa= new BufferedReader(new FileReader("ListeA.txt"));
        BufferedReader fb= new BufferedReader(new FileReader("ListeB.txt"));
        PrintWriter nouv= new PrintWriter(new FileOutputStream("ListeC.txt"));
        String a=fa.readLine();
        String b=fb.readLine();
        while(a!=null&&b!=null)
        {
            String[] taba =a.split(" ");
            String[] tabb =b.split(" ");
            if(Integer.parseInt(taba[0])<Integer.parseInt(tabb[0]))
            {
                nouv.println(a);
                a=fa.readLine();
            }
            else if(Integer.parseInt(taba[0])>Integer.parseInt(tabb[0]))
            {
                nouv.println(b);
                b=fb.readLine();
            }
            else
            {
                nouv.println(a);
                a=fa.readLine();
                b=fb.readLine();
            }
            while(a!=null)
            {
                nouv.println(a);
                a=fa.readLine();
            }
            while(b!=null)
            {
                nouv.println(b);
                b=fb.readLine();
            }
            fa.close();
            fb.close();
            nouv.close();
            afficher("listeA.txt");
            afficher("listeB.txt");
            afficher("listeC.txt");
        }
    }
    public static void afficher(String nom) throws Exception
    {
        BufferedReader fich= new BufferedReader(new FileReader(nom));
        System.out.println("Contenu du fichier "+nom);
        String ligne;
        while((ligne=fich.readLine())!=null)
        {
            System.out.println(ligne);
        }
        fich.close();
    }
}