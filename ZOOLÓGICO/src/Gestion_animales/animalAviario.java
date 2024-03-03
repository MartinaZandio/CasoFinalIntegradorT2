package Gestion_animales;

import Gestion_animales.animal;

public class animalAviario extends animal {

    boolean vuela;
    boolean pico;
    boolean plumaje;

    public animalAviario(String nombre, String especie, String raza, String color, String sexo, boolean vuela, boolean pico, boolean plumaje) {
        super(nombre, especie, raza, color, sexo);
        this.vuela=vuela;
        this.pico=pico;
        this.plumaje=plumaje;
    }



    public boolean isVuela() {
        return vuela;
    }

    public void setVuela(boolean vuela) {
        this.vuela = vuela;
    }

    public boolean isPico() {
        return pico;
    }

    public void setPico(boolean pico) {
        this.pico = pico;
    }

    public boolean isPlumaje() {
        return plumaje;
    }

    public void setPlumaje(boolean plumaje) {
        this.plumaje = plumaje;
    }

    @Override
    public String toString() {
        return "animalAviario []";
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

    
}
