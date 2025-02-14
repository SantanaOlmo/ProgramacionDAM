package gastosPersonales;
import java.util.*;
import depurar.*;
public class Menu {
    Scanner leer= new Scanner(System.in);

    Menu(){
        boolean on= true;
        System.out.println("BIENVENIDO AL REGISTRO DE GASTOS \n");
            while (on){
                System.out.println("1 Introduce un nuevo gasto \n" +
                        "2 Introduce un nuevo ingreso \n" +
                        "3 Mostrar los gastos \n" +
                        "4 Mostrar ingresos \n" +
                        "5 Mostrar saldo \n" +
                        "0 Salir ");
                switch (depurar.leer.NumSwitch(leer)){
                    case 1:
                        System.out.println("Ha elegido: \n" +
                                "1. Introducir un nuevo ingreso \n");

                         break;
                    case 2:
                        System.out.println("Ha elegido: \n" +
                                "2. Introducir un nuevo ingreso \n");
                         break;
                    case 3:
                        System.out.println("Ha elegido: \n" +
                                "3. Mostrar los gastos \n");
                         break;
                    case 4:
                        System.out.println("Ha elegido: \n" +
                                "4. Mostrar ingresos \n");
                         break;
                    case 5:
                        System.out.println("Ha elegido: \n" +
                                "5. Mostrar saldo \n");
                         break;
                    case 0:
                        System.out.println("\n Gracias, hasta la próxima 👋");
                        on=false;
                         break;
                    default:
                        System.out.println("\u001B[31m"+"\n Recuerde, debe elegir una de estas opciones:"+"\u001B[0m");
                        break;

                }



            }


    }
}
