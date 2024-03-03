package Gestion_animales;

public class animalTerrestre extends animal{

    int patas;
    boolean pelaje;
    boolean caminar;

    public animalTerrestre(String nombre, String especie, String raza, String color, String sexo, int patas, boolean pelaje, boolean caminar) {
        super(nombre, especie, raza, color, sexo);
        this.patas=patas;
        this.pelaje=pelaje;
        this.caminar=caminar;
    }

    public int getPatas() {
        return patas;
    }

    public void setPatas(int patas) {
        this.patas = patas;
    }

    public boolean isPelaje() {
        return pelaje;
    }

    public void setPelaje(boolean pelaje) {
        this.pelaje = pelaje;
    }

    public boolean isCaminar() {
        return caminar;
    }

    public void setCaminar(boolean caminar) {
        this.caminar = caminar;
    }
    @Override
    public String toString() {
        return "animalTerrestre []";
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
    public String getColor() {
        // TODO Auto-generated method stub
        return super.getColor();
    }

    @Override
    public String getEspecie() {
        // TODO Auto-generated method stub
        return super.getEspecie();
    }

    @Override
    public String getNombre() {
        // TODO Auto-generated method stub
        return super.getNombre();
    }

    @Override
    public String getRaza() {
        // TODO Auto-generated method stub
        return super.getRaza();
    }

    @Override
    public String getSexo() {
        // TODO Auto-generated method stub
        return super.getSexo();
    }

    @Override
    public int hashCode() {
        // TODO Auto-generated method stub
        return super.hashCode();
    }

    @Override
    public void setColor(String color) {
        // TODO Auto-generated method stub
        super.setColor(color);
    }

    @Override
    public void setEspecie(String especie) {
        // TODO Auto-generated method stub
        super.setEspecie(especie);
    }

    @Override
    public void setNombre(String nombre) {
        // TODO Auto-generated method stub
        super.setNombre(nombre);
    }

    @Override
    public void setRaza(String raza) {
        // TODO Auto-generated method stub
        super.setRaza(raza);
    }

    @Override
    public void setSexo(String sexo) {
        // TODO Auto-generated method stub
        super.setSexo(sexo);
    }

    
    
}
