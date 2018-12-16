/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.awt.Image;
import java.net.URL;
import javax.swing.ImageIcon;

/**
 *
 * @author Satrio Danurdoro(175314120) & Rama Eka Putranto(175314121)
 * 
 */
public class Player extends Sel {

    public Player(int x, int y) {
        super(x, y);

        URL loc = this.getClass().getResource("player.png");
        ImageIcon pemain = new ImageIcon(loc);
        Image image = pemain.getImage();
        this.setImage(image);
    }

    public void Pindah(int x, int y) {
        int posX = this.getBaris() + x;
        int posY = this.getKolom() + y;
        this.setBaris(posX);
        this.setKolom(posY);
    }

    
}

