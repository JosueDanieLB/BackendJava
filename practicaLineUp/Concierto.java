package practicaLineUp;

import imonsh.Screen;
import imonsh.Dialog;
import imonsh.Colors;


public class Concierto {

    public static void main(String[] args) throws InterruptedException {

        Screen screen = new Screen();
        Dialog d = new Dialog();
        String str;

        infoGeneral();
        listaGeneral();
        while(true) {
            str = d.readString("¿Por cual banda quieres empezar el LineUp? Zoé(Z/z)-Los Auténticos Decandetes(A/a)-Cartel de Santa(C/c)-Mon Laferte(M/m)-Porter(P/p)-Siddharta(S/s)-Reyno(R/r)");
            if (str.charAt(0) == 'z' || str.charAt(0) == 'Z') {
                infoZoe();
                cancionesZoe();
                Thread.sleep(10000);
                infoAutenticos();
                cancionesAutenticos();
                Thread.sleep(10000);
                infoSanta();
                cancionesSanta();
                Thread.sleep(10000);
                infoMon();
                cancionesMon();
                Thread.sleep(10000);
                infoPorter();
                cancionesPorter();
                Thread.sleep(10000);
                infoSiddharta();
                cancionesSiddharta();
                Thread.sleep(10000);
                infoReyno();
                cancionesReyno();
                Thread.sleep(10000);
                infoGeneral();
                listaGeneral();
            }

            if (str.charAt(0) == 'a' || str.charAt(0) == 'A') {
                infoAutenticos();
                cancionesAutenticos();
                Thread.sleep(10000);
                infoSanta();
                cancionesSanta();
                Thread.sleep(10000);
                infoMon();
                cancionesMon();
                Thread.sleep(10000);
                infoPorter();
                cancionesPorter();
                Thread.sleep(10000);
                infoSiddharta();
                cancionesSiddharta();
                Thread.sleep(10000);
                infoReyno();
                cancionesReyno();
                Thread.sleep(10000);
                infoZoe();
                cancionesZoe();
                infoGeneral();
                listaGeneral();
            }

            if (str.charAt(0) == 'c' || str.charAt(0) == 'C') {
                infoSanta();
                cancionesSanta();
                Thread.sleep(10000);
                infoMon();
                cancionesMon();
                Thread.sleep(10000);
                infoPorter();
                cancionesPorter();
                Thread.sleep(10000);
                infoSiddharta();
                cancionesSiddharta();
                Thread.sleep(10000);
                infoReyno();
                cancionesReyno();
                Thread.sleep(10000);
                infoZoe();
                cancionesZoe();
                Thread.sleep(10000);
                infoAutenticos();
                cancionesAutenticos();
                Thread.sleep(10000);
                infoGeneral();
                listaGeneral();
            }

            if (str.charAt(0) == 'm' || str.charAt(0) == 'M') {
                infoMon();
                cancionesMon();
                Thread.sleep(10000);
                infoPorter();
                cancionesPorter();
                Thread.sleep(10000);
                infoSiddharta();
                cancionesSiddharta();
                Thread.sleep(10000);
                infoReyno();
                cancionesReyno();
                Thread.sleep(10000);
                infoZoe();
                cancionesZoe();
                Thread.sleep(10000);
                infoAutenticos();
                cancionesAutenticos();
                Thread.sleep(10000);
                infoSanta();
                cancionesSanta();
                Thread.sleep(10000);
                infoGeneral();
                listaGeneral();
            }

            if (str.charAt(0) == 'p' || str.charAt(0) == 'P') {
                infoPorter();
                cancionesPorter();
                Thread.sleep(10000);
                infoSiddharta();
                cancionesSiddharta();
                Thread.sleep(10000);
                infoReyno();
                cancionesReyno();
                Thread.sleep(10000);
                infoZoe();
                cancionesZoe();
                Thread.sleep(10000);
                infoAutenticos();
                cancionesAutenticos();
                Thread.sleep(10000);
                infoSanta();
                cancionesSanta();
                Thread.sleep(10000);
                infoMon();
                cancionesMon();
                Thread.sleep(10000);
                infoGeneral();
                listaGeneral();
            }

            if (str.charAt(0) == 's' || str.charAt(0) == 'S') {
                infoSiddharta();
                cancionesSiddharta();
                Thread.sleep(10000);
                infoReyno();
                cancionesReyno();
                Thread.sleep(10000);
                infoZoe();
                cancionesZoe();
                Thread.sleep(10000);
                infoAutenticos();
                cancionesAutenticos();
                Thread.sleep(10000);
                infoSanta();
                cancionesSanta();
                Thread.sleep(10000);
                infoMon();
                cancionesMon();
                Thread.sleep(10000);
                infoPorter();
                cancionesPorter();
                Thread.sleep(10000);
                infoGeneral();
                listaGeneral();
            }

            if (str.charAt(0) == 'r' || str.charAt(0) == 'R') {
                infoReyno();
                cancionesReyno();
                Thread.sleep(10000);
                infoZoe();
                cancionesZoe();
                Thread.sleep(10000);
                infoAutenticos();
                cancionesAutenticos();
                Thread.sleep(10000);
                infoSanta();
                cancionesSanta();
                Thread.sleep(10000);
                infoMon();
                cancionesMon();
                Thread.sleep(10000);
                infoPorter();
                cancionesPorter();
                Thread.sleep(10000);
                infoSiddharta();
                cancionesSiddharta();
                Thread.sleep(10000);
                infoGeneral();
                listaGeneral();
            }
        }
    }


