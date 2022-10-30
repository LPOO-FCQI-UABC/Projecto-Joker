import java.awt.Component;

import javax.swing.*;

public class Obstaculo extends Elemento{
    public Obstaculo(int x, int y, int width, int height, int nivel, String imageFile, PanelImage imgElemento) {
        super(x,y,width,height,nivel,imageFile, imgElemento);
    }
    public void mostrarElemento(){
        this.getImgElemento().add(this.getPrueba());
        this.getImgElemento().repaint();
    }
    private Component getPrueba() {
        return null;
    }
    
    
    /*
     * 
import com.almasb.fxgl.core.math.FXGLMath;
import com.almasb.fxgl.entity.component.Component;
import javafx.geometry.Point2D;

import static com.almasb.fxgl.dsl.FXGL.*;

public class CloudComponent extends Component {

    private final Point2D direction = new Point2D(FXGLMath.random(-1D, 1D), FXGLMath.random(-1D, 1D));

    @Override
    public void onUpdate(double tpf) {
        entity.translate(direction.multiply(3));
        checkForBounds();
    }

    private void checkForBounds() {
        if (entity.getX() < 0) {
            remove();
        }
        if (entity.getX() >= getAppWidth()) {
            remove();
        }
        if (entity.getY() < 0) {
            remove();
        }
        if (entity.getY() >= getAppHeight()) {
            remove();
        }
    }

    public void remove() {
        entity.removeFromWorld();
    }
}
Footer
© 2022 GitHub, Inc.
Footer navigation
Terms
Privacy
S
    */
}
