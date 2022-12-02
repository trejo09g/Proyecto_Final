/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Act1.arboles;

import javax.swing.tree.DefaultMutableTreeNode;

/**
 *
 * @author Hp
 */
public class Rama {
    DefaultMutableTreeNode r;
  public Rama( String datos[] ) {
    r = new DefaultMutableTreeNode( datos[0] );
    for( int i=1; i < datos.length; i++ )
      r.add( new DefaultMutableTreeNode( datos[i] ) );
  }
  
  public DefaultMutableTreeNode node() { 
    return( r ); 
  }
}
