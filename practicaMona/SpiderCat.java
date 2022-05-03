package practicaMona;

public class SpiderCat extends OctocatOriginal {

    public SpiderCat(){}

    String Pose, Estado;

    SpiderCat(String Nombre, String Profesion, String Vestimenta, String Designer, int Numero, String Pose, String Estado){
        this.Nombre = Nombre;
        this.Profesion = Profesion;
        this.Vestimenta = Vestimenta;
        this.Designer = Designer;
        this.Numero = Numero;
        this.Pose = Pose;
        this.Estado = Estado;
    }

    public static void SpiderCatshow(){
        SpiderCat Hijo4 = new SpiderCat("Spider-Cat","Super Heroe","Traje de Spider-Man","James Kang",87,"Colgado de cabeza","Vigilando");
        System.out.println("Spider Cat tiene las siguientes caracteristicas: ");
        System.out.println("Nombre: "+Hijo4.Nombre+"\n"+"Profesion: "+Hijo4.Profesion+"\n"+"Vestimenta: "+Hijo4.Vestimenta+"\n"+"Diseñador: "+Hijo4.Designer+"\n"+"Numero: "+Hijo4.Numero+"\n"+"Pose: "+Hijo4.Pose+"\n"+"Estado: "+Hijo4.Estado);
    }

    public static void main(String[] args) {
        SpiderCatshow();
    }
}
