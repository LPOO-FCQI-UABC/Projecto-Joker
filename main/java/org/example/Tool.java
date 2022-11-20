package main.java.org.example;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.awt.Point;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import javax.imageio.ImageIO;

public class Tool {

    // image that represents the coin's position on the board
    private BufferedImage image;

    // current position of the coin on the board grid
    private Point pos;
    private int x;
    private int y;
    private String type;


    public Tool(int x, int y,String imageTools) {
        // load the assets and image
        loadImage(imageTools);
        type=imageTools;//name of the image of the tool
        this.x=x;
        this.y=y;

        // initialize the state
        pos = new Point(x, y);
    }
    public Tool(int x, int y) {
        // load the assets

        this.x=x;
        this.y=y;

        // initialize the state
        pos = new Point(x, y);
    }


    private void loadImage(String imageTools) {
        try {
            image = ImageIO.read(new File("images/"+imageTools+".png"));
        } catch (IOException exc) {
            System.out.println("Error opening image file: " + exc.getMessage());
        }
    }

    public void draw(Graphics g, ImageObserver observer) {
        g.drawImage(
                image,
                pos.x * Board.TILE_SIZE,
                pos.y * Board.TILE_SIZE,
                observer
        );
    }

    public Point getPos() {
        return pos;
    }
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    public String getType() {
        return type;
    }
}

