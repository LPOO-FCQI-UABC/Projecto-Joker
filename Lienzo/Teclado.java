package Lienzo;
import javax.swing.*;

public class Teclado {
    public static void main(String[] args){
    JFrame ventana = new JFrame("Teclado");
    ventana.add(new Teclado.Lienzo());
    ventana.setDefaultCloseOperation(3);
    ventana.setSize(300,300);
    ventana.setVisible(true);

    }
}
