/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AppPackage;

import static AppPackage.adminDash.labAdId;
import static AppPackage.adminDash.labAdUser;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 *
 * @author EmmanuelSal
 */
public class welForm extends javax.swing.JFrame {

    /**
     * Creates new form welForm
     */
    public welForm() {
        initComponents();
    }
    
    private final int startTime = 20;
    int sTime;
    private Timer timer;
      adminDash data2 = new adminDash();
    
        String driver = "org.apache.derby.jdbc.ClientDriver";
        String url = "jdbc:derby://localhost:1527/LOG";
        String user = "spy";
        String pass = "123";
     public void type()
        {
        try {
                Class.forName(driver);
                Connection con = DriverManager.getConnection(url, user, pass);
                String use = labWel.getText();
                String sql = "SELECT USERNAME FROM SEMISEC where ID =" + use ;
                PreparedStatement pst = con.prepareStatement(sql);
                ResultSet rs = pst.executeQuery();
                
                    if (rs.next()) {
                        
                       String id = rs.getString("USERNAME");
                       labUser.setText(id);
                      // labWel.hide();
                       rs.close();
                        
                    }
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
      public void close()
      {
        this.setVisible(false);
        this.dispose();
        
      }
     
     public void start()
    {
        int speed = 200;
        sTime = startTime;
        
              ActionListener action = new ActionListener()
                {
                    public void actionPerformed (ActionEvent evt)
                {
                      int n = bar.getValue();
                       
                                    if (n < 100)
                                    
                                    {   
                                        n++;
                                        bar.setValue(n);
                                          
                                        if (n == 10)
                                        {
                                            label2.setText("Loading...");
                                        }
                                        else if (n == 20)
                                        {
                                            label2.setText("Loading necessary components...");
                                        }
                                        else if (n == 30)
                                        {
                                            label2.setText("Finding Database...");
                                        }
                                        else if(n == 40)
                                        {
                                            label2.setText("Starting Database...");
                                        }
                                        else if (n == 50)
                                        {
                                            label2.setText("Connecting App to Database...");
                                        }
                                        else if (n == 60)
                                        {
                                            label2.setText("Verifying Connection...");
                                        }
                                        else if (n == 80)
                                        {
                                            label2.setText("Finishing it up...");
                                        }
                                          else if (n == 95)
                                        {
                                            label2.setText("Here we go...");
                                        }
                                    }
                             
                            
                                    else
                        
                                    {
                                        timer.stop();
                                         String use = labWel.getText();
                                         data2.setVisible(true);
                                         data2.pack();              
                                         data2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                   
                                         adminDash.labAdId.setText(use);
                                       
                                        close();
                        
                                    }   
                    }
                };
        
        timer = new Timer(speed,action);
        timer.start();
        
           
      
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lab = new javax.swing.JLabel();
        bar = new javax.swing.JProgressBar();
        label2 = new javax.swing.JLabel();
        labWel = new javax.swing.JLabel();
        labUser = new javax.swing.JLabel();
        labWel1 = new javax.swing.JLabel();

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(51, 51, 255));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        lab.setFont(new java.awt.Font("Comic Sans MS", 3, 24)); // NOI18N
        lab.setForeground(new java.awt.Color(255, 255, 255));
        lab.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lab.setText("Welcome");

        bar.setStringPainted(true);

        label2.setFont(new java.awt.Font("Comic Sans MS", 3, 14)); // NOI18N
        label2.setForeground(new java.awt.Color(255, 255, 255));
        label2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label2.setText("Please wait...");

        labWel.setFont(new java.awt.Font("Comic Sans MS", 3, 12)); // NOI18N
        labWel.setForeground(new java.awt.Color(255, 255, 255));
        labWel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labWel.setText("WELCOME");

        labUser.setFont(new java.awt.Font("Comic Sans MS", 3, 24)); // NOI18N
        labUser.setForeground(new java.awt.Color(255, 255, 255));
        labUser.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labUser.setText("Welcome");

        labWel1.setFont(new java.awt.Font("Comic Sans MS", 3, 12)); // NOI18N
        labWel1.setForeground(new java.awt.Color(255, 255, 255));
        labWel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labWel1.setText("Your ID Number:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(label2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lab, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labUser, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(labWel1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labWel, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lab)
                    .addComponent(labUser))
                .addGap(18, 18, 18)
                .addComponent(bar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labWel)
                    .addComponent(labWel1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        start();
    }//GEN-LAST:event_formWindowActivated

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
       type();
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(welForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(welForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(welForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(welForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new welForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar bar;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    public static javax.swing.JLabel lab;
    public static javax.swing.JLabel labUser;
    public static javax.swing.JLabel labWel;
    public static javax.swing.JLabel labWel1;
    private javax.swing.JLabel label2;
    // End of variables declaration//GEN-END:variables
}
