
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class main extends javax.swing.JFrame {

    /**
     * Creates new form main
     */
    
    
    
    double firstnum = 0 , secondnum = 0 , result = 0;
    String operations;
    
    public main() {
        initComponents();
    }
    public void close() {
        this.setVisible(false);
        this.dispose();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnPlusMinus16 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        tfAns = new javax.swing.JTextField();
        btnPlusMinus = new javax.swing.JButton();
        btnsqr = new javax.swing.JButton();
        btnPlusMinus2 = new javax.swing.JButton();
        btnclr = new javax.swing.JButton();
        btnnine = new javax.swing.JButton();
        btnsix = new javax.swing.JButton();
        btnthree = new javax.swing.JButton();
        btneql = new javax.swing.JButton();
        btneight = new javax.swing.JButton();
        btnplus = new javax.swing.JButton();
        btnseven = new javax.swing.JButton();
        btnfive = new javax.swing.JButton();
        btnfour = new javax.swing.JButton();
        btntwo = new javax.swing.JButton();
        btnone = new javax.swing.JButton();
        btnminus = new javax.swing.JButton();
        btnmult = new javax.swing.JButton();
        btndivide = new javax.swing.JButton();
        btnzero = new javax.swing.JButton();
        btnperiod = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();

        btnPlusMinus16.setBackground(new java.awt.Color(0, 0, 0));
        btnPlusMinus16.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnPlusMinus16.setForeground(new java.awt.Color(255, 255, 255));
        btnPlusMinus16.setText("±");
        btnPlusMinus16.setOpaque(false);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(102, 255, 0));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        tfAns.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        tfAns.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        btnPlusMinus.setBackground(new java.awt.Color(0, 0, 0));
        btnPlusMinus.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnPlusMinus.setForeground(new java.awt.Color(255, 255, 255));
        btnPlusMinus.setText("±");
        btnPlusMinus.setOpaque(false);
        btnPlusMinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlusMinusActionPerformed(evt);
            }
        });

        btnsqr.setBackground(new java.awt.Color(0, 0, 0));
        btnsqr.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        btnsqr.setForeground(new java.awt.Color(255, 255, 255));
        btnsqr.setText("√ ");
        btnsqr.setOpaque(false);
        btnsqr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsqrActionPerformed(evt);
            }
        });

        btnPlusMinus2.setBackground(new java.awt.Color(0, 0, 0));
        btnPlusMinus2.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnPlusMinus2.setForeground(new java.awt.Color(255, 255, 255));
        btnPlusMinus2.setText("^");
        btnPlusMinus2.setOpaque(false);
        btnPlusMinus2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlusMinus2ActionPerformed(evt);
            }
        });

        btnclr.setBackground(new java.awt.Color(0, 0, 0));
        btnclr.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnclr.setForeground(new java.awt.Color(255, 255, 255));
        btnclr.setText("CLR");
        btnclr.setOpaque(false);
        btnclr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnclrActionPerformed(evt);
            }
        });

        btnnine.setBackground(new java.awt.Color(0, 0, 0));
        btnnine.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnnine.setForeground(new java.awt.Color(255, 255, 255));
        btnnine.setText("9");
        btnnine.setOpaque(false);
        btnnine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnineActionPerformed(evt);
            }
        });

        btnsix.setBackground(new java.awt.Color(0, 0, 0));
        btnsix.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnsix.setForeground(new java.awt.Color(255, 255, 255));
        btnsix.setText("6");
        btnsix.setOpaque(false);
        btnsix.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsixActionPerformed(evt);
            }
        });

        btnthree.setBackground(new java.awt.Color(0, 0, 0));
        btnthree.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnthree.setForeground(new java.awt.Color(255, 255, 255));
        btnthree.setText("3");
        btnthree.setOpaque(false);
        btnthree.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnthreeActionPerformed(evt);
            }
        });

        btneql.setBackground(new java.awt.Color(0, 0, 0));
        btneql.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btneql.setForeground(new java.awt.Color(255, 255, 255));
        btneql.setText("=");
        btneql.setOpaque(false);
        btneql.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneqlActionPerformed(evt);
            }
        });

        btneight.setBackground(new java.awt.Color(0, 0, 0));
        btneight.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btneight.setForeground(new java.awt.Color(255, 255, 255));
        btneight.setText("8");
        btneight.setOpaque(false);
        btneight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneightActionPerformed(evt);
            }
        });

        btnplus.setBackground(new java.awt.Color(0, 0, 0));
        btnplus.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnplus.setForeground(new java.awt.Color(255, 255, 255));
        btnplus.setText("+");
        btnplus.setOpaque(false);
        btnplus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnplusActionPerformed(evt);
            }
        });

        btnseven.setBackground(new java.awt.Color(0, 0, 0));
        btnseven.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnseven.setForeground(new java.awt.Color(255, 255, 255));
        btnseven.setText("7");
        btnseven.setOpaque(false);
        btnseven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsevenActionPerformed(evt);
            }
        });

        btnfive.setBackground(new java.awt.Color(0, 0, 0));
        btnfive.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnfive.setForeground(new java.awt.Color(255, 255, 255));
        btnfive.setText("5");
        btnfive.setOpaque(false);
        btnfive.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnfiveActionPerformed(evt);
            }
        });

        btnfour.setBackground(new java.awt.Color(0, 0, 0));
        btnfour.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnfour.setForeground(new java.awt.Color(255, 255, 255));
        btnfour.setText("4");
        btnfour.setOpaque(false);
        btnfour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnfourActionPerformed(evt);
            }
        });

        btntwo.setBackground(new java.awt.Color(0, 0, 0));
        btntwo.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btntwo.setForeground(new java.awt.Color(255, 255, 255));
        btntwo.setText("2");
        btntwo.setOpaque(false);
        btntwo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntwoActionPerformed(evt);
            }
        });

        btnone.setBackground(new java.awt.Color(0, 0, 0));
        btnone.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnone.setForeground(new java.awt.Color(255, 255, 255));
        btnone.setText("1");
        btnone.setOpaque(false);
        btnone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnoneActionPerformed(evt);
            }
        });

        btnminus.setBackground(new java.awt.Color(0, 0, 0));
        btnminus.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnminus.setForeground(new java.awt.Color(255, 255, 255));
        btnminus.setText("-");
        btnminus.setOpaque(false);
        btnminus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnminusActionPerformed(evt);
            }
        });

        btnmult.setBackground(new java.awt.Color(0, 0, 0));
        btnmult.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnmult.setForeground(new java.awt.Color(255, 255, 255));
        btnmult.setText("*");
        btnmult.setOpaque(false);
        btnmult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmultActionPerformed(evt);
            }
        });

        btndivide.setBackground(new java.awt.Color(0, 0, 0));
        btndivide.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        btndivide.setForeground(new java.awt.Color(255, 255, 255));
        btndivide.setText("/");
        btndivide.setOpaque(false);
        btndivide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndivideActionPerformed(evt);
            }
        });

        btnzero.setBackground(new java.awt.Color(0, 0, 0));
        btnzero.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnzero.setForeground(new java.awt.Color(255, 255, 255));
        btnzero.setText("0");
        btnzero.setOpaque(false);

        btnperiod.setBackground(new java.awt.Color(0, 0, 0));
        btnperiod.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnperiod.setForeground(new java.awt.Color(255, 255, 255));
        btnperiod.setText(".");
        btnperiod.setOpaque(false);
        btnperiod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnperiodActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btnsix)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnfive))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btnnine)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btneight)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnseven)
                            .addComponent(btnfour))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnthree, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnzero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btntwo)
                            .addComponent(btnperiod))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btneql, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btnone)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(18, 18, 18)
                .addComponent(btndivide, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(tfAns)
                .addGap(10, 10, 10))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnPlusMinus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnsqr)
                .addGap(9, 9, 9)
                .addComponent(btnPlusMinus2)
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnclr, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnplus, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnminus, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnmult, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(tfAns, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPlusMinus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnsqr, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnPlusMinus2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(btnclr, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnplus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnseven, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btneight, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnnine, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnsix, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnfive, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnfour, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnminus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnthree, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btntwo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnone, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnmult, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btneql)
                    .addComponent(btnzero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btndivide, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnperiod, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jMenuBar1.setBackground(new java.awt.Color(0, 0, 0));
        jMenuBar1.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N

        jMenu1.setText("File");

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("Exit");
        jRadioButtonMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jRadioButtonMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnthreeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnthreeActionPerformed
         String Enternum = tfAns.getText()+btnthree.getText();
        tfAns.setText(Enternum);
    }//GEN-LAST:event_btnthreeActionPerformed

    private void btneqlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneqlActionPerformed
        if (tfAns.getText() != null && tfAns.getText().equals(""))
        {
         
             JOptionPane.showMessageDialog(null ,"Input Number First!!" , "ERROR!" , JOptionPane.INFORMATION_MESSAGE);
             tfAns.setText("null");
        }    
        
        else
         {
        
        String answer;
        secondnum = Double.parseDouble(tfAns.getText());
        if(operations == "+")
        {
            result = firstnum + secondnum;
            answer = String.format("%.1f",result);
            tfAns.setText(answer);
        }
          else  if(operations == "-")
        {
            result = firstnum - secondnum;
            answer = String.format("%.1f",result);
            tfAns.setText(answer);
        }
           else  if(operations == "*")
        {
            result = firstnum * secondnum;
            answer = String.format("%.1f",result);
            tfAns.setText(answer);
        }
           else  if(operations == "/")
        {
            result = firstnum / secondnum;
            answer = String.format("%.1f",result);
            tfAns.setText(answer);
        }
           else  if(operations == "%")
        {
            result = firstnum % secondnum;
            answer = String.format("%.1f",result);
            tfAns.setText(answer);
        }
        else
           {
              tfAns.setText("Syntax Error!!");
           }
        
        
         }
        
                    
    }//GEN-LAST:event_btneqlActionPerformed

    private void jRadioButtonMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonMenuItem1ActionPerformed
       close();
    }//GEN-LAST:event_jRadioButtonMenuItem1ActionPerformed

    private void btnclrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnclrActionPerformed
       tfAns.setText(null);
    }//GEN-LAST:event_btnclrActionPerformed

    private void btnplusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnplusActionPerformed
        if (tfAns.getText() != null && tfAns.getText().equals(""))
        {
         
             JOptionPane.showMessageDialog(null ,"Input Number First!!" , "ERROR!" , JOptionPane.INFORMATION_MESSAGE);
             tfAns.setText("0");
        }
        
        else
         {
        
            firstnum = Double.parseDouble(tfAns.getText());
            tfAns.setText("");
            operations = "+";
         
         }
    }//GEN-LAST:event_btnplusActionPerformed

    private void btnminusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnminusActionPerformed
         if (tfAns.getText() != null && tfAns.getText().equals(""))
        {
         
             JOptionPane.showMessageDialog(null ,"Input Number First!!" , "ERROR!" , JOptionPane.INFORMATION_MESSAGE);
             tfAns.setText("0");
        }
        
        else
         {
        
             firstnum = Double.parseDouble(tfAns.getText());
             tfAns.setText("");
             operations = "-";
             
         }
    }//GEN-LAST:event_btnminusActionPerformed

    private void btnmultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmultActionPerformed
         if (tfAns.getText() != null && tfAns.getText().equals(""))
        {
         
             JOptionPane.showMessageDialog(null ,"Input Number First!!" , "ERROR!" , JOptionPane.INFORMATION_MESSAGE);
             tfAns.setText("0");
        }
        else
         {
            firstnum = Double.parseDouble(tfAns.getText());
            tfAns.setText("");
            operations = "*";
         }
    }//GEN-LAST:event_btnmultActionPerformed

    private void btndivideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndivideActionPerformed
       if (tfAns.getText() != null && tfAns.getText().equals(""))
        {
         
             JOptionPane.showMessageDialog(null ,"Input Number First!!" , "ERROR!" , JOptionPane.INFORMATION_MESSAGE);
             tfAns.setText("0");
        }  
        else
        {
            firstnum = Double.parseDouble(tfAns.getText());
            tfAns.setText("");
            operations = "/";
            
        }
    }//GEN-LAST:event_btndivideActionPerformed

    private void btnPlusMinus2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlusMinus2ActionPerformed
         if (tfAns.getText() != null && tfAns.getText().equals(""))
        {
         
             JOptionPane.showMessageDialog(null ,"Input Number First!!" , "ERROR!" , JOptionPane.INFORMATION_MESSAGE);
            tfAns.setText("0");
        }
        
        else
        {
            double Rsqr;
            double Fsqr = Double.parseDouble(tfAns.getText());
            Rsqr = Fsqr * Double.parseDouble (tfAns.getText());
            tfAns.setText(Double.toString(Rsqr));
        }
    }//GEN-LAST:event_btnPlusMinus2ActionPerformed

    private void btnsqrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsqrActionPerformed
         if (tfAns.getText() != null && tfAns.getText().equals(""))
        {
         
             JOptionPane.showMessageDialog(null ,"Input Number First!!" , "ERROR!" , JOptionPane.INFORMATION_MESSAGE);
             tfAns.setText("0");
        }
        else
         {
        
            double value = Math.sqrt(Double.parseDouble(tfAns.getText()));
            tfAns.setText(Double.toString(value));
            
         }
    }//GEN-LAST:event_btnsqrActionPerformed

    private void btnPlusMinusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlusMinusActionPerformed
         
        if (tfAns.getText() != null && tfAns.getText().equals(""))
        {
         
             JOptionPane.showMessageDialog(null ,"Input Number First!!" , "ERROR!" , JOptionPane.INFORMATION_MESSAGE);
             tfAns.show();
        }
        else
        {
            double ops = Double.parseDouble(String.valueOf(tfAns.getText()));
            ops = ops * (-1);
            tfAns.setText(String.valueOf(ops));  
        }
    }//GEN-LAST:event_btnPlusMinusActionPerformed

    private void btnoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnoneActionPerformed
        
        String Enternum = tfAns.getText()+btnone.getText();
        tfAns.setText(Enternum);
    }//GEN-LAST:event_btnoneActionPerformed

    private void btntwoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntwoActionPerformed
         String Enternum = tfAns.getText()+btntwo.getText();
        tfAns.setText(Enternum);
    }//GEN-LAST:event_btntwoActionPerformed

    private void btnfourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnfourActionPerformed
       String Enternum = tfAns.getText()+btnfour.getText();
        tfAns.setText(Enternum);
    }//GEN-LAST:event_btnfourActionPerformed

    private void btnfiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnfiveActionPerformed
         String Enternum = tfAns.getText()+btnfive.getText();
        tfAns.setText(Enternum);
    }//GEN-LAST:event_btnfiveActionPerformed

    private void btnsixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsixActionPerformed
        String Enternum = tfAns.getText()+btnsix.getText();
        tfAns.setText(Enternum);
    }//GEN-LAST:event_btnsixActionPerformed

    private void btnsevenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsevenActionPerformed
        String Enternum = tfAns.getText()+btnseven.getText();
        tfAns.setText(Enternum);
    }//GEN-LAST:event_btnsevenActionPerformed

    private void btneightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneightActionPerformed
        String Enternum = tfAns.getText()+btneight.getText();
        tfAns.setText(Enternum);
    }//GEN-LAST:event_btneightActionPerformed

    private void btnnineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnineActionPerformed
        String Enternum = tfAns.getText()+btnnine.getText();
        tfAns.setText(Enternum);
    }//GEN-LAST:event_btnnineActionPerformed

    private void btnperiodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnperiodActionPerformed
         String Enternum = tfAns.getText()+btnperiod.getText();
        tfAns.setText(Enternum);
    }//GEN-LAST:event_btnperiodActionPerformed

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
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPlusMinus;
    private javax.swing.JButton btnPlusMinus16;
    private javax.swing.JButton btnPlusMinus2;
    private javax.swing.JButton btnclr;
    private javax.swing.JButton btndivide;
    private javax.swing.JButton btneight;
    private javax.swing.JButton btneql;
    private javax.swing.JButton btnfive;
    private javax.swing.JButton btnfour;
    private javax.swing.JButton btnminus;
    private javax.swing.JButton btnmult;
    private javax.swing.JButton btnnine;
    private javax.swing.JButton btnone;
    private javax.swing.JButton btnperiod;
    private javax.swing.JButton btnplus;
    private javax.swing.JButton btnseven;
    private javax.swing.JButton btnsix;
    private javax.swing.JButton btnsqr;
    private javax.swing.JButton btnthree;
    private javax.swing.JButton btntwo;
    private javax.swing.JButton btnzero;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JTextField tfAns;
    // End of variables declaration//GEN-END:variables
}