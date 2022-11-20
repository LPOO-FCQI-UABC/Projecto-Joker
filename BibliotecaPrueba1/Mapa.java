package Prueba1;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Random;
import java.awt.event.*;

public class Mapa extends JComponent {
    private JFrame mapa = new JFrame("GAMES");
    private Obstaculo obstaculo;
    private ArrayList<Obstaculo> cantObstaculos=new ArrayList<Obstaculo>();
    private Random random=new Random();

    public void setMapa(JFrame mapa) {
        this.mapa = mapa;
    }

    public JFrame getMapa() {
        return mapa;
    }
    public void setObstaculo(Obstaculo obstaculo){
        this.obstaculo =obstaculo;

    }
    public Obstaculo getObstaculo(){
        return obstaculo;
    }
    public ArrayList<Obstaculo> getCantObstaculos(){
        return cantObstaculos;
    }
    public void dimenisonesAleatorias(int nivel){
        if(nivel==1){
            mapa.setSize(random.nextInt(250,300),random.nextInt(250,300));
        }else if (nivel==2){
            mapa.setSize(random.nextInt(200,250),random.nextInt(200,250));
        }else if(nivel==3){
            mapa.setSize(random.nextInt(150,200),random.nextInt(150,200));
        }
    }
    public void dimenisonesFijas(int x, int y){
        mapa.setSize(x,y);
    }
    public void setBackgroundImage(Image bg){
        mapa.setIconImage(bg);
    }
    public void addObstaculosAleatoriamente(int nivel){
        int x,y;
        if(nivel==1){
            x=random.nextInt(250,300);
            y=random.nextInt(250,300);
            for(int i=0;i<=random.nextInt(0,10);i++){
                mapa.getContentPane().add(obstaculo);
                cantObstaculos.add(obstaculo);
                mapa.pack();
                mapa.setVisible(true);
                mapa.setLocation(x,y);
            }
        }else if (nivel==2){
            for(int i=0;i<=random.nextInt(10,15);i++){
                mapa.getContentPane().add(obstaculo);
                cantObstaculos.add(obstaculo);
                mapa.pack();
                mapa.setVisible(true);
            }
        }else if(nivel==3){
            for(int i=0;i<=random.nextInt(15,20);i++){
                mapa.getContentPane().add(obstaculo);
                cantObstaculos.add(obstaculo);
                mapa.pack();
                mapa.setVisible(true);
            }
        }
    }
    public void addObstaculos(int cant,int x,int y){
        for(int i=0;i<=cant;i++){
            mapa.getContentPane().add(obstaculo);
            cantObstaculos.add(obstaculo);
            mapa.pack();
            mapa.setVisible(true);
            mapa.setLocation(x,y);
        }

    }

}
