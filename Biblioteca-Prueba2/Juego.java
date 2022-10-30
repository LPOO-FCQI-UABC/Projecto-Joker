import java.util.ArrayList;

//make map with elements

public class Juego{
    //make main class
    public static void main(String[] args){
        Mapa mapa = new Mapa(0,0,800,600,1,"",null);
        mapa.setCantObstaculos(12);
        PanelImage imgObstaculo = new PanelImage();
        imgObstaculo.setImageFile("obstaculo.png");
        mapa.createObstaculos(imgObstaculo);

        mapa.setCantPersonajes(4);
        PanelImage imgPersonaje = new PanelImage();
        imgPersonaje.setImageFile("personaje.png");
        mapa.createPersonajes(imgPersonaje);
    }
    
}
