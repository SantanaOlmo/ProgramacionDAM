package gastosPersonales;

import java.util.*;

    public class Cuenta{
    private double saldo;
    private Usuario usuario;
    private ArrayList<Gasto> gastos= new ArrayList<>();
    private ArrayList <Ingreso> ingresos= new ArrayList<>();

    Cuenta (Usuario usuario){

    }

    double getSaldo(){
        return saldo;
    }
    void setSaldo(double saldo){
        this.saldo=saldo;
    }
    Usuario getUsuario(){
        return usuario;
    }
    double addIngresos(String descripcion, double cantidad){
        ingresos.add(new Ingreso());
        return 0;
    }
    double addGastos(String descripcion, double cantidad){
        gastos.add(new Gasto());
        return 0;
    }
    ArrayList<Ingreso> getIngresos(){
        return ingresos;
    }
    ArrayList<Gasto>getGastos(){
        return gastos;
    }

        @Override
        public String toString() {
            return super.toString();
        }
    }
