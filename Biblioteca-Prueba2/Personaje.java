import java.awt.event.KeyListener;
import java.awt.Component;
import java.awt.event.KeyEvent;
import javax.swing.JPanel;
import javax.swing.JLabel;
public class Personaje extends Elemento {
    private JLabel prueba = new JLabel("Hola mundo");
    private int vida;
    private int puntos;
    private int velocidad;
    private String nombre;
    public int getVida() {
        return vida;
    }
    public void setVida(int vida) {
        this.vida = vida;
    }
    public int getPuntos() {
        return puntos;
    }
    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }
    public int getVelocidad() {
        return velocidad;
    }
    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Personaje(int x, int y, int width, int height, int nivel, String imageFile, int puntos, int velocidad, PanelImage imgElemento,String nombre) {
        super(x,y,width,height,nivel,imageFile,imgElemento);

        this.puntos = puntos;
        this.velocidad = velocidad;
        this.nombre = nombre;
    }
   public Personaje(int x, int y, int width, int height, int nivel, String imageFile, PanelImage imgElemento,int puntos, int velocidad) {
        super(x,y,width,height,nivel,imageFile,imgElemento);
        this.puntos = puntos;
        this.velocidad = velocidad;
    }
    /*  public void mover(int x, int y){
        this.setX(this.getX()+x);
        this.setY(this.getY()+y);
    }*/
    public void up() {
        this.setY(this.getY()+5);
        
    }

    public void down() {
        this.setY(this.getY()-5); 
    }

    public void left() {
        this.setX(this.getX()-5); 
    }

    public void right() {
        this.setX(this.getX()+5);
    }
    public void mostrarElemento(){
        this.getImgElemento().add(this.getPrueba());
        this.getImgElemento().repaint();
    }
    private Component getPrueba() {
        return null;
    }
        
}
