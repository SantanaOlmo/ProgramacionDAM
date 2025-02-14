package gastosPersonales;

public abstract class Dinero {
    protected double dinero;
    protected String descripcion;


    double getDinero(){
        return dinero;
    }

    void setDinero (double dinero){
        this.dinero= dinero;
    }

    String getDescripcion(){
        return descripcion;
    }
    void SetDescripcion(String descripcion){
        this.descripcion=descripcion;
    }

}
