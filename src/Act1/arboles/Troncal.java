package Act1.arboles;

import java.awt.BorderLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;

public class Troncal {

    public static void main(String[] args) {
        JFrame frame = new JFrame("A R B O L E S");
        //frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent evt) {
                System.exit(0);
            }
        });
        frame.getContentPane().add(new Ramal(), BorderLayout.CENTER);
        frame.setSize(250, 500);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }
    /*
Integrantes:
Adán Gerardo Trejo Garcia – 21550385
Iván Rogelio García Ortiz - 21550379
Cesar Alejandro Cervantes Legarreta - 21550871
*/
}
