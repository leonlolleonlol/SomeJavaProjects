package com.company;
import java.io.*;
public class Prjecritures
{
    public static void main(String[] args) throws Exception
    {
        PrintWriter ecrire=new PrintWriter(new FileOutputStream("Notes.csv",true));
        ecrire.println("7891456;James;Bond;90;70;50;100;45");
        ecrire.close();
    }
}
