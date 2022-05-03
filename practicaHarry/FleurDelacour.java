package practicaHarry;

public class FleurDelacour {

    public static void Fleurshow(){
        personajeHarryP FleurDelacour = new personajeHarryP("Campeona del Torneo de los 3 Magos","1/4 Veela","Academia Beauxbatons","N/A","Femenino","Desconocido","Desconocido","Palisandro, 25cm, rigida, pelo de Veela","Lord Voldemort");
        System.out.println("Fleur Delacour tiene las siguientes caracteristicas: ");
        System.out.println(FleurDelacour.getDato1()+FleurDelacour.getTitulo()+" \n"+FleurDelacour.getDato2()+FleurDelacour.getSangre()+" \n"+FleurDelacour.getDato3()+FleurDelacour.getEscuela()+" \n"+FleurDelacour.getDato4()+FleurDelacour.getCasa()+" \n"+FleurDelacour.getDato5()+FleurDelacour.getGenero()+" \n"+FleurDelacour.getDato6()+FleurDelacour.getProfesion()+" \n"+FleurDelacour.getDato7()+FleurDelacour.getPatronus()+" \n"+FleurDelacour.getDato8()+FleurDelacour.getVarita()+" \n"+FleurDelacour.getDato9()+FleurDelacour.getBoggart());
    }

    public static void main(String[] args) {
        Fleurshow();
    }
}
