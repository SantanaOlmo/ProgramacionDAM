package gastosPersonales;
import depurar.leer.*;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Usuario implements Persona{

    private String nombre;
    private String fecha_nacimiento;
    private String DNI;

    Usuario(){
        //a los set, envío depurados el nombre y la fecha de nacimiento
        setNombre(depurar.leer.nombre());
        setFechaNacimieinto(depurar.leer.fechaNacimiento());
        //AÑADIR EL DNI


    }
    String getNombre(){
        return nombre;
    }
    void setNombre(String nombre){
        this.nombre=nombre;
    }
    String getFechaNacimiento(){
        return fecha_nacimiento;
    }
    void setFechaNacimieinto(String fechadenacimiento){
        this.fecha_nacimiento=fechadenacimiento;
    }
    String getDNI(){
        return DNI;
    }
    boolean setDNI(){
        this.DNI=DNI;
        return true;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public int calcularEdad() {
        // genero un formato para las fechas con nombre formateador
        DateTimeFormatter formateador=DateTimeFormatter.ofPattern("dd-MM-yyyy");
        // la fecha de nacimiento la establezco con getFechaNacimiento aplicando el formateador
        LocalDate fechaNacimiento=LocalDate.parse(getFechaNacimiento(),formateador);
        //recibo la fecha actual
        LocalDate fechaActual=LocalDate.now();
        //calculo los años que hay entre la fecha de nacimiento y la fecha actual
        int edad= Period.between(fechaNacimiento,fechaActual).getYears();
        return edad;
    }

    @Override
    public void saludar() {
        System.out.println("Hola "+ getNombre()+"!");
    }
}
