package practicaComic.Pags;

import imonsh.Colors;
import imonsh.Screen;
import imonsh.Dialog;

public class Comic {

    public static void main(String[] args) throws InterruptedException{
        Screen screen = new Screen();
        Dialog d = new Dialog();
        String str;

        paginasComicSiguiente();
        dialogoComicSiguiente();

        while(true) {
            str = d.readString("Página siguiente (s) o página anterior (a)");
            if (str.charAt(0) == 's' || str.charAt(0) == 'S') {
                paginasComicSiguiente();
                dialogoComicSiguiente();
            }

            if (str.charAt(0) == 'a' || str.charAt(0) == 'A') {
                paginasComicAnterior();
                dialogoComicAnterior();
            }
        }
    }


    public static void paginasComicSiguiente() throws InterruptedException {
        Screen paginas = new Screen();
        Pags pags = new Pags();

        Runnable pagscomic = new Runnable() {
            @Override
            public void run(){
                try {
                    pags.escenaSiguiente(paginas);
                    Thread.sleep(5000);
                } catch (InterruptedException ie) {
                    ie.printStackTrace();
                }
            }
        };

        Thread comicXmen = new Thread(pagscomic);
        comicXmen.start();

    }

    private static void paginasComicAnterior() throws InterruptedException {
        Screen paginas2 = new Screen();
        Pags pags2 = new Pags();

        Runnable pagscomic = new Runnable() {
            @Override
            public void run(){
                try {
                    pags2.escenaAnterior(paginas2);
                    Thread.sleep(5000);
                } catch (InterruptedException ie) {
                    ie.printStackTrace();
                }
            }
        };

        Thread comicXmen = new Thread(pagscomic);
        comicXmen.start();

    }

    public static void dialogoComicSiguiente() throws InterruptedException {
        Screen dialogo = new Screen();
        Dialogos dialogos = new Dialogos();

        Runnable dialogoscomic = new Runnable() {
            @Override
            public void run(){
                try {
                    dialogos.dialogoSiguiente(dialogo);
                    Thread.sleep(5000);
                } catch (InterruptedException ie) {
                    ie.printStackTrace();
                }
            }
        };

        Thread dialogosComicXmen = new Thread(dialogoscomic);
        dialogosComicXmen.start();

    }

    private static void dialogoComicAnterior() throws InterruptedException {
        Screen dialogo2 = new Screen();
        Dialogos dialogos2 = new Dialogos();

        Runnable dialogoscomic2 = new Runnable() {
            @Override
            public void run(){
                try {
                    dialogos2.dialogoAnterior(dialogo2);
                    Thread.sleep(5000);
                } catch (InterruptedException ie) {
                    ie.printStackTrace();
                }
            }
        };

        Thread dialogosComicXmen2 = new Thread(dialogoscomic2);
        dialogosComicXmen2.start();

    }
}
