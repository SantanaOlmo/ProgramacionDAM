package gastosPersonales;

public class Usuario implements Persona{
    private String nombre;
    private String fecha_nacimiento;
    private String DNI;

    Usuario(){

    }
    String getNombre(){
        return nombre;
    }
    void setNombre(){
        this.nombre=nombre;
    }
    String getFechaNacimiento(){
        return fecha_nacimiento;
    }
    void setFechaNacimieinto(){
        this.fecha_nacimiento=fecha_nacimiento;
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
        return 0;
    }

    @Override
    public String saludar() {
        return "";
    }
}
