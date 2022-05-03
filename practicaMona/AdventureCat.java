package practicaMona;

public class AdventureCat extends OctocatOriginal {

    public AdventureCat(){}

    String Pose, Estado;

    AdventureCat(String Nombre, String Profesion, String Vestimenta, String Designer, int Numero, String Pose, String Estado){
        this.Nombre = Nombre;
        this.Profesion = Profesion;
        this.Vestimenta = Vestimenta;
        this.Designer = Designer;
        this.Numero = Numero;
        this.Pose = Pose;
        this.Estado = Estado;
    }

    public static void AdventureCatshow(){
        AdventureCat Hijo3 = new AdventureCat("Adventure Cat","Heroe","Gorro blanco, espada, mochila verde, camiseta azul, short azul y zapatos negros","Jon Rohan",68,"Saludando","Emocionado");
        System.out.println("Adventure Cat tiene las siguientes caracteristicas: ");
        System.out.println("Nombre: "+Hijo3.Nombre+"\n"+"Profesion: "+Hijo3.Profesion+"\n"+"Vestimenta: "+Hijo3.Vestimenta+"\n"+"Diseñador: "+Hijo3.Designer+"\n"+"Numero: "+Hijo3.Numero+"\n"+"Pose: "+Hijo3.Pose+"\n"+"Estado: "+Hijo3.Estado);
    }

    public static void main(String[] args) {
        AdventureCatshow();
    }
}
