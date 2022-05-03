package practicaLineUp;

import imonsh.Screen;
import imonsh.Colors;

public class cancionesAutenticos extends General{
    public cancionesAutenticos(String nombreGeneral, String contenidoGeneral) {
        super(nombreGeneral, contenidoGeneral);
    }
    public void musicaAutenticos(Screen Concierto){
        Concierto.cls();
        Concierto.repaint();
        Concierto.setVisible(true);
        Concierto.out(showMensajeGeneral(),"Helvetica",28, Colors.BlueHorizon);
        Concierto.setBounds(1500,0,800,800);
    }
}
