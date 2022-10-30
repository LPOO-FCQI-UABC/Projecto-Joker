import java.awt.*;
import javax.swing.*;
public class PanelImage extends JPanel{
    private String imageFile;
    private int x;//coordenada de pixeles despues del lado izquierdo del panel
    private int y;//coordenada de pixeles despues del lado superior del panel
    public String getImageFile() {
        return imageFile;
    }
    public void setImageFile(String imageFile) {
        this.imageFile = imageFile;
    }
    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }
   
	public void paint(Graphics g) {
		Image image=new ImageIcon(imageFile).getImage();
        g.drawImage(image, x,y, getWidth(), getHeight(), this);
	}
}