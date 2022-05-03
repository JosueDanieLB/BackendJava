package practicaMultiverse;

import imonsh.Screen;
import imonsh.Dialog;
import imonsh.Colors;

import java.io.IOException;

public class SpiderVerse {

    public static void main(String[] args) throws InterruptedException{

        Screen screen = new Screen();
        Dialog d = new Dialog();
        String str;

        str = d.readString("¿Qué poderes de SpiderMan quieres ver? Normal(n/N)/Scarlet(s/S)/Superior(p/P)/2099(d/D)");
        if(str.charAt(0) == 'n' || str.charAt(0) == 'N'){
            infoSpiderMan();
            screen.out("Estos son los poderes base de SpiderMan");
        }

        if(str.charAt(0) == 's' || str.charAt(0) == 'S'){
            infoScarletSpider();
            screen.out("Estos son los poderes únicos de Scarlet Spider");
        }

        if(str.charAt(0) == 'p' || str.charAt(0) == 'P'){
            infoSuperiorSpiderman();
            screen.out("Estos son los poderes únicos de Superior Spider-Man");
        }

        if(str.charAt(0) == 'd' || str.charAt(0) == 'D'){
            infoSpiderMan2099();
            screen.out("Estos son los poderes únicos de  Spider-Man 2099");
        }

        else
            screen.out("Tal vez en otro momento, Adios","Century Schoolbook L",28, Colors.BalticSea);

    }


    private static void infoSpiderMan() throws InterruptedException{
        Screen spider = new Screen();
        SpiderMan spiderman = new SpiderMan("Spider-Man",
                "Peter Benjamin Parker",
                "Bueno",
                "Vivo",
                "Tierra-616",
                "New York City",
                "Spider-Army, Warriors of the Great Web, Avengers",
                "Poderes aracnidos");

        Runnable poderSpider =new Runnable() {
            @Override
            public void run() {
                try{
                    spiderman.fisiologiaArana(spider);
                    Thread.sleep(3000);

                    spiderman.fuerzaSuperHumana(spider);
                    Thread.sleep(3000);

                    spiderman.velocidadSuperHumana(spider);
                    Thread.sleep(3000);

                    spiderman.energiaSuperHumana(spider);
                    Thread.sleep(3000);

                    spiderman.resistenciaSuperHumana(spider);
                    Thread.sleep(3000);

                    spiderman.agilidadSuperHumana(spider);
                    Thread.sleep(3000);

                    spiderman.factorRegenerativo(spider);
                    Thread.sleep(3000);

                    spiderman.resistenciaQuimica(spider);
                    Thread.sleep(3000);

                    spiderman.equilibrioSuperHumano(spider);
                    Thread.sleep(3000);

                    spiderman.reflejosSuperHumanos(spider);
                    Thread.sleep(3000);

                    spiderman.saltosSuperHumanos(spider);
                    Thread.sleep(3000);

                    spiderman.sentidoAracnido(spider);
                    Thread.sleep(3000);

                }catch (InterruptedException ie){
                    ie.printStackTrace();
                }
            }
        };

        Thread poderSpiderMan = new Thread(poderSpider);
        poderSpiderMan.start();
    }

    private static void infoScarletSpider() throws InterruptedException{
        Screen scarlet = new Screen();
        ScarletSpider scarletspider = new ScarletSpider("Scartlet Spider",
                "Benjamin Reilly",
                "Neutral",
                "Vivo",
                "Tierra-616",
                "Jackal's Laboratory",
                "New Warriors, Seward Trainer, Jackal",
                "Clon de Peter Parker");

        Runnable poderScarlet =new Runnable() {
            @Override
            public void run() {
                try{
                    scarletspider.capacidadCamuflaje(scarlet);
                    Thread.sleep(3000);

                    scarletspider.generarExtremidades(scarlet);
                    Thread.sleep(3000);

                }catch (InterruptedException ie){
                    ie.printStackTrace();
                }
            }
        };

        Thread poderSpiderScarlet = new Thread(poderScarlet);
        poderSpiderScarlet.start();
    }

    private static void infoSuperiorSpiderman() throws InterruptedException{
        Screen superior = new Screen();
        SuperiorSpiderMan superiorspiderman = new SuperiorSpiderMan("Superior Spider-Man",
                "Otto Gunther Octavius",
                "Neutral",
                "Vivo",
                "Tierra-616",
                "Spider-Island Two",
                "Ninguna",
                "Miopia");

        Runnable poderSuperior =new Runnable() {
            @Override
            public void run() {
                try{
                    superiorspiderman.deteccionRadioFrecuencia(superior);
                    Thread.sleep(3000);

                    superiorspiderman.tentaculos(superior);
                    Thread.sleep(3000);

                    superiorspiderman.concentracionSuperHumana(superior);
                    Thread.sleep(3000);

                }catch (InterruptedException ie){
                    ie.printStackTrace();
                }
            }
        };

        Thread poderSuperiorSpiderman = new Thread(poderSuperior);
        poderSuperiorSpiderman.start();
    }

    private static void infoSpiderMan2099() throws InterruptedException{
        Screen miguel = new Screen();
        SpiderMan2099 spiderman2099 = new SpiderMan2099("Spiderman 2099",
                "Miguel O'Hara",
                "Bueno",
                "Vivo",
                "Tierra-928",
                "Babylon Towers",
                "Lyla",
                "Cuchillas");

        Runnable poder2099 =new Runnable() {
            @Override
            public void run() {
                try{
                    spiderman2099.visionAcelerada(miguel);
                    Thread.sleep(3000);

                    spiderman2099.colmillos(miguel);
                    Thread.sleep(3000);

                    spiderman2099.cuchilla(miguel);
                    Thread.sleep(3000);

                    spiderman2099.spinnnerets(miguel);
                    Thread.sleep(3000);

                    spiderman2099.senuelo(miguel);
                    Thread.sleep(3000);

                }catch (InterruptedException ie){
                    ie.printStackTrace();
                }
            }
        };

        Thread poderSpiderMan2099 = new Thread(poder2099);
        poderSpiderMan2099.start();
    }

}