    private static void infoGeneral() throws InterruptedException {
        Screen gen = new Screen();
        Bandas bandas = new Bandas("Tecate Sonoro","Bandas que participan:\nZoé\nLos Auténticos Decadentes\nCartel de Santa\nMon Laferte\nPorter\nSiddharta\nReyno");

        Runnable infoGen = new Runnable() {
            @Override
            public void run() {
                try{
                    bandas.flyerGeneral(gen);
                    Thread.sleep(5000);
                }catch (InterruptedException ie){
                    ie.printStackTrace();
                }
            }
        };
        Thread informacionGeneral = new Thread(infoGen);
        informacionGeneral.start();

    }

    private static void listaGeneral() throws InterruptedException {
        Screen gen2 = new Screen();
        listaBandas listabandas = new listaBandas("Tecate Sonoro","Bandas que participan:\nZoé\nLos Auténticos Decadentes\nCartel de Santa\nMon Laferte\nPorter\nSiddharta\nReyno");

        Runnable infoGen2 = new Runnable() {
            @Override
            public void run() {
                try{
                    listabandas.nombresBandas(gen2);
                    Thread.sleep(5000);
                }catch (InterruptedException ie){
                    ie.printStackTrace();
                }
            }
        };
        Thread listaGeneral = new Thread(infoGen2);
        listaGeneral.start();
    }

    private static void infoAutenticos() throws InterruptedException {
        Screen aut = new Screen();
        Autenticos autenticos = new Autenticos("Los Auténticos Decadentes","Y la banda sigue:\nY la banda sigue\nEnciendan los parlantes\nEl corso de Ayacucho\nTanta soledad\nPrefiero\nLibro de papel\nLos pibes se portan bien\nVayan a estudiar\nSin pedir nada\nLos tres payasos\nEse día\nLa noche es bella");

        Runnable infoAut = new Runnable() {
            @Override
            public void run() {
                try{
                    autenticos.flyerAutenticos(aut);
                    Thread.sleep(5000);
                }catch (InterruptedException ie){
                    ie.printStackTrace();
                }
            }
        };
        Thread informacionAutenticos = new Thread(infoAut);
        informacionAutenticos.start();
    }

    private static void cancionesAutenticos() throws InterruptedException {
        Screen aut2 = new Screen();
        cancionesAutenticos cancionesAutenticos = new cancionesAutenticos("Los Auténticos Decadentes","Y la banda sigue:\nY la banda sigue\nEnciendan los parlantes\nEl corso de Ayacucho\nTanta soledad\nPrefiero\nLibro de papel\nLos pibes se portan bien\nVayan a estudiar\nSin pedir nada\nLos tres payasos\nEse día\nLa noche es bella");

        Runnable infoAut2 = new Runnable() {
            @Override
            public void run() {
                try{
                    cancionesAutenticos.musicaAutenticos(aut2);
                    Thread.sleep(5000);
                }catch (InterruptedException ie){
                    ie.printStackTrace();
                }
            }
        };
        Thread musicaAutenticos = new Thread(infoAut2);
        musicaAutenticos.start();
    }

