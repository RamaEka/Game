/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Satrio Danurdoro(175314120) & Rama Eka Putranto(175314121)
 * 
 */
public class Tempat1 extends JPanel {

    private ArrayList Semak = new ArrayList();
    private ArrayList tempat = new ArrayList();
    private Player player;
    private Finish finish;
    private int lebar = 0;
    private int tinggi = 0;
    private int space = 40;
    private File Alamatpeta;
    private ArrayList<String> Allperintah = new ArrayList<String>();
    private int langkah=0;

    public Tempat1(File file) {
        bacaKonfigurasi(file);
    }

    public void bacaKonfigurasi(File file) {
        try {
            if (file != null) {
                FileInputStream input = new FileInputStream(file);
                Alamatpeta = file;
                String hasilBaca = "";
                int posisiX = 0;
                int posisiY = 0;
                Bush bush;
                int data;
                while ((data = input.read()) != -1) {
                    char item = (char) data;
                    if (item == '\n') {
                        hasilBaca = hasilBaca + (char) data;
                        posisiY += space;
                        lebar = posisiX;
                        posisiX = 0;
                    } else if (item == '#') {
                        hasilBaca = hasilBaca + (char) data;
                        bush = new Bush(posisiX, posisiY);
                        Semak.add(bush);
                        posisiX += space;
                    } else if (item == 'o') {
                        hasilBaca = hasilBaca + (char) data;
                        finish = new Finish(posisiX, posisiY);
                        posisiX += space;
                    } else if (item == '@') {
                        hasilBaca = hasilBaca + (char) data;
                        player = new Player(posisiX, posisiY);
                        posisiX += space;
                    } else if (item == '.') {
                        hasilBaca = hasilBaca + (char) data;
                        posisiX += space;
                    }
                    tinggi = posisiY;
                }
            }
        } catch (IOException ex) {
            Logger.getLogger(Tempat1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }



    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.fillRect(0, 0, this.getLebar(), this.getTinggi());
        tempat.addAll(Semak);
        tempat.add(finish);
        tempat.add(player);
        for (int i = 0; i < tempat.size(); i++) {
            if (tempat.get(i) != null) {
                Sel item = (Sel) tempat.get(i);
                g.drawImage(item.getImage(), item.getBaris(), item.getKolom(), this);
            }
        }
    }

    public void Naik() {
        
                

                        if (cekObjekTabrakTembokAtas(player)) {
                            return;
                        } else {
                            player.Pindah(0, -space);
                            repaint();
                        }
                        langkah++;

                    }
    public void Turun(){
    if (cekObjekTabrakTembokBawah(player)) {
                            return;
                        } else {
                            player.Pindah(0, space);
                            repaint();
                        }
    langkah++;
                    }    
     public void Kanan(){
     if (cekObjekTabrakTembokKanan(player)) {
                            return;
                        } else {
                            player.Pindah(space, 0);
                            repaint();
                        }
     langkah++;
                    }
     public void Kiri(){
        if (cekObjekTabrakTembokKiri(player)) {
                            return;
                        } else {
                            player.Pindah(-space, 0);
                            repaint();
                        }
        langkah++;
                    }
                

    private boolean cekObjekTabrakTembokKiri(Sel player) {
        boolean bantu = false;
        
            for (int i = 0; i < Semak.size(); i++) {
                Bush semak = (Bush) Semak.get(i);
                if (player.PosisiKiri(semak)) {
                    bantu = true;
                    break;
                }
            }
            return bantu;
    } 
private boolean cekObjekTabrakTembokKanan(Sel player) {
        boolean bantu = false;
        
            for (int i = 0; i < Semak.size(); i++) {
                Bush semak = (Bush) Semak.get(i);
                if (player.PosisiKanan(semak)) {
                    bantu = true;
                    break;
                }
                
            }return bantu;
        }
private boolean cekObjekTabrakTembokAtas(Sel player) {
        boolean bantu = false;
for (int i = 0; i < Semak.size(); i++) {
                Bush bush = (Bush) Semak.get(i);
                if (player.PosisiAtas(bush)) {
                    bantu = true;
                    break;
                }
            }
return bantu;
        } 
private boolean cekObjekTabrakTembokBawah(Sel player) {
        boolean bantu = false;
for (int i = 0; i < Semak.size(); i++) {
                Bush semak = (Bush) Semak.get(i);
                if (player.PosisiBawah(semak)) {
                    bantu = true;
                    break;
                }
            }
return bantu;
        }

public String langkah(){
    String tampil=""+langkah;
    return tampil;
}
    public boolean Completed() {
        if (player.getBaris() == finish.getBaris() && player.getKolom() == finish.getKolom()) {
            JOptionPane.showMessageDialog(null, "Selamat anda berhasil menyelesaikan game pada map ini"
                    + "\n dengan jumlah langkah: "+langkah);
            return true;
        }return false;
    }


    public int getLebar() {
        return this.lebar;
    }

    public int getTinggi() {
        return this.tinggi;
    }

    public Finish getFinish() {
        return finish;
    }

    public void setFinish(Finish finish) {
        this.finish = finish;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Finish getGawang() {
        return finish;
    }

    public void setGawang(Finish gawang) {
        this.finish = gawang;
    }

    public ArrayList getTempat() {
        return tempat;
    }

    public void setTempat(ArrayList tempat) {
        this.tempat = tempat;
    }

    public ArrayList getAllperintah() {
        return Allperintah;
    }

    public void setAllperintah(ArrayList Allperintah) {
        this.Allperintah = Allperintah;
    }



}
