//swing project for map
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import javax.swing.JFrame;
public class Mapa{
    private JFrame mapa=new JFrame();
    private PanelImage fondo=new PanelImage();
    private int cantObstaculos= 0;
    private int cantPersonajes= 0;
    private Random r = new Random();
    private ArrayList<Obstaculo> obstaculos = new ArrayList<Obstaculo>();
    private ArrayList<Personaje> personajes = new ArrayList<Personaje>();

    private int x;
    private int y;
    private int width;
    private int height;
    private int nivel;
    public JFrame getMapa() {
        return mapa;
    }

    public void setMapa(JFrame mapa) {
        this.mapa = mapa;
    }
    public PanelImage getFondo() {
        return fondo;
    }

    public void setFondo(PanelImage fondo) {
        this.fondo = fondo;
    }

    public Random getR() {
        return r;
    }

    public void setR(Random r) {
        this.r = r;
    }
    public int getCantObstaculos() {
        return cantObstaculos;
    }

    public void setCantObstaculos(int cantObstaculos) {
        this.cantObstaculos = cantObstaculos;
    }

    public int getCantPersonajes() {
        return cantPersonajes;
    }

    public void setCantPersonajes(int cantPersonajes) {
        this.cantPersonajes = cantPersonajes;
    }

    public ArrayList<Obstaculo> getObstaculos() {
        return obstaculos;
    }

    public void setObstaculos(ArrayList<Obstaculo> obstaculos) {
        this.obstaculos = obstaculos;
    }

    public ArrayList<Personaje> getPersonajes() {
        return personajes;
    }

    public void setPersonajes(ArrayList<Personaje> personajes) {
        this.personajes = personajes;
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
    

    public Mapa(int x,int y,int width,int height,int nivel,String imageFile,PanelImage imgElemento){
        this.x=x;
        this.y=y;
        this.width=width;
        this.height=height;
        this.nivel=nivel;
        this.fondo.setImageFile(imageFile);
        //this.fondo.setImgElemento(imgElemento);
        mapa.setBounds(x,y,width,height);
        mapa.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mapa.setVisible(true);
    }
    public void createObstaculos(PanelImage img){
        for(int i=0;i<cantObstaculos;i++){
            int x=r.nextInt(800);
            int y=r.nextInt(600);
            Obstaculo obstaculo = new Obstaculo(x,y,50,50,1,"",img);
            obstaculos.add(obstaculo);
            
        }
    }
    public void createPersonajes(PanelImage img){
        for(int i=0;i<cantPersonajes;i++){
            int x=r.nextInt(800);
            int y=r.nextInt(600);
            Personaje personaje = new Personaje(x,y,50,50,1,"",img,0,0);
            personajes.add(personaje);
            
        }
    }
    public void posicionElementosAleatorio(){
        int x=0;
        int y=0;
        int width=0;
        int height=0;
        for(int i=0;i<obstaculos.size();i++){
            x=r.nextInt(1000);
            y=r.nextInt(1000);
            width=r.nextInt(1000);
            height=r.nextInt(1000);
            obstaculos.get(i).setX(x);
            obstaculos.get(i).setY(y);
            obstaculos.get(i).setWidth(width);
            obstaculos.get(i).setHeight(height);
        }
        for(int i=0;i<personajes.size();i++){
            x=r.nextInt(1000);
            y=r.nextInt(1000);
            width=r.nextInt(1000);
            height=r.nextInt(1000);
            personajes.get(i).setX(x);
            personajes.get(i).setY(y);
            personajes.get(i).setWidth(width);
            personajes.get(i).setHeight(height);
        }

    }

    public void dimenisonesAleatorias(int nivel){
        if(nivel==1){
            mapa.setSize(r.nextInt(250,300),r.nextInt(250,300));
        }else if (nivel==2){
            mapa.setSize(r.nextInt(200,250),r.nextInt(200,250));
        }else if(nivel==3){
            mapa.setSize(r.nextInt(150,200),r.nextInt(150,200));
        }
    }
    public void dimenisonesFijas(int x, int y){
        mapa.setSize(x,y);
    }
    public void agregarObstaculo(Obstaculo obstaculo){
        obstaculos.add(obstaculo);
        cantObstaculos++;
    }
    public void agregarPersonaje(Personaje personaje){
        personajes.add(personaje);
        cantPersonajes++;
    }
    public void eliminarObstaculo(Obstaculo obstaculo){
        obstaculos.remove(obstaculo);
        cantObstaculos--;
    }
    public void eliminarPersonaje(Personaje personaje){
        personajes.remove(personaje);
        cantPersonajes--;
    }
    public void mostrarPersonajes(){
        for(int i=0;i<personajes.size();i++){
          //  System.out.println(personajes.get(i).getNombre());
        }
    }
    public void mostrarMapa(){
        mapa.add(fondo);
        mapa.setVisible(true);
    }
    public void mostrarElementos(){
        for(int i=0;i<obstaculos.size();i++){
            obstaculos.get(i).mostrarElemento();
        }
        for(int i=0;i<personajes.size();i++){
            personajes.get(i).mostrarElemento();
        }
    }

}
