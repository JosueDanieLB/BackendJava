package practicaLineUp;

import imonsh.Colors;
import imonsh.Screen;

public class cancionesSanta extends General{
    public cancionesSanta(String nombreGeneral, String contenidoGeneral) {
        super(nombreGeneral, contenidoGeneral);
    }
    public void musicaSanta(Screen Concierto){
        Concierto.cls();
        Concierto.repaint();
        Concierto.setVisible(true);
        Concierto.out(showMensajeGeneral(),"Helvetica",28, Colors.BlueHorizon);
        Concierto.setBounds(1500,0,800,800);
    }
}
