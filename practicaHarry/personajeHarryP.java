package practicaHarry;

public class personajeHarryP {

    public String Titulo, Sangre, Escuela, Casa, Genero, Profesion, Patronus, Varita, Boggart, Dato1, Dato2,Dato3, Dato4, Dato5, Dato6, Dato7, Dato8, Dato9;

    public personajeHarryP(String Titulo, String Sangre, String Escuela, String Casa, String Genero, String Profesion, String Patronus, String Varita, String Boggart){
        this.Titulo = Titulo;
        this.Sangre = Sangre;
        this. Escuela = Escuela;
        this.Casa = Casa;
        this.Genero = Genero;
        this.Profesion = Profesion;
        this.Patronus = Patronus;
        this.Varita = Varita;
        this.Boggart = Boggart;
        this.Dato1 = "Titulo: ";
        this.Dato2 = "Sangre: ";
        this.Dato3 = "Escuela: ";
        this.Dato4 = "Casa: ";
        this.Dato5 = "Genero: ";
        this.Dato6 = "Profesion: ";
        this.Dato7 = "Patronus: ";
        this.Dato8 = "Varita: ";
        this.Dato9 = "Boggart: ";

    }

    public boolean setTitulo(String Titulo){
        if(!Titulo.isEmpty()){
            this.Titulo = Titulo;
            return true;
        } else
            return false;
    }

    public boolean setSangre(String Sangre){
        if(!Sangre.isEmpty()){
            this.Sangre = Sangre;
            return true;
        } else
            return false;
    }

    public boolean setEscuela(String Escuela){
        if(!Escuela.isEmpty()){
            this.Escuela = Escuela;
            return true;
        } else
            return false;
    }

    public boolean setCasa(String Casa){
        if(!Casa.isEmpty()){
            this.Casa = Casa;
            return true;
        } else
            return false;
    }

    public boolean setGenero(String Genero){
        if(!Genero.isEmpty()){
            this.Genero = Genero;
            return true;
        } else
            return false;
    }

    public boolean setProfesion(String Profesion){
        if(!Profesion.isEmpty()){
            this.Profesion = Profesion;
            return true;
        } else
            return false;
    }

    public boolean setPatronus(String Patronus){
        if(!Patronus.isEmpty()){
            this.Patronus = Patronus;
            return true;
        } else
            return false;
    }

    public boolean setVarita(String Varita){
        if(!Varita.isEmpty()){
            this.Varita = Varita;
            return true;
        } else
            return false;
    }

    public boolean setBoggart(String Boggart){
        if(!Boggart.isEmpty()){
            this.Boggart = Boggart;
            return true;
        } else
            return false;
    }

    public String getTitulo(){ return Titulo; }
    public String getSangre(){ return Sangre; }
    public String getEscuela(){ return Escuela; }
    public String getCasa(){ return Casa; }
    public String getGenero(){ return Genero; }
    public String getProfesion(){ return Profesion; }
    public String getPatronus(){ return Patronus; }
    public String getVarita(){ return Varita; }
    public String getBoggart(){ return Boggart; }
    public String getDato1(){ return Dato1; }
    public String getDato2(){ return Dato2; }
    public String getDato3(){ return Dato3; }
    public String getDato4(){ return Dato4; }
    public String getDato5(){ return Dato5; }
    public String getDato6(){ return Dato6; }
    public String getDato7(){ return Dato7; }
    public String getDato8(){ return Dato8; }
    public String getDato9(){ return Dato9; }
}
