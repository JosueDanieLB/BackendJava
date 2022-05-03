package practicaLineUp;

import imonsh.Screen;
import imonsh.Colors;

import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Autenticos extends General {
    public Autenticos(String nombreGeneral, String contenidoGeneral) {
        super(nombreGeneral, contenidoGeneral);
    }

    public void flyerAutenticos(Screen Concierto){
        Concierto.cls();
        Concierto.repaint();
        Concierto.setVisible(true);
        Concierto.showImage("Z:\\Josue\\Personal\\Documentos\\Desarrollo\\Launch X\\BackEnd-Mission\\Java\\practicasJava\\src\\practicaLineUp\\Flyers\\Autenticos.jpg");
        Concierto.setBounds(100,0,774,1080);

        try {
            FileInputStream fileInputStream = new FileInputStream("Z:\\Josue\\Personal\\Documentos\\Desarrollo\\Launch X\\BackEnd-Mission\\Java\\practicasJava\\src\\practicaLineUp\\Canciones\\Autenticos.mp3");
            Player player = new Player(fileInputStream);
            player.play(390);
            player.close();
            fileInputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (JavaLayerException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
