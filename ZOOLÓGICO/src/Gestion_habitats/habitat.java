
public class habitat {

    float temperatura;
    float humedad;
    boolean limpieza;

    public habitats(float temperatura,float humedad,boolean limpieza) {
        this.temperatura = temperatura;
        this.humedad = humedad;
        this.limpieza = limpieza;

    }

    
    public float getTemperatura() {
        return temperatura;
    }


    public void setTemperatura(float temperatura) {
        this.temperatura = temperatura;
    }


    public float getHumedad() {
        return humedad;
    }


    public void setHumedad(float humedad) {
        this.humedad = humedad;
    }


    public boolean isLimpieza() {
        return limpieza;
    }


    public void setLimpieza(boolean limpieza) {
        this.limpieza = limpieza;
    }


    @Override
    public String toString() {
        return "habitat []";
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
