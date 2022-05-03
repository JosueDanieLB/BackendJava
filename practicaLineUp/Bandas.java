package practicaLineUp;

import imonsh.Screen;
import imonsh.Colors;

public class Bandas extends General{
    public Bandas(String nombreGeneral, String contenidoGeneral) {
        super(nombreGeneral, contenidoGeneral);
    }

    public void flyerGeneral(Screen Concierto){
        Concierto.setVisible(true);
        Concierto.showImage("Z:\\Josue\\Personal\\Documentos\\Desarrollo\\Launch X\\BackEnd-Mission\\Java\\practicasJava\\src\\practicaLineUp\\Flyers\\General.jpg");
        Concierto.setBounds(100,0,713,1080);
    }
}
