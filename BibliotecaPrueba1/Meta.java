package Prueba1;

import javax.swing.*;
import java.awt.*;

public class Meta extends JComponent{

    private Image meta;
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
    public Meta(int ancho, int alto, int diametro){
        this.ancho=ancho;
        this.alto=alto;
        this.diametro=diametro;
        setPreferredSize(new Dimension(ancho, alto));

    }

    public void setMeta(String name){
        meta = new ImageIcon(this.getClass().getResource(name)).getImage();
    }
    public Image getMeta(){
        return meta;
    }
}
