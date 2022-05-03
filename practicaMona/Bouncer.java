package practicaMona;

public class Bouncer extends OctocatOriginal {

    public Bouncer(){}

    String Pose, Estado;

    Bouncer(String Nombre, String Profesion, String Vestimenta, String Designer, int Numero, String Pose, String Estado){
        this.Nombre = Nombre;
        this.Profesion = Profesion;
        this.Vestimenta = Vestimenta;
        this.Designer = Designer;
        this.Numero = Numero;
        this.Pose = Pose;
        this.Estado = Estado;
    }

    public static void Bouncershow(){
        Bouncer Hijo2 = new Bouncer("Bouncer","Cadenero","Pantalon, camiseta y lentes oscuros","Cameron McEfee",14,"En Guardia","Vigilando");
        System.out.println("Bouncer tiene las siguientes caracteristicas: ");
        System.out.println("Nombre: "+Hijo2.Nombre+"\n"+"Profesion: "+Hijo2.Profesion+"\n"+"Vestimenta: "+Hijo2.Vestimenta+"\n"+"Diseñador: "+Hijo2.Designer+"\n"+"Numero: "+Hijo2.Numero+"\n"+"Pose: "+Hijo2.Pose+"\n"+"Estado: "+Hijo2.Estado);
    }

    public static void main(String[] args) {
        Bouncershow();
    }
}