    private static void infoMon() throws InterruptedException {
        Screen monla = new Screen();
        Mon mon = new Mon("Mon Laferte","La Trenza:\nPa dónde se fue\nQue sí\nMi buen amor\nAna\nAmárrame\nYo te qui\nPrimavera!\nNo te fumes mi mariguana\nSCielito de Abril\nFlaco\nLa Trenza\nAlelí");

        Runnable infoMonla = new Runnable() {
            @Override
            public void run() {
                try{
                    mon.flyerMon(monla);
                    Thread.sleep(5000);
                }catch (InterruptedException ie){
                    ie.printStackTrace();
                }
            }
        };
        Thread informacionMon = new Thread(infoMonla);
        informacionMon.start();
    }

    private static void cancionesMon() throws InterruptedException {
        Screen monla2 = new Screen();
        cancionesMon cancionesmon = new cancionesMon("Mon Laferte","La Trenza:\nPa dónde se fue\nQue sí\nMi buen amor\nAna\nAmárrame\nYo te qui\nPrimavera!\nNo te fumes mi mariguana\nSCielito de Abril\nFlaco\nLa Trenza\nAlelí");

        Runnable infoMonla2 = new Runnable() {
            @Override
            public void run() {
                try{
                    cancionesmon.musicaMon(monla2);
                    Thread.sleep(5000);
                }catch (InterruptedException ie){
                    ie.printStackTrace();
                }
            }
        };
        Thread musicaMon = new Thread(infoMonla2);
        musicaMon.start();
    }

    private static void infoPorter() throws InterruptedException {
        Screen por = new Screen();
        Porter porter = new Porter("Porter","Moctezuma:\nMurciélago\nMi bosque\nHuitzil\nLa China\nRincón Yucateco\nHuracancún\nTzunami\nPalapa");

        Runnable infoPor = new Runnable() {
            @Override
            public void run() {
                try{
                    porter.flyerPorter(por);
                    Thread.sleep(5000);
                }catch (InterruptedException ie){
                    ie.printStackTrace();
                }
            }
        };
        Thread informacionPorter = new Thread(infoPor);
        informacionPorter.start();
    }

    private static void cancionesPorter() throws InterruptedException {
        Screen por2 = new Screen();
        cancionesPorter cancionesporter = new cancionesPorter("Porter","Moctezuma:\nMurciélago\nMi bosque\nHuitzil\nLa China\nRincón Yucateco\nHuracancún\nTzunami\nPalapa");

        Runnable infoPor2 = new Runnable() {
            @Override
            public void run() {
                try{
                    cancionesporter.musicaPorter(por2);
                    Thread.sleep(5000);
                }catch (InterruptedException ie){
                    ie.printStackTrace();
                }
            }
        };
        Thread musicaPorter = new Thread(infoPor2);
        musicaPorter.start();
    }

    private static void infoReyno() throws InterruptedException {
        Screen rey = new Screen();
        Reyno reyno = new Reyno("Reyno","Viaje por lo eterno:\nFugitivo\nNunca me dejes\nDos mundos\nAmarrado\nPurifícame\nAhrimán\nViaje por lo eterno\nAy de ti\nMe voy\nParte del Sol");

        Runnable infoRey = new Runnable() {
            @Override
            public void run() {
                try{
                    reyno.flyerReyno(rey);
                    Thread.sleep(5000);
                }catch (InterruptedException ie){
                    ie.printStackTrace();
                }
            }
        };
        Thread informacionReyno = new Thread(infoRey);
        informacionReyno.start();
    }

    private static void cancionesReyno() throws InterruptedException {
        Screen rey2 = new Screen();
        cancionesReyno cancionesreyno = new cancionesReyno("Reyno","Viaje por lo eterno:\nFugitivo\nNunca me dejes\nDos mundos\nAmarrado\nPurifícame\nAhrimán\nViaje por lo eterno\nAy de ti\nMe voy\nParte del Sol");

        Runnable infoRey2 = new Runnable() {
            @Override
            public void run() {
                try{
                    cancionesreyno.musicaReyno(rey2);
                    Thread.sleep(5000);
                }catch (InterruptedException ie){
                    ie.printStackTrace();
                }
            }
        };
        Thread musicaReyno = new Thread(infoRey2);
        musicaReyno.start();
    }

