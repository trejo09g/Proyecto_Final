package Act2;

import javax.swing.tree.DefaultMutableTreeNode;

public class Temas {
    DefaultMutableTreeNode o_0;
  public Temas( String contenido[] ) {
    o_0 = new DefaultMutableTreeNode( contenido[0] );
    for( int i=1; i < contenido.length; i++ )
      o_0.add( new DefaultMutableTreeNode( contenido[i] ) );
  }
  public DefaultMutableTreeNode node() { 
    return( o_0 ); 
  }    
}
