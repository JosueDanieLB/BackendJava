package practicaMona;

public class Luchadortocat extends OctocatOriginal {

    public Luchadortocat(){}

    String Pose, Estado;

    Luchadortocat(String Nombre, String Profesion, String Vestimenta, String Designer, int Numero, String Pose, String Estado){
        this.Nombre = Nombre;
        this.Profesion = Profesion;
        this.Vestimenta = Vestimenta;
        this.Designer = Designer;
        this.Numero = Numero;
        this.Pose = Pose;
        this.Estado = Estado;
    }

    public static void Luchadortocatshow(){
        Luchadortocat Hijo5 = new Luchadortocat("Luchadortocat","Luchador","Traje verde de luchador","James Kang y Joao Ribeiro",113,"Lanzandose de la tercera cuerda","Luchando");
        System.out.println("Luchadortocat tiene las siguientes caracteristicas: ");
        System.out.println("Nombre: "+Hijo5.Nombre+"\n"+"Profesion: "+Hijo5.Profesion+"\n"+"Vestimenta: "+Hijo5.Vestimenta+"\n"+"Diseñador: "+Hijo5.Designer+"\n"+"Numero: "+Hijo5.Numero+"\n"+"Pose: "+Hijo5.Pose+"\n"+"Estado: "+Hijo5.Estado);
    }

    public static void main(String[] args) {
        Luchadortocatshow();
    }
}
