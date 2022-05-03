package practicaMultiverse;

import imonsh.Screen;
import imonsh.Colors;
import imonsh.Dialog;

public class SuperiorSpiderMan extends SpiderManBase implements SpiderManPoderes, SuperiorSpiderManPoderes{
    public SuperiorSpiderMan(String Nombre, String NombreReal, String Alineacion, String Estatus, String Universo, String Base, String Afiliaciones, String Distincion) {
        super(Nombre, NombreReal, Alineacion, Estatus, Universo, Base, Afiliaciones, Distincion);
    }

    @Override
    public void fisiologiaArana(Screen SpiderMan){
        SpiderMan.setVisible(true);
        SpiderMan.out(showMessage(),"Helvetica",28, Colors.BlueHorizon);
        SpiderMan.showImage("Z:\\Josue\\Personal\\Documentos\\Desarrollo\\Launch X\\BackEnd-Mission\\Java\\practicasJava\\src\\practicaMultiverse\\Poderes\\fisiologiaArana.jpg");
        SpiderMan.setBounds(500,0,2000,1500);
    }

    @Override
    public void fuerzaSuperHumana(Screen SpiderMan) {
        SpiderMan.cls();
        SpiderMan.repaint();
        SpiderMan.setVisible(true);
        SpiderMan.out(showMessage(),"Helvetica",28, Colors.BlueHorizon);
        SpiderMan.showImage("Z:\\Josue\\Personal\\Documentos\\Desarrollo\\Launch X\\BackEnd-Mission\\Java\\practicasJava\\src\\practicaMultiverse\\Poderes\\fuerzaSuperHumana.jpg");
        SpiderMan.setBounds(500,0,2000,1500);
    }

    @Override
    public void velocidadSuperHumana(Screen SpiderMan) {
        SpiderMan.cls();
        SpiderMan.repaint();
        SpiderMan.setVisible(true);
        SpiderMan.out(showMessage(),"Helvetica",28, Colors.BlueHorizon);
        SpiderMan.showImage("Z:\\Josue\\Personal\\Documentos\\Desarrollo\\Launch X\\BackEnd-Mission\\Java\\practicasJava\\src\\practicaMultiverse\\Poderes\\velocidadSuperHumana.jpg");
        SpiderMan.setBounds(500,0,2000,1500);
    }

    @Override
    public void energiaSuperHumana(Screen SpiderMan) {
        SpiderMan.cls();
        SpiderMan.repaint();
        SpiderMan.setVisible(true);
        SpiderMan.out(showMessage(),"Helvetica",28, Colors.BlueHorizon);
        SpiderMan.showImage("Z:\\Josue\\Personal\\Documentos\\Desarrollo\\Launch X\\BackEnd-Mission\\Java\\practicasJava\\src\\practicaMultiverse\\Poderes\\energiaSuperHumana.jpg");
        SpiderMan.setBounds(500,0,2000,1500);
    }

    @Override
    public void resistenciaSuperHumana(Screen SpiderMan) {
        SpiderMan.cls();
        SpiderMan.repaint();
        SpiderMan.setVisible(true);
        SpiderMan.out(showMessage(),"Helvetica",28, Colors.BlueHorizon);
        SpiderMan.showImage("Z:\\Josue\\Personal\\Documentos\\Desarrollo\\Launch X\\BackEnd-Mission\\Java\\practicasJava\\src\\practicaMultiverse\\Poderes\\resistenciaSuperHumana.jpg");
        SpiderMan.setBounds(500,0,2000,1500);
    }

    @Override
    public void agilidadSuperHumana(Screen SpiderMan) {
        SpiderMan.cls();
        SpiderMan.repaint();
        SpiderMan.setVisible(true);
        SpiderMan.out(showMessage(),"Helvetica",28, Colors.BlueHorizon);
        SpiderMan.showImage("Z:\\Josue\\Personal\\Documentos\\Desarrollo\\Launch X\\BackEnd-Mission\\Java\\practicasJava\\src\\practicaMultiverse\\Poderes\\agilidadSuperHumana.jpg");
        SpiderMan.setBounds(500,0,2000,1500);
    }

    @Override
    public void factorRegenerativo(Screen SpiderMan) {
        SpiderMan.cls();
        SpiderMan.repaint();
        SpiderMan.setVisible(true);
        SpiderMan.out(showMessage(),"Helvetica",28, Colors.BlueHorizon);
        SpiderMan.showImage("Z:\\Josue\\Personal\\Documentos\\Desarrollo\\Launch X\\BackEnd-Mission\\Java\\practicasJava\\src\\practicaMultiverse\\Poderes\\factorRegenerativo.jpg");
        SpiderMan.setBounds(500,0,2000,1500);
    }

    @Override
    public void resistenciaQuimica(Screen SpiderMan) {
        SpiderMan.cls();
        SpiderMan.repaint();
        SpiderMan.setVisible(true);
        SpiderMan.out(showMessage(),"Helvetica",28, Colors.BlueHorizon);
        SpiderMan.showImage("Z:\\Josue\\Personal\\Documentos\\Desarrollo\\Launch X\\BackEnd-Mission\\Java\\practicasJava\\src\\practicaMultiverse\\Poderes\\resistenciaQuimica.jpg");
        SpiderMan.setBounds(500,0,2000,1500);
    }

