package gastosPersonales;
import depurar.leer.*;
public class Usuario implements Persona{

    private String nombre;
    private String fecha_nacimiento;
    private String DNI;

    Usuario(){
        //a los set, envío depurados el nombre y la fecha de nacimiento
        setNombre(depurar.leer.nombre());
        setFechaNacimieinto(depurar.leer.fechaNacimiento());
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
        getFechaNacimiento();

        return 0;
    }

    @Override
    public void saludar() {
        System.out.println("Hola "+ getNombre()+"!");
    }
}
