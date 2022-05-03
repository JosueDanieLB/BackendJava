package practicaLineUp;

import imonsh.Colors;
import imonsh.Screen;

public class cancionesSiddharta extends General{
    public cancionesSiddharta(String nombreGeneral, String contenidoGeneral) {
        super(nombreGeneral, contenidoGeneral);
    }
    public void musicaSiddharta(Screen Concierto){
        Concierto.cls();
        Concierto.repaint();
        Concierto.setVisible(true);
        Concierto.out(showMensajeGeneral(),"Helvetica",28, Colors.BlueHorizon);
        Concierto.setBounds(1500,0,800,800);
    }
}
