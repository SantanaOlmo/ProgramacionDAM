package gastosPersonales;
import java.util.*;
import depurar.*;
public class Menu {
    Scanner leer= new Scanner(System.in);
    Menu(){
        Usuario user= new Usuario();
        System.out.println("Acceso autorizado a la aplicación. Tu edad es: " + user.calcularEdad()+ " años.");
        System.out.println("Su DNI ha sido asignado como: "+ user.getDNI());
        Cuenta cuenta = new Cuenta (user);
        boolean on= true;


        System.out.println("BIENVENIDO AL REGISTRO DE GASTOS");
            while (on){
                System.out.println(" \n1 Introduce un nuevo gasto \n" +
                        "2 Introduce un nuevo ingreso \n" +
                        "3 Mostrar los gastos \n" +
                        "4 Mostrar ingresos \n" +
                        "5 Mostrar saldo \n" +
                        "0 Salir ");
                switch (depurar.leer.numSwitch()){
                    case 1:
                        System.out.println("Ha elegido: \n" +
                                "1. Introducir un nuevo gasto \n");

                        cuenta.addGastos();

                         break;
                    case 2:
                        System.out.println("Ha elegido: \n" +
                                "2. Introducir un nuevo ingreso \n");

                        cuenta.addIngresos();

                         break;
                    case 3:
                        System.out.println("Ha elegido: \n" +
                                "3. Mostrar los gastos \n");

                        cuenta.getGastos();

                        for(Gasto gasto: cuenta.getGastos()){
                            System.out.println(gasto.toString());
                        }
                         break;
                    case 4:
                        System.out.println("Ha elegido: \n" +
                                "4. Mostrar ingresos \n");

                        for(Ingreso ingreso : cuenta.getIngresos()){
                            System.out.println(ingreso.toString());
                        }

                         break;
                    case 5:
                        System.out.println("Ha elegido: \n" +
                                "5. Mostrar saldo \n");
                        System.out.println("El saldo de su cuenta es de: "+cuenta.getSaldo()+"€");

                         break;
                    case 0:
                        System.out.println("\u001B[33m" + "Fin del programa.\nGracias por utilizar la aplicación."+"\u001B[0m");
                        on=false;
                         break;
                    default:
                        System.out.println("\u001B[31m"+"\n Recuerde, debe elegir una de estas opciones:"+"\u001B[0m");
                        break;

                }



            }


    }
}
