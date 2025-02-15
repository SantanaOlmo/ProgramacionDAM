package gastosPersonales;
import depurar.*;

public class Gasto extends Dinero{

    Gasto(){
        super();
    }

    @Override
    public String toString() {
        return "[Gasto: "+ getDinero()+ "€\n Descripción: "+ getDescripcion();
    }
}
