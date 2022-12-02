/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Act1.arboles;

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

/**
 *
 * @author 980035530
 */
public class Ramal extends JPanel{
    String datos[][] = {
    { "Colores","Rojo","Verde","Azul" },
    { "Sabores","Salado","Dulce","Amargo" },
    { "Longitud","Corta","Media","Larga" },
    { "Intensidad","Alta","Media","Baja" },
    { "Temperatura","Alta","Media","Baja" },
    { "Volumen","Alto","Medio","Bajo" },
  };
  static int i=0;
  DefaultMutableTreeNode raiz,rama,seleccion;
  JTree arbol;
  DefaultTreeModel modelo;
  
  public Ramal() {
    setLayout( new BorderLayout() );
    raiz = new DefaultMutableTreeNode( "raiz" );
    arbol = new JTree( raiz );
    // Se añade el árbol y se hace sobre un ScrollPane, para
    // que se controle automáticamente la longitud del árbol
    // cuando está desplegado, de forma que aparecerá una
    // barra de desplazamiento para poder visualizarlo en su
    // totalidad
    add( new JScrollPane( arbol ),BorderLayout.CENTER );
    // Se obtiene el modelo del árbol
    modelo =(DefaultTreeModel)arbol.getModel();
    // Y se añade el botón que va a ir incorporando ramas
    // cada vez que se pulse
    JButton botonPrueba = new JButton( "Pulsame" );
    botonPrueba.addActionListener( new ActionListener() {
      public void actionPerformed( ActionEvent evt ) {
        if( i < datos.length ) {
          rama = new Rama( datos[i++] ).node();
          // Control de la útlima selección realizada
          seleccion = (DefaultMutableTreeNode)
            arbol.getLastSelectedPathComponent();
          if( seleccion == null ) 
	    seleccion = raiz;
	  // El modelo creará el evento adecuado, y en respuesta
	  // a él, el árbol se actualizará automáticamente
          modelo.insertNodeInto( rama,seleccion,0 );
        }
      }
    } );
    
    // Cambio del color del botón
    botonPrueba.setBackground( Color.blue );
    botonPrueba.setForeground( Color.white );
    // Se crea un panel para contener al botón
    JPanel panel = new JPanel();
    panel.add( botonPrueba );
    add( panel,BorderLayout.SOUTH );
}
}
