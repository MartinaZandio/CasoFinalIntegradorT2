package Gestion_animales;

public class visitante{

    boolean adulto;
    boolean niño;
    

    public visitante(boolean adulto, boolean niño){
        this.adulto = adulto;
        this.niño = niño;
        
    }

    public boolean isAdulto() {
        return adulto;
    }

    public void setAdulto(boolean adulto) {
        this.adulto = adulto;
    }

    public boolean isNiño() {
        return niño;
    }

    public void setNiño(boolean niño) {
        this.niño = niño;
    }

    
}

    

}