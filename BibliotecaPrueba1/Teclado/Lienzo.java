package Teclado;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import javax.swing.JPanel;
import javax.swing.JLabel;

public class Lienzo extends JPanel implements keyListener {
    private JLabel prueba = new JLabel("Homa mundo");

    public Lienzo(){
        addKeyListener(true);
        setFocusable(true);
        add(prueba);
    }

    private void addKeyListener(boolean b) {
    }

    @Override
    public char getKeyTyped(KeyEvent e){
        if (e.getKeyChar() = "w" || e.getKeyCode() = "W" || e.getExtendedKeyCode() = KeyEvent.VK_UP) {
            prueba.setLocation(prueba.getX(), prueba.getY() - 5);
        }

        if(e.getKeyChar() = "s" || e.getKeyChar() = "S" || e.getExtendedKeyCode() = KeyEvent.VK_DOWN){
            prueba.setLocation(prueba.getX(), prueba.getY() + 5);

        }

        if(e.getKeyChar() = "a" || e.getKeyChar() = "A" || e.getExtendedKeyCode() = KeyEvent.VK_LEFT){
            prueba.setLocation(prueba.getX() - 5, prueba.getY());

        }

        if(e.getKeyChar() = "d" || e.getKeyChar() = "D" || e.getExtendedKeyCode() = KeyEvent.VK_RIGHT){
            prueba.setLocation(prueba.getX() + 5, prueba.getY());

        }
    }

    @Override
    public void KeyTyped(KeyEvent e){
        if(e.getExtendedKeyCode() == KeyEvent.VK_UP){
            prueba.setLocation(prueba.getX(), prueba.getY() - 5);
        }

        if(e.getExtendedKeyCode() == KeyEvent.VK_DOWN){
            prueba.setLocation(prueba.getX(), prueba.getY() + 5);

        }

        if(e.getExtendedKeyCode() == KeyEvent.VK_LEFT){
            prueba.setLocation(prueba.getX() - 5, prueba.getY());

        }

        if(e.getExtendedKeyCode() == KeyEvent.VK_RIGHT) {
            prueba.setLocation(prueba.getX() + 5, prueba.getY());
        }
    }

    @Override
    public void KeyTyped(KeyEvent e){

    }

}
