package Gestion_habitats;

public class aviario extends habitat{

    boolean puede_volar;

    public aviario(float temperatura,float humedad,boolean limpieza, boolean puede_volar) {
        super(temperatura, humedad, limpieza);
        this.puede_volar = puede_volar;
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
        return "aviario []";
    }

    public boolean isPuede_volar() {
        return puede_volar;
    }

    public void setPuede_volar(boolean puede_volar) {
        this.puede_volar = puede_volar;
    }
    
}
