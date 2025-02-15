package gastosPersonales;

public abstract class Dinero {
    protected double dinero;
    protected String descripcion;

    Dinero(){
        setDinero(depurar.leer.dinero());
        setDescripcion(depurar.leer.descripcion());
    }

    double getDinero(){
        return dinero;
    }

    void setDinero (double dinero){
        this.dinero= dinero;
    }

    String getDescripcion(){
        return descripcion;
    }
    void setDescripcion(String descripcion){
        this.descripcion=descripcion;
    }


}
