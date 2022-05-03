package practicaLineUp;

import imonsh.Screen;
import imonsh.Colors;

public class General {

    private String nombreGeneral, contenidoGeneral;

    public General (String nombreGeneral, String contenidoGeneral){
        this.nombreGeneral = nombreGeneral;
        this.contenidoGeneral = contenidoGeneral;
    }

    public String getNombreGeneral(){ return nombreGeneral; }
    public String getContenidoGeneral(){ return contenidoGeneral; }

    public boolean setNombreGeneral(String nombreGeneral){
        if(!nombreGeneral.isEmpty()){
            this.nombreGeneral = nombreGeneral;
            return true;
        } else
            return false;
    }

    public boolean setContenidoGeneral(String contenidoGeneral){
        if(!contenidoGeneral.isEmpty()){
            this.contenidoGeneral = contenidoGeneral;
            return true;
        } else
            return false;
    }

    public String showMensajeGeneral(){
        return
                " Nombre: "+nombreGeneral+"\n"+
                        " Contenido: "+contenidoGeneral+"\n";
    }

}
