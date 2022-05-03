package practicaMona;

public class OctocatOriginal {

    public OctocatOriginal(){}

    String Nombre, Profesion, Vestimenta, Designer;
    int Numero;

    public OctocatOriginal(String Nombre, String Profesion, String Vestimenta, String Designer, int Numero){
        this.Nombre = Nombre;
        this.Profesion = Profesion;
        this.Vestimenta = Vestimenta;
        this.Designer = Designer;
        this.Numero = Numero;
    }

    public static void Octocatshow(){
        OctocatOriginal Padre = new OctocatOriginal("Octocat","Desconocido","Ninguna","Simon",1);
        System.out.println("Octocat tiene las siguientes caracteristicas: ");
        System.out.println("Nombre: "+Padre.Nombre+"\n"+"Profesion: "+Padre.Profesion+"\n"+"Vestimenta: "+Padre.Vestimenta+"\n"+"Diseñador: "+Padre.Designer+"\n"+"Numero: "+Padre.Numero);
    }

    public static void main(String[] args) {
        Octocatshow();
    }
}
