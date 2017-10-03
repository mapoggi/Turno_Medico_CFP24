
package controladores;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 *
 * @author PC1
 */
public class ControladorBienvenidoRegistrar implements MouseListener{

    @Override
    public void mouseClicked(MouseEvent me) {
        
        if (me.getButton() == 1){
          System.out.println("apretado");  
        }
            
        
    }

    @Override
    public void mousePressed(MouseEvent me) {
    }

    @Override
    public void mouseReleased(MouseEvent me) {
    }

    @Override
    public void mouseEntered(MouseEvent me) {
    }

    @Override
    public void mouseExited(MouseEvent me) {
    }
    
}
