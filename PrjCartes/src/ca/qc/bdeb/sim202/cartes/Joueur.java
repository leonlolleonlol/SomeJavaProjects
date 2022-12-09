package ca.qc.bdeb.sim202.cartes;

import java.util.ArrayList;

public class Joueur
{
    private ArrayList<Cartes> cartesEnMain = new ArrayList<Cartes>();
    private Position position;

    public Joueur(Position position) {
        this.position = position;
    }
    public void updateList (Cartes carte)
    {
        cartesEnMain.add(carte);
    }

    @Override
    public String toString() {
        String string= "position : " + position+"\n";
        for(Cartes cartes:cartesEnMain)
        {
            string+="couleur : "+cartes.getCouleur()+" numero : "+cartes.getLettre()+"\n";
        }
        return string;
    }
}
