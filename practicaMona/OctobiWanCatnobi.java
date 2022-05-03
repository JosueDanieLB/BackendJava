package practicaMona;

public class OctobiWanCatnobi extends OctocatOriginal{

    public OctobiWanCatnobi(){}

    String Pose, Estado;

    OctobiWanCatnobi(String Nombre, String Profesion, String Vestimenta, String Designer, int Numero, String Pose, String Estado){
        this.Nombre = Nombre;
        this.Profesion = Profesion;
        this.Vestimenta = Vestimenta;
        this.Designer = Designer;
        this.Numero = Numero;
        this.Pose = Pose;
        this.Estado = Estado;
    }

    public static void Octobishow(){
        OctobiWanCatnobi Hijo1 = new OctobiWanCatnobi("Octobi Wan Catnobi","Jedi","Atuendo de maestro Jedi","Cameron McEfee",3,"Concentracion","Meditando");
        System.out.println("Octobi Wan Catnobi tiene las siguientes caracteristicas: ");
        System.out.println("Nombre: "+Hijo1.Nombre+"\n"+"Profesion: "+Hijo1.Profesion+"\n"+"Vestimenta: "+Hijo1.Vestimenta+"\n"+"Diseñador: "+Hijo1.Designer+"\n"+"Numero: "+Hijo1.Numero+"\n"+"Pose: "+Hijo1.Pose+"\n"+"Estado: "+Hijo1.Estado);
    }

    public static void main(String[] args) {
        Octobishow();
    }
}
