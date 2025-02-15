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
        if(this.saldo==0){
            System.out.println("Ten cuidado te has quedado a 0€");
        } else if (this.saldo<0) {
            System.out.println("\u001B[31m"+"‼️ Aviso! Estás en negativo ‼️"+"\u001B[0m");
        }
    }

    Usuario getUsuario(){
        return usuario;
    }

    void addIngresos(){
        ingresos.add(new Ingreso());
        //al set saldo mando los ingresos
        setSaldo(ingresos.getLast().getDinero());
    }

    void addGastos(){
        gastos.add(new Gasto());
        //al saldo mando el dinero del gasto convertido a negativo
        setSaldo((-1)*gastos.getLast().getDinero());

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
