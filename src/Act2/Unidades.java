package Act2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

public class Unidades extends JPanel {

    String contenido[][] = {
        {"Introduccion a la estructura de datos", "Clasificación de la estructura de datos", "Tipos de Datos Abstractos", "Manejo de memoria" , "Análisis de algoritmo"},
        {"Recursividad", "Definición", "Procedimientos", "Ejemplos"},
        {"Estructuras liniales", "Pilas", "Listas", "Colas"},
        {"Estructuras NO liniales", "Arboles", "Grafos", "Ejemplos"},
        {"Métodos de ordenamiento", "Burbuja", "QuickSort", "Radix"},
        {"Métodos de Búsqueda", "Secuencial", "Binaria", "Hash"},};

      static int i=0;
  DefaultMutableTreeNode mat,subt,selec;
  JTree materia;
  DefaultTreeModel modelo;
  
  public Unidades() {
    setLayout( new BorderLayout() );
    mat = new DefaultMutableTreeNode( "CONTENIDO" );
    materia = new JTree( mat );
    add( new JScrollPane( materia ),BorderLayout.CENTER );
    modelo =(DefaultTreeModel)materia.getModel();
    JButton botonPrueba = new JButton( "Pulsame" );
    botonPrueba.addActionListener( new ActionListener() {
      public void actionPerformed( ActionEvent evt ) {
        if( i < contenido.length ) {
          subt = new Temas( contenido[i++] ).node();
          selec = (DefaultMutableTreeNode)
            materia.getLastSelectedPathComponent();
          if( selec == null ) 
	    selec = mat;
	  modelo.insertNodeInto( subt,selec,0 );
        }
      }
    } );
    
    botonPrueba.setBackground( Color.blue );
    botonPrueba.setForeground( Color.white );
    JPanel panel = new JPanel();
    panel.add( botonPrueba );
    add( panel,BorderLayout.SOUTH );
}
}
