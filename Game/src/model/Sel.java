/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.awt.Color;
import java.awt.Image;

/**
 *
 * @author user only
 */
public class Sel {
    private int baris;
    private int kolom;
    private Image image;
    private int space = 40;

    public Sel(int x, int y) {
        this.baris = x;
        this.kolom = y;
    }

    public int getBaris() {
        return baris;
    }

    public void setBaris(int x) {
        this.baris = x;
    }

    public int getKolom() {
        return kolom;
    }

    public void setKolom(int y) {
        this.kolom = y;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public boolean PosisiKiri(Sel Ob) {
        if (((this.getBaris() - space) == Ob.getBaris()) && (this.getKolom() == Ob.getKolom())) {
            return true;
        } else {
            return false;
        }
    }

    public boolean PosisiKanan(Sel Ob) {
        if (((this.getBaris() + space) == Ob.getBaris()) && (this.getKolom() == Ob.getKolom())) {
            return true;
        } else {
            return false;
        }
    }

    public boolean PosisiAtas(Sel Ob) {
        if (((this.getKolom() - space) == Ob.getKolom()) && (this.getBaris() == Ob.getBaris())) {
            return true;
        } else {
            return false;
        }
    }

    public boolean PosisiBawah(Sel Ob) {
        if (((this.getKolom() + space) == Ob.getKolom()) && (this.getBaris() == Ob.getBaris())) {
            return true;
        } else {
            return false;
        }
    }

}
