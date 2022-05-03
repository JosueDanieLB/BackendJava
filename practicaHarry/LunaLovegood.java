package practicaHarry;

public class LunaLovegood {

    public static void Lunashow(){
        personajeHarryP LunaLovegood = new personajeHarryP("Comentarista de Quidditch de Hogwarts","Pura o Mestiza","Hogwarts","Ravenclaw","Femenino","Magizoologista","Liebre","Desconocida","Desconocido");
        System.out.println("Luna Lovegood tiene las siguientes caracteristicas: ");
        System.out.println(LunaLovegood.getDato1()+LunaLovegood.getTitulo()+" \n"+LunaLovegood.getDato2()+LunaLovegood.getSangre()+" \n"+LunaLovegood.getDato3()+LunaLovegood.getEscuela()+" \n"+LunaLovegood.getDato4()+LunaLovegood.getCasa()+" \n"+LunaLovegood.getDato5()+LunaLovegood.getGenero()+" \n"+LunaLovegood.getDato6()+LunaLovegood.getProfesion()+" \n"+LunaLovegood.getDato7()+LunaLovegood.getPatronus()+" \n"+LunaLovegood.getDato8()+LunaLovegood.getVarita()+" \n"+LunaLovegood.getDato9()+LunaLovegood.getBoggart());
    }

    public static void main(String[] args) {
        Lunashow();
    }
}
