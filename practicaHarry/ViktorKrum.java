package practicaHarry;

public class ViktorKrum {

    public static void Viktorshow(){
        personajeHarryP ViktorKrum = new personajeHarryP("Campeon de Durmstrang del Torneo de los 3 Magos","Pura o Mestiza","Instituto Durmstrang","N/A","Masculino","Buscador del equipo nacional de Quidditch Bulgaro","Desconocido","Carpe, 26.03cm, corazon de dragon","Lord Voldemort");
        System.out.println("Viktor Krum tiene las siguientes caracteristicas: ");
        System.out.println(ViktorKrum.getDato1()+ViktorKrum.getTitulo()+" \n"+ViktorKrum.getDato2()+ViktorKrum.getSangre()+" \n"+ViktorKrum.getDato3()+ViktorKrum.getEscuela()+" \n"+ViktorKrum.getDato4()+ViktorKrum.getCasa()+" \n"+ViktorKrum.getDato5()+ViktorKrum.getGenero()+" \n"+ViktorKrum.getDato6()+ViktorKrum.getProfesion()+" \n"+ViktorKrum.getDato7()+ViktorKrum.getPatronus()+" \n"+ViktorKrum.getDato8()+ViktorKrum.getVarita()+" \n"+ViktorKrum.getDato9()+ViktorKrum.getBoggart());
    }

    public static void main(String[] args) {
        Viktorshow();
    }

}
