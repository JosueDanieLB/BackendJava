package practicaMultiverse;

public class SpiderManBase {
    private String Nombre, NombreReal, Alineacion, Estatus, Universo, Base, Afiliaciones, Distincion;

    public SpiderManBase (String Nombre, String NombreReal, String Alineacion, String Estatus, String Universo, String Base, String Afiliaciones, String Distincion){
        this.Nombre = Nombre;
        this.NombreReal = NombreReal;
        this.Alineacion = Alineacion;
        this.Estatus = Estatus;
        this.Universo = Universo;
        this.Base = Base;
        this.Afiliaciones = Afiliaciones;
        this.Distincion = Distincion;
    }

    public String getNombre(){ return Nombre; }
    public String getNombreReal(){ return NombreReal; }
    public String getAlineacion(){ return Alineacion; }
    public String getEstatus(){ return Estatus; }
    public String getUniverso(){ return Universo; }
    public String getBase(){ return Base; }
    public String getAfiliaciones(){ return Afiliaciones; }
    public String getDistincion(){ return Distincion; }

    public boolean setNombre(String Nombre){
        if(!Nombre.isEmpty()){
            this.Nombre = Nombre;
            return true;
        } else
            return false;
    }

    public boolean setNombreReal(String NombreReal){
        if(!NombreReal.isEmpty()){
            this.NombreReal = NombreReal;
            return true;
        } else
            return false;
    }

    public boolean setAlineacion(String Alineacion){
        if(!Alineacion.isEmpty()){
            this.Alineacion = Alineacion;
            return true;
        } else
            return false;
    }

    public boolean setEstatus(String Estatus){
        if(!Estatus.isEmpty()){
            this.Estatus = Estatus;
            return true;
        } else
            return false;
    }

    public boolean setUniverso(String Universo){
        if(!Universo.isEmpty()){
            this.Universo = Universo;
            return true;
        } else
            return false;
    }

    public boolean setBase(String Base){
        if(!Base.isEmpty()){
            this.Base = Base;
            return true;
        } else
            return false;
    }

    public boolean setAfiliaciones(String Afiliaciones){
        if(!Afiliaciones.isEmpty()){
            this.Afiliaciones = Afiliaciones;
            return true;
        } else
            return false;
    }

    public boolean setDistincion(String Distincion){
        if(!Distincion.isEmpty()){
            this.Distincion = Distincion;
            return true;
        } else
            return false;
    }

    public String showMessage(){
        return
                " Nombre: "+Nombre+"\n"+
                        " Nombre Real: "+NombreReal+"\n"+
                        " Alineacion: "+Alineacion+"\n"+
                        " Estatus: "+Estatus+"\n"+
                        " Universo: "+Universo+"\n"+
                        " Base: "+Base+"\n"+
                        " Afiliaciones: "+Afiliaciones+"\n"+
                        " Distincion: "+Distincion+"\n";
    }
}
