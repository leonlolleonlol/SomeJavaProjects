package ca.qc.bdeb.sim202;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Main {

    public static void main(String[] args) {
        try (RandomAccessFile file = new RandomAccessFile("mystere.bin", "r")) {
            file.seek(0);
            int premierNombre;
            int deuxiemeNombre = 0;
            long position=0;
            boolean onetime = true;
            while (deuxiemeNombre != 0 || onetime) {
                position=(long)(deuxiemeNombre-1) *2*Integer.BYTES;
                if(onetime)
                    position=0;
                file.seek(position);
                premierNombre = file.readInt();
                System.out.println(premierNombre);
                position+=Integer.BYTES;
                file.seek(position);
                deuxiemeNombre = file.readInt();
                System.out.println(deuxiemeNombre);
                onetime = false;
            }
        } catch (FileNotFoundException e) {
            System.out.println("Fichier non trouve");
        } catch (IOException e) {
            System.out.println("Erreur input output");
        }
    }
}
