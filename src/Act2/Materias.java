package Act2;

import Act1.arboles.Ramal;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;

public class Materias {

    public static void main(String[] args) {
        
        JFrame mate = new JFrame("T E M A R I O");
        mate.setResizable(false);
        mate.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent evt) {
                System.exit(0);
            }
        });
        mate.getContentPane().add(new Unidades(), BorderLayout.CENTER);
        mate.setSize(310, 500);
        Container c = mate.getContentPane();
        c.setBackground(Color.red);
        mate.setVisible(true);
        mate.setLocationRelativeTo(null);
    }
/*
Integrantes:
Adán Gerardo Trejo Garcia – 21550385
Iván Rogelio García Ortiz - 21550379
Cesar Alejandro Cervantes Legarreta - 21550871
*/
}
