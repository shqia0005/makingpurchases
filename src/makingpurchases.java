/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author shqia0005
 */
public class makingpurchases extends javax.swing.JFrame {

    /**
     * Creates new form makingpurchases
     */
    public makingpurchases() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        title = new javax.swing.JLabel();
        instruction = new javax.swing.JLabel();
        item1 = new javax.swing.JLabel();
        item2 = new javax.swing.JLabel();
        item3 = new javax.swing.JLabel();
        item4 = new javax.swing.JLabel();
        input1 = new javax.swing.JTextField();
        input2 = new javax.swing.JTextField();
        input3 = new javax.swing.JTextField();
        input4 = new javax.swing.JTextField();
        calc = new javax.swing.JButton();
        taxes = new javax.swing.JLabel();
        subtotal = new javax.swing.JLabel();
        grandtotal = new javax.swing.JLabel();
        output1 = new javax.swing.JLabel();
        output2 = new javax.swing.JLabel();
        output3 = new javax.swing.JLabel();
        instrction2 = new javax.swing.JLabel();
        picture = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        title.setFont(new java.awt.Font("A.C.M.E. Secret Agent", 0, 48)); // NOI18N
        title.setForeground(new java.awt.Color(255, 0, 0));
        title.setText("McDonald");

        instruction.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        instruction.setForeground(new java.awt.Color(255, 51, 0));
        instruction.setText("Enter the number of each food");

        item1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        item1.setForeground(new java.awt.Color(204, 51, 0));
        item1.setText("Big Mac Meal");

        item2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        item2.setForeground(new java.awt.Color(204, 51, 0));
        item2.setText("Chicken Snack Wrap");

        item3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        item3.setForeground(new java.awt.Color(204, 51, 0));
        item3.setText("Coca Cola");

        item4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        item4.setForeground(new java.awt.Color(204, 51, 0));
        item4.setText("French Fries");

        input1.setText("0");
        input1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input1ActionPerformed(evt);
            }
        });

        input2.setText("0");

        input3.setText("0");
        input3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input3ActionPerformed(evt);
            }
        });

        input4.setText("0");
        input4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input4ActionPerformed(evt);
            }
        });

        calc.setFont(new java.awt.Font("A.C.M.E. Secret Agent", 1, 16)); // NOI18N
        calc.setForeground(new java.awt.Color(255, 153, 0));
        calc.setText("Calculate");
        calc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcActionPerformed(evt);
            }
        });

        taxes.setFont(new java.awt.Font("AbcBulletin", 0, 24)); // NOI18N
        taxes.setForeground(new java.awt.Color(255, 153, 0));
        taxes.setText("Taxes(13%):");

        subtotal.setFont(new java.awt.Font("AbcBulletin", 0, 24)); // NOI18N
        subtotal.setForeground(new java.awt.Color(255, 153, 0));
        subtotal.setText("Subtotal:");

        grandtotal.setFont(new java.awt.Font("AbcBulletin", 0, 24)); // NOI18N
        grandtotal.setForeground(new java.awt.Color(255, 153, 0));
        grandtotal.setText("grand total");

        instrction2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        instrction2.setForeground(new java.awt.Color(255, 51, 0));
        instrction2.setText("that you would like to purchase and click Calculate");

        picture.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Thumb_ArchesImLovinItLockup-Color.jpg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(title)
                        .addGap(80, 80, 80))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(instruction, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(instrction2))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(item1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(item2)
                                    .addComponent(item3)
                                    .addComponent(item4))
                                .addGap(21, 21, 21)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(input2, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
                                    .addComponent(input1)
                                    .addComponent(input3)
                                    .addComponent(input4))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(subtotal)
                                    .addComponent(grandtotal))
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(output2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(output3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(taxes)
                                .addGap(18, 18, 18)
                                .addComponent(output1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(picture, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(33, 33, 33))
            .addGroup(layout.createSequentialGroup()
                .addGap(154, 154, 154)
                .addComponent(calc)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(title)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(instruction)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(instrction2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(item1, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                                    .addComponent(input1)))
                            .addComponent(picture))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(taxes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(output1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(17, 17, 17)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(subtotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(output2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(1, 1, 1))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(item2)
                                .addGap(18, 18, 18)
                                .addComponent(item3))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(input2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(input3)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(item4))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(input4))))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(grandtotal)
                        .addComponent(output3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(calc)
                .addGap(33, 33, 33))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void calcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcActionPerformed
        int num1, num2, num3, num4;
        double taxes, subtotal, grandtotal;
        
        double total1, total2, total3, total4;
        double tax = 0.13;
        double price1 = 9.95;
        double price2 = 2.63;
        double price3 = 2.39;
        double price4 = 1.67;
        
        num1 = Integer.parseInt(input1.getText());
        num2 = Integer.parseInt(input2.getText());
        num3 = Integer.parseInt(input3.getText());
        num4 = Integer.parseInt(input4.getText());
        
        total1 = price1 * num1;
        total2 = price2 * num2;
        total3 = price3 * num3;
        total4 = price4 * num4;
        
        taxes = (total1 + total2 + total3 + total4) * tax;
        taxes = taxes * 100;
        taxes = Math.round (taxes);
        taxes = taxes / 100;
        
        subtotal = total1 + total2 + total3 + total4;
        subtotal = subtotal * 100;
        subtotal = Math.round (subtotal);
        subtotal = subtotal / 100;
        
        grandtotal = subtotal + taxes;
        grandtotal = grandtotal * 100;
        grandtotal = Math.round (grandtotal);
        grandtotal = grandtotal / 100;
        
//        values that are rounded and formatted to two decimal places
        output1.setText( "$" + String.valueOf(taxes));
        output2.setText( "$" + String.valueOf(subtotal));
        output3.setText( "$" + String.valueOf(grandtotal));
    }//GEN-LAST:event_calcActionPerformed

    private void input4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_input4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_input4ActionPerformed

    private void input1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_input1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_input1ActionPerformed

    private void input3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_input3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_input3ActionPerformed

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
            java.util.logging.Logger.getLogger(makingpurchases.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(makingpurchases.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(makingpurchases.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(makingpurchases.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new makingpurchases().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton calc;
    private javax.swing.JLabel grandtotal;
    private javax.swing.JTextField input1;
    private javax.swing.JTextField input2;
    private javax.swing.JTextField input3;
    private javax.swing.JTextField input4;
    private javax.swing.JLabel instrction2;
    private javax.swing.JLabel instruction;
    private javax.swing.JLabel item1;
    private javax.swing.JLabel item2;
    private javax.swing.JLabel item3;
    private javax.swing.JLabel item4;
    private javax.swing.JLabel output1;
    private javax.swing.JLabel output2;
    private javax.swing.JLabel output3;
    private javax.swing.JLabel picture;
    private javax.swing.JLabel subtotal;
    private javax.swing.JLabel taxes;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
