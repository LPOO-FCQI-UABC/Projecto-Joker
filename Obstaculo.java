package Prueba1;

import javax.swing.*;
import java.awt.*;

public class Obstaculo extends JComponent{
    private Image obstaculo;
    private int ancho=10;
    private int alto=15;
    private int diametro;
    public void setAncho(int ancho){
        this.ancho=ancho;
    }
    public int getAncho(){
        return ancho;
    }
    public void setAlto(int alto){
        this.alto=alto;
    }
    public int getAlto(){
        return alto;
    }
    public void setDiametro(int diametro){
        this.diametro=diametro;
    }
    public int getDiametro(){
        return diametro;
    }
    public Obstaculo(int ancho, int alto, int diametro){
        this.ancho=ancho;
        this.alto=alto;
        this.diametro=diametro;
        setPreferredSize(new Dimension(ancho, alto));
        
    }

    public void setObstaculo(String name){
        obstaculo = new ImageIcon(this.getClass().getResource(name)).getImage();

    }
    public Image getObstaculo(){
        return obstaculo;
    }
}
