package depurar;
import java.util.*;
public class Depurar {



     public static int depurarNumSwitch(Scanner leer,String num){
         int numero=0;
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
