import javax.swing.*;
import java.awt.*;

public class Grafica extends JFrame {

    public Grafica() {

        setTitle("Ventane");
        setLayout(new BorderLayout());
        //Create panel de los botones
        JPanel p1 = new JPanel();
        p1.setLayout(new GridLayout(4, 3));

        //Se añaden los botones en el panel
        for(int i=1; i<=9; i++){
            p1.add(new JButton("" + i));
        }
        p1.add(new JButton("" + 0));
        p1.add(new JButton("Start"));
        p1.add(new JButton("Stop"));

        //Creamos el panel p2
        JPanel p2 = new JPanel();
        p2.setLayout(new BorderLayout());
        p2.add(new JTextField("Aquí el tiempo"),
                BorderLayout.NORTH);
        p2.add(p1, BorderLayout.CENTER);
        //Add p2 and  a button to  the frame
        add(p2, BorderLayout.EAST);
        add(new Button("Aquí la comida"),
                BorderLayout.CENTER);

        //Caracteristicas de la ventana
        //pack();
        setSize(400, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        Grafica frame = new Grafica();
    }
}
