package ca.qc.bdeb.sim202.prjrecursion;

public class Main {

    public static void main(String[] args) {
        System.out.println(factorielle_recursive(7));
        boom(5);
        System.out.println(binaire(13200));
        //System.out.println(pair(2000));
        System.out.println(fib(10));
        System.out.println(expressionFonctionnelle(10));
    }

    private static long factorielle_recursive(long valeur) {
        if (valeur <= 1)
            return 1;
        return factorielle_recursive(valeur - 1) * valeur;
    }

    public static void boom(int nombre) {
        if (nombre == 0)
            System.out.println("BOOM!");
        else {
            System.out.println(nombre);
            boom(nombre - 1);
            System.out.println(nombre);
        }
    }

    public static String binaire(int nombre) {
        if (nombre == 0)
            return "";
        else
                return binaire(nombre/2)+nombre%2;
    }

    public static Boolean pair(int nombreAVerifier)
    {
        if(nombreAVerifier<=0)
        {
            return false;
        }
        else {
            System.out.println(nombreAVerifier%2==0);
            return pair(nombreAVerifier - 2);
        }
    }

    public static int fib(int n)
    {
        if (n == 0)
            return 0;
        else if (n == 1)
            return 1;
        else
            return fib(n - 1) + fib(n - 2);
    }
    public static int expressionFonctionnelle(int num)
    {
        return (int)((Math.pow((1+Math.sqrt(5))/2,num)-Math.pow((1-Math.sqrt(5))/2,num))/Math.sqrt(5));
    }
}
