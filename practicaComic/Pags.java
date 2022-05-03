package practicaComic.Pags;

import imonsh.Colors;
import imonsh.Screen;

public class Pags {

    private static int pag = 0;

    public Pags(){}

    public void escenaSiguiente(Screen Paginas) {

        pag=pag+1;

        Paginas.cls();
        Paginas.repaint();
        Paginas.setVisible(true);
        Paginas.showImage("Z:\\Josue\\Personal\\Documentos\\Desarrollo\\Launch X\\BackEnd-Mission\\Java\\practicasJava\\src\\practicaComic\\Pags\\comic"+pag+".jpg");
        Paginas.setBounds(0, 0, 2000, 1500);
    }

    public void escenaAnterior(Screen Paginas) {

        pag=pag-1;

        Paginas.cls();
        Paginas.repaint();
        Paginas.setVisible(true);
        Paginas.showImage("Z:\\Josue\\Personal\\Documentos\\Desarrollo\\Launch X\\BackEnd-Mission\\Java\\practicasJava\\src\\practicaComic\\Pags\\comic"+pag+".jpg");
        Paginas.setBounds(0, 0, 2000, 1500);
    }
}

