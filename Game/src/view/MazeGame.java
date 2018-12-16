package view;

import model.Tempat1;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Satrio Danurdoro(175314120) & Rama Eka Putranto(175314121)
 * 
 */

public class MazeGame extends javax.swing.JFrame {

    Tempat1 tempat;
    File file;

    public MazeGame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooser1 = new javax.swing.JFileChooser();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        perintahLabel = new javax.swing.JLabel();
        tempatPanel = new javax.swing.JPanel();
        langkahLabel = new javax.swing.JLabel();
        langkahText = new javax.swing.JLabel();
        UP = new javax.swing.JButton();
        DOWN = new javax.swing.JButton();
        LEFT = new javax.swing.JButton();
        RIGHT = new javax.swing.JButton();
        menuBar = new javax.swing.JMenuBar();
        gameMenu = new javax.swing.JMenu();
        mapMenu = new javax.swing.JMenu();
        map1MenuItem = new javax.swing.JMenuItem();
        map2MenuItem = new javax.swing.JMenuItem();
        map3MenuItem = new javax.swing.JMenuItem();
        exitMenuItem = new javax.swing.JMenuItem();

        jMenu1.setText("jMenu1");

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        perintahLabel.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 12)); // NOI18N
        perintahLabel.setText("PERINTAH");

        tempatPanel.setForeground(new java.awt.Color(240, 240, 240));

        javax.swing.GroupLayout tempatPanelLayout = new javax.swing.GroupLayout(tempatPanel);
        tempatPanel.setLayout(tempatPanelLayout);
        tempatPanelLayout.setHorizontalGroup(
            tempatPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 596, Short.MAX_VALUE)
        );
        tempatPanelLayout.setVerticalGroup(
            tempatPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 361, Short.MAX_VALUE)
        );

        langkahLabel.setText("Jumlah Langkah :");

        langkahText.setText("0");

        UP.setText("UP");
        UP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UPActionPerformed(evt);
            }
        });

        DOWN.setText("DOWN");
        DOWN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DOWNActionPerformed(evt);
            }
        });

        LEFT.setText("LEFT");
        LEFT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LEFTActionPerformed(evt);
            }
        });

        RIGHT.setText("RIGHT");
        RIGHT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RIGHTActionPerformed(evt);
            }
        });

        gameMenu.setText("Game");
        gameMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gameMenuActionPerformed(evt);
            }
        });

        mapMenu.setText("Map");
        mapMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        map1MenuItem.setText("Map 1");
        map1MenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                map1MenuItemActionPerformed(evt);
            }
        });
        mapMenu.add(map1MenuItem);

        map2MenuItem.setText("Map 2");
        map2MenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                map2MenuItemActionPerformed(evt);
            }
        });
        mapMenu.add(map2MenuItem);

        map3MenuItem.setText("Map 3");
        map3MenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                map3MenuItemActionPerformed(evt);
            }
        });
        mapMenu.add(map3MenuItem);

        gameMenu.add(mapMenu);

        exitMenuItem.setText("Exit");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        gameMenu.add(exitMenuItem);

        menuBar.add(gameMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(59, Short.MAX_VALUE)
                .addComponent(tempatPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(60, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(91, 91, 91)
                    .addComponent(langkahLabel)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(langkahText, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(perintahLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(16, 16, 16)
                    .addComponent(LEFT)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(DOWN, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(UP, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(RIGHT)
                    .addGap(417, 417, 417)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(49, Short.MAX_VALUE)
                .addComponent(tempatPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(langkahLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(langkahText, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(UP)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(DOWN)
                            .addContainerGap())
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(LEFT)
                                .addComponent(perintahLabel))
                            .addGap(28, 28, 28)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(RIGHT)
                        .addGap(26, 26, 26))))
        );

        tempatPanel.getAccessibleContext().setAccessibleName("");

        setSize(new java.awt.Dimension(731, 561));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitMenuItemActionPerformed

    private void gameMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gameMenuActionPerformed

    }//GEN-LAST:event_gameMenuActionPerformed

    private void map1MenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_map1MenuItemActionPerformed
        map1MenuItem.setSelected(true);
        map2MenuItem.setSelected(false);
        map3MenuItem.setSelected(false);
        tempatPanel.removeAll();
        tempat = new Tempat1(new File("map1.txt"));
        tempatPanel.add(tempat);
        tempat.setSize(tempat.getLebar(), tempat.getTinggi());
        int lebar = tempatPanel.getWidth();
        int tinggi = tempatPanel.getHeight();
        int x = (lebar - tempat.getWidth()) / 2;
        int y = (tinggi - tempat.getHeight()) / 2;
        tempat.setLocation(x, y);
        langkahText.setText("0");
        JOptionPane.showMessageDialog(null, "              WELCOME!\n           === MAP 1 ===");
    }//GEN-LAST:event_map1MenuItemActionPerformed

    private void map2MenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_map2MenuItemActionPerformed
        map1MenuItem.setSelected(false);
        map2MenuItem.setSelected(true);
        map3MenuItem.setSelected(false);
        tempatPanel.removeAll();
        tempat = new Tempat1(new File("map2.txt"));
        tempatPanel.add(tempat);
        tempat.setSize(tempat.getLebar(), tempat.getTinggi());
        int lebar = tempatPanel.getWidth();
        int tinggi = tempatPanel.getHeight();
        int x = (lebar - tempat.getWidth()) / 2;
        int y = (tinggi - tempat.getHeight()) / 2;
        tempat.setLocation(x, y);
        langkahText.setText("0");
        JOptionPane.showMessageDialog(null, "              WELCOME!\n           === MAP 2 ===");
    }//GEN-LAST:event_map2MenuItemActionPerformed

    private void map3MenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_map3MenuItemActionPerformed
        map1MenuItem.setSelected(false);
        map2MenuItem.setSelected(false);
        map3MenuItem.setSelected(true);
        map3MenuItem.setSelected(true);
        tempatPanel.removeAll();
        tempat = new Tempat1(new File("map3.txt"));
        tempatPanel.add(tempat);
        tempat.setSize(tempat.getLebar(), tempat.getTinggi());
        int lebar = tempatPanel.getWidth();
        int tinggi = tempatPanel.getHeight();
        int x = (lebar - tempat.getWidth()) / 2;
        int y = (tinggi - tempat.getHeight()) / 2;
        tempat.setLocation(x, y);
        langkahText.setText("0");
        JOptionPane.showMessageDialog(null, "              WELCOME!\n           === MAP 3 ===");
    }//GEN-LAST:event_map3MenuItemActionPerformed

    private void UPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UPActionPerformed
        // TODO add your handling code here:
        tempat.Naik();
        
        langkahText.setText(tempat.langkah());
        if(tempat.Completed()==true){
        new MazeGame().setVisible(true);}
    }//GEN-LAST:event_UPActionPerformed

    private void LEFTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LEFTActionPerformed
        // TODO add your handling code here:
        tempat.Kiri();
       
        langkahText.setText(tempat.langkah());
        if(tempat.Completed()==true){
        new MazeGame().setVisible(true);}
    }//GEN-LAST:event_LEFTActionPerformed

    private void RIGHTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RIGHTActionPerformed
        // TODO add your handling code here:
        tempat.Kanan();
        
        langkahText.setText(tempat.langkah());
        if(tempat.Completed()==true){
        new MazeGame().setVisible(true);}
    }//GEN-LAST:event_RIGHTActionPerformed

    private void DOWNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DOWNActionPerformed
        // TODO add your handling code here:
        tempat.Turun();
        
        langkahText.setText(tempat.langkah());
        if(tempat.Completed()==true){
        new MazeGame().setVisible(true);}
    }//GEN-LAST:event_DOWNActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MazeGame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DOWN;
    private javax.swing.JButton LEFT;
    private javax.swing.JButton RIGHT;
    private javax.swing.JButton UP;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenu gameMenu;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JLabel langkahLabel;
    private javax.swing.JLabel langkahText;
    private javax.swing.JMenuItem map1MenuItem;
    private javax.swing.JMenuItem map2MenuItem;
    private javax.swing.JMenuItem map3MenuItem;
    private javax.swing.JMenu mapMenu;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JLabel perintahLabel;
    private javax.swing.JPanel tempatPanel;
    // End of variables declaration//GEN-END:variables

  
}
