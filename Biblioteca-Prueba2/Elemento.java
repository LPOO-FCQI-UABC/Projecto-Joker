import java.awt.*;
import javax.swing.*;

public abstract class Elemento extends JPanel{
    private int x;
    protected int y;
    private int width;
    private int height;
    private int nivel;
    private String imageFile;
    private PanelImage imgElemento;
    

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
    public int getWidth() {
        return width;
    }
    public void setWidth(int width) {
        this.width = width;
    }
    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    public int getNivel() {
        return nivel;
    }
    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
    public String getImageFile() {
        return imageFile;
    }
    public void setImageFile(String imageFile) {
        this.imageFile = imageFile;
    }
    public PanelImage getImgElemento() {
        return imgElemento;
    }
    public void setImgElemento(PanelImage imgElemento) {
        this.imgElemento = imgElemento;
    }
    public Elemento(int x,int y,int width,int height,int nivel,String imageFile,PanelImage imgElemento){
        this.x=x;
        this.y=y;
        this.width=width;
        this.height=height;
        this.nivel=nivel;
        this.imageFile=imageFile;
        this.imgElemento=imgElemento;
    }
    /*public void paint(Graphics g){
        imgElemento=new PanelImage();
        imgElemento.setImageFile(imageFile);
        imgElemento.setX(x);
        imgElemento.setY(y);
        imgElemento.paint(g);
    }*/
    public void paint(Graphics g) {
		Image image=new ImageIcon(imageFile).getImage();
        g.drawImage(image, x,y, getWidth(), getHeight(), this);
	}
    
}
