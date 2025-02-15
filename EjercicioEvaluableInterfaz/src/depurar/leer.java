package depurar;
import java.util.*;
public class leer {
    static Scanner leer= new Scanner (System.in);
     public static int numSwitch(){
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
             return 7;
         }
     }

     public static String nombre(){
         boolean on=true;
         String nombre="";
             System.out.println("Introduce tu nombre");

         while(on){
             nombre= leer.nextLine();
             nombre=nombre.replaceAll("\\s+", "");
             if (nombre.matches("^[A-Za-zÁÉÍÓÚáéíóúÜüÑñ]+$")){
                 on=false;
             }else{
                 System.out.println("Error, vuelva a introducir su nombre. \n Utilice exclusivamente letras");
             }
         }
         return nombre;

     }

     public static String dNI(){
        String dni="";

        return dni;
     }

     public static String fechaNacimiento(){
         boolean on=true;
         String fecha="";
         System.out.println("Inserte su fecha de nacimiento");
         while (on){
              fecha=leer.nextLine();

              if (fecha.matches("^(0[1-9]|[12][0-9]|3[01])-(0[1-9]|1[0-2])-(19|20)\\d\\d$")){
                  on=false;
                  break;
              }else{
                  System.out.println("Error, inserte una fecha válida siguiendo el formato dd-mm-aaaa");
              }
         }
        return fecha;

     }
}
