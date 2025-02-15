package depurar;
import java.util.*;
public class leer {
    static Scanner leer= new Scanner (System.in);
    static Scanner leerstring =new Scanner (System.in);
     public static int numSwitch(){
         int numero=0;

         System.out.println("\nIntroduzca una de las opciones");
         String num= leerstring.nextLine();

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

     public static double dinero(){
         boolean on=true;
         String respuesta="";
         int dinero=0;
         while (on){
            try{
                System.out.println("Inserte una cantidad de dinero.");
                dinero=leer.nextInt();
                if (dinero>0) {
                    on=false;
                }else{
                    System.out.println("Introduzca una cantidad válida.");

                }
            }catch (InputMismatchException e){
                System.out.println("Inserte caracteres numéricos.");
                leer.next();
            }
         }
         return dinero;
     }

     public static String descripcion(){


         System.out.println("Escriba una descripción.");
         String descripcion=leerstring.nextLine();

         if (descripcion.replaceAll("\\s+","").matches("")){
             return "#sin_descripcion";

         }else{
           return descripcion;
         }

     }


}
