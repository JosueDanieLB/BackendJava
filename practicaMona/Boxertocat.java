package practicaMona;

public class Boxertocat extends OctocatOriginal {

    public Boxertocat(){}

    String Pose, Estado;

    Boxertocat(String Nombre, String Profesion, String Vestimenta, String Designer, int Numero, String Pose, String Estado){
        this.Nombre = Nombre;
        this.Profesion = Profesion;
        this.Vestimenta = Vestimenta;
        this.Designer = Designer;
        this.Numero = Numero;
        this.Pose = Pose;
        this.Estado = Estado;
    }

    public static void Boxertocatshow(){
        Boxertocat Hijo6 = new Boxertocat("Boxertocat","Boxeador","Guantes de box y banda en la cabeza","Ruby Jazz",139,"En guardia","Luchando");
        System.out.println("Boxertocat tiene las siguientes caracteristicas: ");
        System.out.println("Nombre: "+Hijo6.Nombre+"\n"+"Profesion: "+Hijo6.Profesion+"\n"+"Vestimenta: "+Hijo6.Vestimenta+"\n"+"Diseñador: "+Hijo6.Designer+"\n"+"Numero: "+Hijo6.Numero+"\n"+"Pose: "+Hijo6.Pose+"\n"+"Estado: "+Hijo6.Estado);
    }

    public static void main(String[] args) {
        Boxertocatshow();
    }
}
