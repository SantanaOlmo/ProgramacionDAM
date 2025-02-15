package gastosPersonales;

import java.util.*;

    public class Cuenta{
    private double saldo;
    private Usuario usuario;
    private ArrayList<Gasto> gastos= new ArrayList<>();
    private ArrayList <Ingreso> ingresos= new ArrayList<>();

    Cuenta (Usuario usuario){
        usuario.saludar();
    }

    double getSaldo(){
        return saldo;
    }
    void setSaldo(double saldo){
        this.saldo+=saldo;
    }
    Usuario getUsuario(){
        return usuario;
    }
    void addIngresos(){
        ingresos.add(new Ingreso());
    }
    void addGastos(){
        gastos.add(new Gasto());
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
