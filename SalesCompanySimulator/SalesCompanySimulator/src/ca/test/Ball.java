package ca.test;

import java.util.Locale;
import java.util.Random;


public class Ball{

    private final int diameter;
    private String name;
    private final PossibleColors color;
    private final double price;
    private final int id;
    private String[] info;

    public Ball(int id) {
        this.id=id;
        Random random=new Random();
        this.name="";
        for(int i=0;i<random.nextInt(3,6);i++) {
            this.name += (char) (random.nextInt(97, 122));
        }
        this.name+="ball";
        PossibleColors[] colors=PossibleColors.values();
        int colorNumber=Math.abs(random.nextInt()%10);
        this.color = colors[colorNumber];
        this.diameter=random.nextInt(1,10);
        this.price = Math.round(1.15*(colorNumber*diameter+1)*100.00)/100.00;
        try {
            this.info = new String[]{String.valueOf(diameter), name, String.valueOf(color).toLowerCase(Locale.ROOT), String.valueOf(price), String.valueOf(id)};
        }
        catch (NumberFormatException e)
        {
            System.out.println("Error of conversion into String");
        }
    }

    public double getPrice() {
        return price;
    }
    public String[] getInfo() {
        return info;
    }


    @Override
    public String toString() {
        return name+": "+
                "diameter=" + diameter +" cm"+
                ", color=" + color +
                ", price=" + price +" $, id="+id;
    }
}
