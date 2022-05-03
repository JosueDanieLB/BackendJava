package practicaHarry;

public class NewtonScamander {

    public static void Newtonshow(){
        personajeHarryP NewtonScamander = new personajeHarryP("Magizoologista","Pura o Mestiza","Hogwarts","Hufflepuff","Masculino","Magizoologista","Desconocido","Madera de fresno, elementos de hueso y concha marina","Trabajar en una oficina");
        System.out.println("Newton Scamander tiene las siguientes caracteristicas: ");
        System.out.println(NewtonScamander.getDato1()+NewtonScamander.getTitulo()+" \n"+NewtonScamander.getDato2()+NewtonScamander.getSangre()+" \n"+NewtonScamander.getDato3()+NewtonScamander.getEscuela()+" \n"+NewtonScamander.getDato4()+NewtonScamander.getCasa()+" \n"+NewtonScamander.getDato5()+NewtonScamander.getGenero()+" \n"+NewtonScamander.getDato6()+NewtonScamander.getProfesion()+" \n"+NewtonScamander.getDato7()+NewtonScamander.getPatronus()+" \n"+NewtonScamander.getDato8()+NewtonScamander.getVarita()+" \n"+NewtonScamander.getDato9()+NewtonScamander.getBoggart());
    }

    public static void main(String[] args) {
        Newtonshow();
    }
}
