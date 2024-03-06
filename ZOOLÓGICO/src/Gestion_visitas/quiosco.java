package Gestion_visitas;

public class quiosco extends visitante{

    String info;
    String intereses;
    boolean quiere_tour;

    public quiosco(boolean adulto, boolean niño, String info, String intereses, boolean quiere_tour) {
        super(adulto, niño);
        this.info = info;
        this.intereses = intereses;
        this.quiere_tour = quiere_tour;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getIntereses() {
        return intereses;
    }

    public void setIntereses(String intereses) {
        this.intereses = intereses;
    }

    public boolean isQuiere_tour() {
        return quiere_tour;
    }

    public void setQuiere_tour(boolean quiere_tour) {
        this.quiere_tour = quiere_tour;
    }
}

    
}