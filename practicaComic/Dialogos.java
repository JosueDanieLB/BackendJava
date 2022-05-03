package practicaComic.Pags;

import imonsh.Colors;
import imonsh.Dialog;
import imonsh.Screen;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class Dialogos {

    private static int pag = 0;

    String palabras = "";

    public Dialogos() {}

    public void dialogoSiguiente(Screen Dialogos) throws InterruptedException{
        pag=pag+1;

        try {
            FileReader archivo = new FileReader("Z:\\Josue\\Personal\\Documentos\\Desarrollo\\Launch X\\BackEnd-Mission\\Java\\practicasJava\\src\\practicaComic\\Dialogos\\dialogo" + pag + ".txt");
            int i = 0;

            while (i!=-1) {
                i= archivo.read();
                char letra=(char)i;
                palabras=palabras + letra;
            }
            archivo.close();
            Dialogos.cls();
            Dialogos.repaint();
            Dialogos.setVisible(true);
            Dialogos.out(palabras, "Helvetica", 28, Colors.BlueHorizon);
            Dialogos.setBounds(2000, 0, 500, 500);

        }catch (IOException ioe){
            ioe.printStackTrace();
        }
    }

    public void dialogoAnterior(Screen Dialogos) throws InterruptedException{
        pag=pag-1;

        try{
            FileInputStream fis = new FileInputStream("Z:\\Josue\\Personal\\Documentos\\Desarrollo\\Launch X\\BackEnd-Mission\\Java\\practicasJava\\src\\practicaComic\\Dialogos\\dialogo"+pag+".txt");
            int i = fis.read();
            System.out.println((char)i);
            char palabras = (char)i;
            fis.close();

            Dialogos.cls();
            Dialogos.repaint();
            Dialogos.setVisible(true);
            Dialogos.out(palabras+"\n\n", "Helvetica", 28, Colors.BlueHorizon);
            Dialogos.setBounds(2000, 0, 500, 500);

        }catch (IOException ioe){
            ioe.printStackTrace();
        }
    }
}