    @Override
    public void equilibrioSuperHumano(Screen SpiderMan) {
        SpiderMan.cls();
        SpiderMan.repaint();
        SpiderMan.setVisible(true);
        SpiderMan.out(showMessage(),"Helvetica",28, Colors.BlueHorizon);
        SpiderMan.showImage("Z:\\Josue\\Personal\\Documentos\\Desarrollo\\Launch X\\BackEnd-Mission\\Java\\practicasJava\\src\\practicaMultiverse\\Poderes\\equilibrioSuperHumano.jpg");
        SpiderMan.setBounds(500,0,2000,1500);
    }

    @Override
    public void reflejosSuperHumanos(Screen SpiderMan) {
        SpiderMan.cls();
        SpiderMan.repaint();
        SpiderMan.setVisible(true);
        SpiderMan.out(showMessage(),"Helvetica",28, Colors.BlueHorizon);
        SpiderMan.showImage("Z:\\Josue\\Personal\\Documentos\\Desarrollo\\Launch X\\BackEnd-Mission\\Java\\practicasJava\\src\\practicaMultiverse\\Poderes\\reflejosSuperHumanos.jpg");
        SpiderMan.setBounds(500,0,2000,1500);
    }

    @Override
    public void saltosSuperHumanos(Screen SpiderMan) {
        SpiderMan.cls();
        SpiderMan.repaint();
        SpiderMan.setVisible(true);
        SpiderMan.out(showMessage(),"Helvetica",28, Colors.BlueHorizon);
        SpiderMan.showImage("Z:\\Josue\\Personal\\Documentos\\Desarrollo\\Launch X\\BackEnd-Mission\\Java\\practicasJava\\src\\practicaMultiverse\\Poderes\\saltosSuperHumanos.jpg");
        SpiderMan.setBounds(500,0,2000,1500);
    }

    @Override
    public void sentidoAracnido(Screen SpiderMan) {
        SpiderMan.cls();
        SpiderMan.repaint();
        SpiderMan.setVisible(true);
        SpiderMan.out(showMessage(),"Helvetica",28, Colors.BlueHorizon);
        SpiderMan.showImage("Z:\\Josue\\Personal\\Documentos\\Desarrollo\\Launch X\\BackEnd-Mission\\Java\\practicasJava\\src\\practicaMultiverse\\Poderes\\sentidoAracnido.jpg");
        SpiderMan.setBounds(500,0,2000,1500);
    }

    @Override
    public void deteccionRadioFrecuencia(Screen SuperiorSpiderMan) {
        SuperiorSpiderMan.cls();
        SuperiorSpiderMan.repaint();
        SuperiorSpiderMan.setVisible(true);
        SuperiorSpiderMan.out(showMessage(),"Helvetica",28, Colors.BlueHorizon);
        SuperiorSpiderMan.out("\nPoder unico: Deteccion de radiofreduencias\n","Helvetica",28, Colors.BlueHorizon);
        SuperiorSpiderMan.showImage("Z:\\Josue\\Personal\\Documentos\\Desarrollo\\Launch X\\BackEnd-Mission\\Java\\practicasJava\\src\\practicaMultiverse\\Poderes\\deteccionRadioFrecuencia.jpg");
        SuperiorSpiderMan.setBounds(500,0,2000,1500);
    }

    @Override
    public void tentaculos(Screen SuperiorSpiderMan) {
        SuperiorSpiderMan.cls();
        SuperiorSpiderMan.repaint();
        SuperiorSpiderMan.setVisible(true);
        SuperiorSpiderMan.out(showMessage(),"Helvetica",28, Colors.BlueHorizon);
        SuperiorSpiderMan.out("\nPoder unico: tentaculos\n","Helvetica",28, Colors.BlueHorizon);
        SuperiorSpiderMan.showImage("Z:\\Josue\\Personal\\Documentos\\Desarrollo\\Launch X\\BackEnd-Mission\\Java\\practicasJava\\src\\practicaMultiverse\\Poderes\\tentaculos.jpg");
        SuperiorSpiderMan.setBounds(500,0,2000,1500);
    }

    @Override
    public void concentracionSuperHumana(Screen SuperiorSpiderMan) {
        SuperiorSpiderMan.cls();
        SuperiorSpiderMan.repaint();
        SuperiorSpiderMan.setVisible(true);
        SuperiorSpiderMan.out(showMessage(),"Helvetica",28, Colors.BlueHorizon);
        SuperiorSpiderMan.out("\nPoder unico: Concentracion super humana\n","Helvetica",28, Colors.BlueHorizon);
        SuperiorSpiderMan.showImage("Z:\\Josue\\Personal\\Documentos\\Desarrollo\\Launch X\\BackEnd-Mission\\Java\\practicasJava\\src\\practicaMultiverse\\Poderes\\concentracionSuperHumana.jpg");
        SuperiorSpiderMan.setBounds(500,0,2000,1500);
    }
}