    private static void infoSanta() throws InterruptedException {
        Screen san = new Screen();
        Santa santa = new Santa("Cartel de Santa","Golpe avisa:\nAndamos zumbando\nSi te vienen a contar\nSuena mamalona\nEs de ley\nBullyar\nLos mensajes del WhatsApp\nDoctor marihuana\nMe alegro de su odio\nWacha, están mamando riata\nA ti te da besitos\nPara cada loco\nLo que quiero es besarte");

        Runnable infoSan = new Runnable() {
            @Override
            public void run() {
                try{
                    santa.flyerSanta(san);
                    Thread.sleep(5000);
                }catch (InterruptedException ie){
                    ie.printStackTrace();
                }
            }
        };
        Thread informacionSanta = new Thread(infoSan);
        informacionSanta.start();
    }

    private static void cancionesSanta() throws InterruptedException {
        Screen san2 = new Screen();
        cancionesSanta cancionessanta = new cancionesSanta("Cartel de Santa","Golpe avisa:\nAndamos zumbando\nSi te vienen a contar\nSuena mamalona\nEs de ley\nBullyar\nLos mensajes del WhatsApp\nDoctor marihuana\nMe alegro de su odio\nWacha, están mamando riata\nA ti te da besitos\nPara cada loco\nLo que quiero es besarte");

        Runnable infoSan2 = new Runnable() {
            @Override
            public void run() {
                try{
                    cancionessanta.musicaSanta(san2);
                    Thread.sleep(5000);
                }catch (InterruptedException ie){
                    ie.printStackTrace();
                }
            }
        };
        Thread musicaSanta = new Thread(infoSan2);
        musicaSanta.start();
    }

    private static void infoSiddharta() throws InterruptedException {
        Screen sid = new Screen();
        Siddharta siddharta = new Siddharta("Siddharta","Únicos:\nSer parte\nTarde\nCamuflaje\nCámara\nUna noche tranquila\nTus pupilas\nA la distancia\nÚnicos\nImán\nEl chico");

        Runnable infoSid = new Runnable() {
            @Override
            public void run() {
                try{
                    siddharta.flyerSiddharta(sid);
                    Thread.sleep(5000);
                }catch (InterruptedException ie){
                    ie.printStackTrace();
                }
            }
        };
        Thread informacionSiddharta = new Thread(infoSid);
        informacionSiddharta.start();
    }

    private static void cancionesSiddharta() throws InterruptedException {
        Screen sid2 = new Screen();
        cancionesSiddharta cancionessiddharta = new cancionesSiddharta("Siddharta","Únicos:\nSer parte\nTarde\nCamuflaje\nCámara\nUna noche tranquila\nTus pupilas\nA la distancia\nÚnicos\nImán\nEl chico");

        Runnable infoSid2 = new Runnable() {
            @Override
            public void run() {
                try{
                    cancionessiddharta.musicaSiddharta(sid2);
                    Thread.sleep(5000);
                }catch (InterruptedException ie){
                    ie.printStackTrace();
                }
            }
        };
        Thread musicaSiddharta = new Thread(infoSid2);
        musicaSiddharta.start();
    }

    private static void infoZoe() throws InterruptedException {
        Screen zo = new Screen();
        Zoe zoe = new Zoe("Zoé","Prográmaton:\n10AM\nCámara lenta\nDos mil trece\nFin de semana\nArrullo de estrellas\nCiudades invisibles\nPanoramas\nGame over Shanghai\nAndrómeda\nSedantes\nAltamar");

        Runnable infoZoe = new Runnable() {
            @Override
            public void run() {
                try{
                    zoe.flyerZoe(zo);
                    Thread.sleep(5000);
                }catch (InterruptedException ie){
                    ie.printStackTrace();
                }
            }
        };
        Thread informacionZoe = new Thread(infoZoe);
        informacionZoe.start();
    }

    private static void cancionesZoe() throws InterruptedException {
        Screen zo2 = new Screen();
        cancionesZoe cancioneszoe = new cancionesZoe("Zoé","Prográmaton:\n10AM\nCámara lenta\nDos mil trece\nFin de semana\nArrullo de estrellas\nCiudades invisibles\nPanoramas\nGame over Shanghai\nAndrómeda\nSedantes\nAltamar");

        Runnable infoZoe2 = new Runnable() {
            @Override
            public void run() {
                try{
                    cancioneszoe.musicaZoe(zo2);
                    Thread.sleep(5000);
                }catch (InterruptedException ie){
                    ie.printStackTrace();
                }
            }
        };
        Thread cancionesZoe = new Thread(infoZoe2);
        cancionesZoe.start();
    }
}


