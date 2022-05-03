package practicaHarry;

public class RonaldWeasley {

    public static void Ronaldshow(){
        personajeHarryP RonaldWeasley = new personajeHarryP("Tesorero de la P.E.D.D.O","Pura","Hogwarts","Griffyndor","Masculino","Co-Propietario de Sortilegios Weasley","Jack Russell Terrier","Castaño, 23.4cm, nervio de dragón","Acromantula");
        System.out.println("Ronald Weasley tiene las siguientes caracteristicas: ");
        System.out.println(RonaldWeasley.getDato1()+RonaldWeasley.getTitulo()+" \n"+RonaldWeasley.getDato2()+RonaldWeasley.getSangre()+" \n"+RonaldWeasley.getDato3()+RonaldWeasley.getEscuela()+" \n"+RonaldWeasley.getDato4()+RonaldWeasley.getCasa()+" \n"+RonaldWeasley.getDato5()+RonaldWeasley.getGenero()+" \n"+RonaldWeasley.getDato6()+RonaldWeasley.getProfesion()+" \n"+RonaldWeasley.getDato7()+RonaldWeasley.getPatronus()+" \n"+RonaldWeasley.getDato8()+RonaldWeasley.getVarita()+" \n"+RonaldWeasley.getDato9()+RonaldWeasley.getBoggart());
    }

    public static void main(String[] args) {
        Ronaldshow();
    }
}
