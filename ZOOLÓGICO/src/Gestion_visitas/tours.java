package Gestion_visitas;

public class tours extends visitante{

    boolean aficion_aves;
    boolean aficion_terrestres;
    boolean aficion_acuaticos;

    public tours(boolean adulto, boolean niño, boolean aficion_aves, boolean aficion_terrestres, boolean aficion_acuaticos) {
       super(adulto,niño);
        this.aficion_aves = aficion_aves;
        this.aficion_terrestres = aficion_terrestres;
        this.aficion_acuaticos = aficion_acuaticos;
    }

    public boolean isAficion_aves() {
        return aficion_aves;
    }

    public void setAficion_aves(boolean aficion_aves) {
        this.aficion_aves = aficion_aves;
    }

    public boolean isAficion_terrestres() {
        return aficion_terrestres;
    }

    public void setAficion_terrestres(boolean aficion_terrestres) {
        this.aficion_terrestres = aficion_terrestres;
    }

    public boolean isAficion_acuaticos() {
        return aficion_acuaticos;
    }

    public void setAficion_acuaticos(boolean aficion_acuaticos) {
        this.aficion_acuaticos = aficion_acuaticos;
    }
}