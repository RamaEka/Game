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
public class Bush extends Sel {

    public Bush(int x, int y) {
        super(x, y);

        URL loc = this.getClass().getResource("bush.png");
        ImageIcon tembok = new ImageIcon(loc);
        Image image = tembok.getImage();
        this.setImage(image);
    }
}
