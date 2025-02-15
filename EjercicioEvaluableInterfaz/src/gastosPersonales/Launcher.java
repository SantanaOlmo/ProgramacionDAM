package gastosPersonales;

public class Launcher {
    public static void main(String[] args) {
        Usuario user= new Usuario();
        System.out.println("Acceso autorizado a la aplicación. Tu edad es: " + user.calcularEdad());
        Cuenta cuenta = new Cuenta (user);
        new Menu();

    }
}
