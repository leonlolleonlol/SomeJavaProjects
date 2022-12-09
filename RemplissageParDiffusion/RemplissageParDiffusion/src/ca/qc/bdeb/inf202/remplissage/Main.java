package ca.qc.bdeb.inf202.remplissage;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> listeFruits= new ArrayList<>();
        listeFruits.add("banane");
        listeFruits.set(0,"poire");
        System.out.println(listeFruits.get(0));
        Stack<String> listeAnimaux= new Stack<>();
        listeAnimaux.add("chien");
        listeAnimaux.add("chat");
        listeAnimaux.add("cheval");
        listeAnimaux.add("cochon");
        listeAnimaux.add("serpent");
        System.out.println(listeAnimaux.peek());
        System.out.println(listeAnimaux.pop());
    }
}
