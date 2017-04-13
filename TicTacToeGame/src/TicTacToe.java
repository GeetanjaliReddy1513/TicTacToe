
import java.awt.Color;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author GEETHA
 */
public class TicTacToe extends javax.swing.JFrame {

    private String currentPlayer="X";
    String player1,player2;
    int p1Score=0;
    int p2Score=0;
    
    public TicTacToe() {
        initComponents();
         player1=JOptionPane.showInputDialog("Player 1:");
         if(player1.equalsIgnoreCase(""))
             player1="player 1";
        
        player2=JOptionPane.showInputDialog("Player 2:");
        if(player2.equalsIgnoreCase(""))
             player2="player 2";
        setSize(600, 600);
        setLocationRelativeTo(null);
         jLabel1.setText(player1+"'s score:"+p1Score+"         "+player2+"'s score:"+p2Score);
       
        
        
    }
    private void whoIsCurrentPlayer(){
        if(currentPlayer.equalsIgnoreCase("X"))
            currentPlayer="O";
        else
            currentPlayer="X";
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    private void xWins(){
        JOptionPane.showMessageDialog(rootPane,player1+" Wins");
        p1Score++;
         jLabel1.setText(player1+"'s score:"+p1Score+"         "+player2+"'s score:"+p2Score);
        resetGame();
    }
     private void oWins(){
        JOptionPane.showMessageDialog(rootPane,player2+" Wins");
        p2Score++;
         jLabel1.setText(player1+"'s score:"+p1Score+"         "+player2+"'s score:"+p2Score);
         resetGame();
    }
     private void tie(){
         JOptionPane.showMessageDialog(rootPane, "Game is a tie");
          jLabel1.setText(player1+"'s score:"+p1Score+"         "+player2+"'s score:"+p2Score);
         resetGame();
     }
    private void resetGame(){
        jButton1.setText("");
        jButton2.setText("");
        jButton3.setText("");
        jButton4.setText("");
        jButton5.setText("");
        jButton6.setText("");
        jButton7.setText("");
        jButton8.setText("");
        jButton9.setText("");
    }
    private void whoIsWinner(){
        String one=jButton1.getText();
        String two=jButton2.getText();
        String three=jButton3.getText();
        String four=jButton4.getText();
        String five=jButton5.getText();
        String six=jButton6.getText();
        String seven=jButton7.getText();
        String eight=jButton8.getText();
        String nine=jButton9.getText();
        if(one.equalsIgnoreCase("X") && two.equalsIgnoreCase("X") && three.equalsIgnoreCase("X")){
           xWins();
           return;
        }
           
        if(one.equalsIgnoreCase("X") && four.equalsIgnoreCase("X") && seven.equalsIgnoreCase("X")){
            xWins();
           return;
        }

         if(one.equalsIgnoreCase("X") && five.equalsIgnoreCase("X") && nine.equalsIgnoreCase("X")){
             xWins();
           return;
         }
          if(four.equalsIgnoreCase("X") && five.equalsIgnoreCase("X") && six.equalsIgnoreCase("X")){
              xWins();
           return;
          }
           if(seven.equalsIgnoreCase("X") && eight.equalsIgnoreCase("X") && nine.equalsIgnoreCase("X")){
               xWins();
           return;
           }
            if(three.equalsIgnoreCase("X") && five.equalsIgnoreCase("X") && seven.equalsIgnoreCase("X")){
                xWins();
           return;
            }
             if(two.equalsIgnoreCase("X") && five.equalsIgnoreCase("X") && eight.equalsIgnoreCase("X")){
                 xWins();
           return;
             }
              if(three.equalsIgnoreCase("X") && six.equalsIgnoreCase("X") && nine.equalsIgnoreCase("X")){
                  xWins();
           return;
              }
              if(one.equalsIgnoreCase("O") && two.equalsIgnoreCase("O") && three.equalsIgnoreCase("O")){
                  oWins();
                  return;
              }
        if(one.equalsIgnoreCase("O") && four.equalsIgnoreCase("O") && seven.equalsIgnoreCase("O")){
             oWins();
                  return;
        }
         if(one.equalsIgnoreCase("O") && five.equalsIgnoreCase("O") && nine.equalsIgnoreCase("O")){
              oWins();
                  return;
         }
          if(four.equalsIgnoreCase("O") && five.equalsIgnoreCase("O") && six.equalsIgnoreCase("O")){
               oWins();
                  return;
          }
           if(seven.equalsIgnoreCase("O") && eight.equalsIgnoreCase("O") && nine.equalsIgnoreCase("O")){
                oWins();
                  return;
           }
            if(three.equalsIgnoreCase("O") && five.equalsIgnoreCase("O") && seven.equalsIgnoreCase("O")){
                 oWins();
                  return;
            }
             if(two.equalsIgnoreCase("O") && five.equalsIgnoreCase("O") && eight.equalsIgnoreCase("O")){
                  oWins();
                  return;
             }
              if(three.equalsIgnoreCase("O") && six.equalsIgnoreCase("O") && nine.equalsIgnoreCase("O")){
                   oWins();
                  return;
              }
              
              if(one!="" &&two!="" &&three!="" &&four!="" &&five!="" &&six!="" &&seven!="" &&eight!="" &&nine!=""){
                  tie();
                  return;
              }
        
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jButton7 = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jButton8 = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        jButton9 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TicTacToe");

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 204, 255));
        jLabel1.setText("Place Holder Score");
        jPanel1.add(jLabel1, java.awt.BorderLayout.PAGE_END);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new java.awt.GridLayout(3, 3, 1, 1));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.setLayout(new java.awt.BorderLayout());

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 100)); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel3);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.setLayout(new java.awt.BorderLayout());

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 100)); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton2, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel4);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel5.setLayout(new java.awt.BorderLayout());

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 100)); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton3, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel5);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel6.setLayout(new java.awt.BorderLayout());

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 100)); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton4, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel6);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel7.setLayout(new java.awt.BorderLayout());

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 100)); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton5, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel7);

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel8.setLayout(new java.awt.BorderLayout());

        jButton6.setFont(new java.awt.Font("Tahoma", 1, 100)); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel8.add(jButton6, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel8);

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel9.setLayout(new java.awt.BorderLayout());

        jButton7.setFont(new java.awt.Font("Tahoma", 1, 100)); // NOI18N
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel9.add(jButton7, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel9);

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel10.setLayout(new java.awt.BorderLayout());

        jButton8.setFont(new java.awt.Font("Tahoma", 1, 100)); // NOI18N
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel10.add(jButton8, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel10);

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel11.setLayout(new java.awt.BorderLayout());

        jButton9.setFont(new java.awt.Font("Tahoma", 1, 100)); // NOI18N
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel11.add(jButton9, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel11);

        jPanel1.add(jPanel2, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>                        

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        jButton1.setText(currentPlayer);
        if(jButton1.getText().equalsIgnoreCase("X"))
            jButton1.setForeground(Color.red);
        else
            jButton1.setForeground(Color.blue);
        whoIsCurrentPlayer();
        whoIsWinner();
        
    }                                        

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
       jButton2.setText(currentPlayer);
       if(jButton2.getText().equalsIgnoreCase("X"))
            jButton2.setForeground(Color.red);
        else
            jButton2.setForeground(Color.blue);
        whoIsCurrentPlayer();
         whoIsWinner();
          
    }                                        

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {                                         
       jButton3.setText(currentPlayer);
       if(jButton3.getText().equalsIgnoreCase("X"))
            jButton3.setForeground(Color.red);
        else
            jButton3.setForeground(Color.blue);
        whoIsCurrentPlayer();
         whoIsWinner();
        
    }                                        

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        jButton4.setText(currentPlayer);
        if(jButton4.getText().equalsIgnoreCase("X"))
            jButton4.setForeground(Color.red);
        else
            jButton4.setForeground(Color.blue);
        whoIsCurrentPlayer();
         whoIsWinner();
          
    }                                        

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        jButton5.setText(currentPlayer);
        if(jButton5.getText().equalsIgnoreCase("X"))
            jButton5.setForeground(Color.red);
        else
            jButton5.setForeground(Color.blue);
        whoIsCurrentPlayer();
         whoIsWinner();
         
    }                                        

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        jButton6.setText(currentPlayer);
        if(jButton6.getText().equalsIgnoreCase("X"))
            jButton6.setForeground(Color.red);
        else
            jButton6.setForeground(Color.blue);
        whoIsCurrentPlayer();
         whoIsWinner();
     
    }                                        

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {                                         
       jButton7.setText(currentPlayer);
       if(jButton7.getText().equalsIgnoreCase("X"))
            jButton7.setForeground(Color.red);
        else
            jButton7.setForeground(Color.blue);
        whoIsCurrentPlayer();
         whoIsWinner();
        
    }                                        

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {                                         
       jButton8.setText(currentPlayer);
  if(jButton8.getText().equalsIgnoreCase("X"))
            jButton8.setForeground(Color.red);
        else
            jButton8.setForeground(Color.blue);
       whoIsCurrentPlayer();
        whoIsWinner();
        
    }                                        

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        jButton9.setText(currentPlayer);
        if(jButton9.getText().equalsIgnoreCase("X"))
            jButton9.setForeground(Color.red);
        else
            jButton9.setForeground(Color.blue);
        whoIsCurrentPlayer();
         whoIsWinner();
         
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
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TicTacToe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    // End of variables declaration                   
}
