package depurar;
import java.util.*;
public class leer {



     public static int depurarNumSwitch(Scanner leer){
         int numero=0;

         System.out.println("Introduzca una de las opciones");
         String num= leer.nextLine();

         //elimino todos los espacioes en blanco
         num = num.replaceAll("\\s+", "");

         //si el string es un número
         if (num.matches("^-?\\d+(\\.\\d+)?$")){
             numero=Integer.parseInt(num);
             return numero;
         }else{
             return 0;
         }
     }

}
