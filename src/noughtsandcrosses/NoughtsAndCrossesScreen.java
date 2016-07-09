/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package noughtsandcrosses;

import java.util.ArrayList;
import javax.swing.JButton;
import java.awt.Color;

/**
 *
 * @author Kalok Chan
 */
public class NoughtsAndCrossesScreen extends javax.swing.JFrame {

    /**
     * Creates new form NoughtsAndCrossesScreen
     */
    private int turn = 1;
    private ArrayList<JButton> listButtons = new ArrayList<JButton>();
    private char[][] grid = new char[3][3];

    public NoughtsAndCrossesScreen() {

        this.setTitle("Noughts and Crosses");
        setUp();
        initComponents();

        this.setVisible(true);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setPreferredSize(new java.awt.Dimension(150, 150));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setPreferredSize(new java.awt.Dimension(150, 150));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setPreferredSize(new java.awt.Dimension(150, 150));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setPreferredSize(new java.awt.Dimension(150, 150));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(255, 255, 255));
        jButton5.setPreferredSize(new java.awt.Dimension(150, 150));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(255, 255, 255));
        jButton6.setPreferredSize(new java.awt.Dimension(150, 150));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setBackground(new java.awt.Color(255, 255, 255));
        jButton7.setPreferredSize(new java.awt.Dimension(150, 150));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setBackground(new java.awt.Color(255, 255, 255));
        jButton8.setPreferredSize(new java.awt.Dimension(150, 150));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setBackground(new java.awt.Color(255, 255, 255));
        jButton9.setPreferredSize(new java.awt.Dimension(150, 150));
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(53, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(41, 41, 41))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void setUp() {
        listButtons.add(jButton1);
        listButtons.add(jButton2);
        listButtons.add(jButton3);
        listButtons.add(jButton4);
        listButtons.add(jButton5);
        listButtons.add(jButton6);
        listButtons.add(jButton7);
        listButtons.add(jButton8);
        listButtons.add(jButton9);

        grid[0][0] = 'a';
        grid[0][1] = 'b';
        grid[0][2] = 'c';
        grid[1][0] = 'd';
        grid[1][1] = 'e';
        grid[1][2] = 'f';
        grid[2][0] = 'g';
        grid[2][1] = 'h';
        grid[2][2] = 'j';

        int counter = 0;
        /**
         *
         * no idea why below not working while (counter < 10) {
         * System.out.println(counter);
         * listButtons.get(counter).setBackground(Color.BLACK);
         * listButtons.get(counter).setSize(30, 30);
         *
         * counter = counter + 1; }
         */

    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (!(jButton1.getText().equals("X") || jButton1.getText().equals("O"))) {
            if (turn == 1) {

                jButton1.setText("X");
                grid[0][0] = 'X';
                turn = 2;
            } else {
                jButton1.setText("O");
                grid[0][0] = 'O';
                turn = 1;
            }
        }
        checkWinner();

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (!(jButton2.getText().equals("X") || jButton2.getText().equals("O"))) {
            if (turn == 1) {

                jButton2.setText("X");
                grid[0][1] = 'X';
                turn = 2;
            } else {
                jButton2.setText("O");
                grid[0][1] = 'O';
                turn = 1;
            }
        }
        checkWinner();

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if (!(jButton3.getText().equals("X") || jButton3.getText().equals("O"))) {
            if (turn == 1) {

                jButton3.setText("X");
                grid[0][2] = 'X';
                turn = 2;
            } else {
                jButton3.setText("O");
                grid[0][2] = 'O';
                turn = 1;
            }
        }
        checkWinner();

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if (!(jButton4.getText().equals("X") || jButton4.getText().equals("O"))) {
            if (turn == 1) {

                jButton4.setText("X");
                grid[1][0] = 'X';
                turn = 2;
            } else {
                jButton4.setText("O");
                grid[1][0] = 'O';
                turn = 1;
            }
        }
        checkWinner();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        if (!(jButton5.getText().equals("X") || jButton5.getText().equals("O"))) {
            if (turn == 1) {

                jButton5.setText("X");
                grid[1][1] = 'X';
                turn = 2;
            } else {
                jButton5.setText("O");
                grid[1][1] = 'O';
                turn = 1;
            }
        }
        checkWinner();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        if (!(jButton6.getText().equals("X") || jButton6.getText().equals("O"))) {
            if (turn == 1) {

                jButton6.setText("X");
                grid[1][2] = 'X';
                turn = 2;
            } else {
                jButton6.setText("O");
                grid[1][2] = 'O';
                turn = 1;
            }
        }
        checkWinner();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        if (!(jButton7.getText().equals("X") || jButton7.getText().equals("O"))) {
            if (turn == 1) {

                jButton7.setText("X");
                grid[2][0] = 'X';
                turn = 2;
            } else {
                jButton7.setText("O");
                grid[2][0] = 'O';
                turn = 1;
            }
        }
        checkWinner();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        if (!(jButton8.getText().equals("X") || jButton8.getText().equals("O"))) {
            if (turn == 1) {

                jButton8.setText("X");
                grid[2][1] = 'X';
                turn = 2;
            } else {
                jButton8.setText("O");
                grid[2][1] = 'O';
                turn = 1;
            }
        }
        checkWinner();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        if (!(jButton9.getText().equals("X") || jButton9.getText().equals("O"))) {
            if (turn == 1) {

                jButton9.setText("X");
                grid[2][2] = 'X';
                turn = 2;
            } else {
                jButton9.setText("O");
                grid[2][2] = 'O';
                turn = 1;
            }
        }
        checkWinner();
    }//GEN-LAST:event_jButton9ActionPerformed

    public void checkWinner() {

        //horizontal top
        if (grid[0][0] == grid[0][1]) {
            if (grid[0][2] == grid[0][1]) {
                gameOver();
            }
        }
        //horizontal bottom
        if (grid[2][0] == grid[2][1]) {
            if (grid[2][2] == grid[2][1]) {
                gameOver();
            }
        }
        //vertical left   
        if (grid[0][0] == grid[1][0]) {
            if (grid[2][0] == grid[1][0]) {
                gameOver();
            }
        }
        //vertical right   
        if (grid[0][2] == grid[1][2]) {
            if (grid[2][2] == grid[1][2]) {
                gameOver();
            }
        }
        
        //vertical middle
        if (grid[0][1] == grid[1][1]) {
            if (grid[2][1] == grid[1][1]) {
                gameOver();
            }
        }
        

        //diagonal top left bottom right
        if (grid[0][0] == grid[1][1]) {
            if (grid[2][2] == grid[1][1]) {
                gameOver();
            }
        }

        //diagonal top right bottom left
        if (grid[0][2] == grid[1][1]) {
            if (grid[2][0] == grid[1][1]) {
                gameOver();
            }
        }
    }

    public void gameOver() {
        GameOver gameOver = new GameOver(this);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NoughtsAndCrossesScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NoughtsAndCrossesScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NoughtsAndCrossesScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NoughtsAndCrossesScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NoughtsAndCrossesScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    // End of variables declaration//GEN-END:variables
}
