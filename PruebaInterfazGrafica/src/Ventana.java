import javax.swing.*;
import java.awt.*;
import java.net.URL;
public class Ventana  extends JFrame {

    private Image fondo;
    public Ventana(){
        setTitle("Alberto Estepa");
        ImageIcon icono =new ImageIcon(getClass().getResource("/fotoperfil.png"));
        setIconImage(icono.getImage());

        setSize (400,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        cargarFondo();
        setVisible(true);
    }


    private void cargarFondo(){
        //PARA HACER ESTO ES NECESARIO IMPORTAR JAVA.NET.URL
        URL imageURL =getClass().getResource("/fondo.jpg");
        if (imageURL!= null){
            fondo =new ImageIcon(imageURL).getImage();
        }else{
            System.err.println("No se encontró la imagen");
        }
    }

    @Override
    public void paint (Graphics g){
        super.paint(g);

        if (fondo != null) {
            g.drawImage(fondo, 0, 0, getWidth(), getHeight(), this);
        }
    }
}

