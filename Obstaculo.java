package Prueba1;

import javax.swing.*;
import java.awt.*;

public class Obstaculo extends JComponent{
    private Image obstaculo;
    private int ancho=10;
    private int alto=15;
    private int diametro;
    private float x, y;
    private float vx, vy;
    // private boolean arriba, abajo, izquierda, derecha;
    public Obstaculo(int ancho,int alto){
        this.ancho=ancho;
        this.alto=alto;
        setPreferredSize(new Dimension(ancho, alto));
//Lugar donde aparece el obstaculo al comenzar la ejecución del programa
        x = 10;
        y = 20;
    }
    public Obstaculo(){
        setPreferredSize(new Dimension(ancho, alto));
    }

    public void setObstaculo(String name){
        obstaculo = new ImageIcon(this.getClass().getResource(name)).getImage();

    }
    public Image getObstaculo(){
        return obstaculo;
    }
}
