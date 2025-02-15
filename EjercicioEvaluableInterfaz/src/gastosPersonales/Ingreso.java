package gastosPersonales;

public class Ingreso extends Dinero{

    Ingreso(){
        super();
    }

    @Override
    public String toString() {
        return "Ingreso: "+ getDinero()+"€ \n Descripción: "+ getDescripcion();
    }
}
