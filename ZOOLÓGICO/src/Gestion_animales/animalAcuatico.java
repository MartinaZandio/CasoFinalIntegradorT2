package Gestion_animales;

import Gestion_animales.animal;

public class animalAcuatico extends animal {

    boolean aletas;
    boolean branquias;
    String tipoagua;

    public animalAcuatico (String nombre, String especie, String raza, String color, String sexo, boolean aletas, boolean branquias, String tipoagua) {
        super(nombre, especie, raza, color, sexo);
        this.aletas=aletas;
        this.branquias=branquias;
        this.tipoagua=tipoagua;
    }

    public boolean isAletas() {
        return aletas;
    }

    public void setAletas(boolean aletas) {
        this.aletas = aletas;
    }

    public boolean isBranquias() {
        return branquias;
    }

    public void setBranquias(boolean branquias) {
        this.branquias = branquias;
    }

    public String getTipoagua() {
        return tipoagua;
    }

    public void setTipoagua(String tipoagua) {
        this.tipoagua = tipoagua;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        // TODO Auto-generated method stub
        return super.clone();
    }

    @Override
    public boolean equals(Object obj) {
        // TODO Auto-generated method stub
        return super.equals(obj);
    }

    @Override
    protected void finalize() throws Throwable {
        // TODO Auto-generated method stub
        super.finalize();
    }

    @Override
    public int hashCode() {
        // TODO Auto-generated method stub
        return super.hashCode();
    }

    @Override
    public String toString() {
        return "acuatico []";
    }
    
}
