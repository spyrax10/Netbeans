/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AppPackage;

import com.sun.glass.events.KeyEvent;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author EmmanuelSal
 */
public class proForm extends javax.swing.JFrame {

    /**
     * Creates new form proForm
     */
    public proForm() {
        initComponents();
    }
    
        String driver = "org.apache.derby.jdbc.ClientDriver";
        String url = "jdbc:derby://localhost:1527/LOG";
        String user = "spy";
        String pass = "123";
        DefaultTableModel dm;
        String filename = null;
        byte[] person_image = null;
        private byte[] picture;
        
        
        void showDate2() {
        java.util.Date d = new java.util.Date();
        SimpleDateFormat s = new SimpleDateFormat("EEEEEE, MMM dd yyyy");
        lblDate.setText(s.format(d));
    }

    void showTime2() {
        new Timer(0, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
       
        java.util.Date t = new java.util.Date();
        SimpleDateFormat d = new SimpleDateFormat("hh:mm:ss a");
        lblTime.setText(d.format(t));
            }
            
        }
        ).start();
        
    }
    public void addQuan() {
        String Oquan = proQuan.getText();
        String Nquan = proAdd.getText();
        double Tquan = Double.parseDouble(Oquan) + Double.parseDouble(Nquan);
        String NewQuan = String.format("%.0f", Tquan);
        
        
        try {
            
                                     Class.forName(driver);
                                     Connection con = DriverManager.getConnection(url, user, pass);
                                     String value = (proId.getText());
            
                                     String sql = "UPDATE PRO SET PRONAME = ?,MANUNAME = ?,UNITP = ?,QUANTITY = ?,PROTYPE = ?,DATE = ? where ID = "+ value;
           
                                     PreparedStatement pst = con.prepareStatement(sql); 
            
                pst.setString(1, proName.getText());
                pst.setString(2, proManu.getText());
                pst.setString(3, proUnit.getText());
                pst.setString(4, NewQuan);
                pst.setString(5,(String) proType.getSelectedItem());
                pst.setString(6, proDate.getText());
              
                
                                       
                pst.execute();
                JOptionPane.showMessageDialog(this, "Updated Successfully!");                                       
                fetch(); 
                clear();
                pst.close();    
        }
        catch (Exception e) {
            
        }
    }
    public void update() {
        String name = proName.getText();
        String manu = proManu.getText();
        String price = proUnit.getText();
        String type = (String) proType.getSelectedItem();
        String date = proDate.getText();
           
        
        int opt = JOptionPane.showConfirmDialog(null, "Are you sure?","UPDATE", JOptionPane.YES_NO_OPTION);
        if(opt == 0)
            {
                  if (img.getIcon() == null)
                    {
                        JOptionPane.showMessageDialog(null,"Please Choose your Avatar!");
                        Open();
                        return;   
                    }
            
         else if(name.isEmpty() ||
                 manu.isEmpty() || 
                 price.isEmpty() ||
               
                 date.isEmpty()) {
             
             JOptionPane.showMessageDialog(null, "Please Input Missing Fields!!");
         }
         else {
             try 
                                {
          
                                     Class.forName(driver);
                                     Connection con = DriverManager.getConnection(url, user, pass);
                                     String value = (proId.getText());
            
                                     String sql = "UPDATE PRO SET PRONAME = ?,MANUNAME = ?,UNITP = ?,QUANTITY = ?,PROTYPE = ?,DATE = ? where ID = "+ value;
           
                                     PreparedStatement pst = con.prepareStatement(sql); 
            
                pst.setString(1, proName.getText());
                pst.setString(2, proManu.getText());
                pst.setString(3, proUnit.getText());
                pst.setString(4, proQuan.getText());
                pst.setString(5,(String) proType.getSelectedItem());
                pst.setString(6, proDate.getText());
              
                
                                       
                pst.execute();
                JOptionPane.showMessageDialog(this, "Updated Successfully!");                                       
                fetch(); 
                clear();
                pst.close();    
        
                                 }
      
                                     catch (Exception e)
                                        {
                                            JOptionPane.showMessageDialog(null, e);
                                        }  
         }
            }
        else {
              JOptionPane.showMessageDialog(null, "Denied by User..");
        }
    }
      public void table() {
         try
        
         {    
             int i = jTable1.getSelectedRow();
         
             TableModel model = jTable1.getModel();
            
            Class.forName(driver);
            Connection con = DriverManager.getConnection(url, user, pass);
            int row = jTable1.getSelectedRow();
            String value = (jTable1.getModel().getValueAt(row, 0).toString());
            
            
            String Gsql = "SELECT IMAGE FROM PRO where ID =" + value ;
            PreparedStatement pst = con.prepareStatement(Gsql);
            ResultSet rs = pst.executeQuery(); 
           
           
             if(rs.next())
           
             {
                
                proId.setText(model.getValueAt(i,0).toString());
                proName.setText(model.getValueAt(i,1).toString());
                proManu.setText(model.getValueAt(i,2).toString());
                proUnit.setText(model.getValueAt(i,3).toString());
                proQuan.setText(model.getValueAt(i,4).toString());
                proType.setSelectedItem(model.getValueAt(i,5).toString());
                proDate.setText(model.getValueAt(i,6).toString());
               
                 byte [] image = rs.getBytes("IMAGE");  
                
                ImageIcon imageIcon = new ImageIcon(new ImageIcon (image).getImage().getScaledInstance(img.getWidth(),img.getHeight(),Image.SCALE_SMOOTH));
                img.setIcon(imageIcon);
                rs.close();
           }  
         
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e); 
        }
       

    }
    public void clear() {
        proId.setText("ID NUMBER");
        proName.setText("");
        proManu.setText("");
        proUnit.setText("");
        proQuan.setText("");
        proDate.setText("");
        proType.setSelectedItem("Laptop");
        dateChoser.setEnabled(false);
        img.setIcon(null);
        img.setText("Photo");
        btnAdd.setText("ADD");
        proAdd.setText("Add Quantity");
        fetch();
        btnUp.hide();
        proAdd.setEnabled(false);
    }
         public void upImg()
    {
      
            try
             
             {
                 
             Class.forName(driver);
             Connection con = DriverManager.getConnection(url, user, pass);
             String value = (proId.getText());
             Open();
             File file = new File (filename);
             FileInputStream fis = new FileInputStream(file);
             byte [] image = new byte[(int)file.length()];
             fis.read(image);
          
            String Isql = "UPDATE PRO SET IMAGE=? where ID = "+ value;
            
            PreparedStatement ipst = con.prepareStatement(Isql);
            ipst.setBytes(1,image);
            
            ipst.execute();
            JOptionPane.showMessageDialog(this, "Updated Successfully!");
       
            fetch(); 
            clear();
            ipst.close();  
             }
             catch(Exception f)
             {
                JOptionPane.showMessageDialog(this, f.getMessage());
             }
               
            
           
    }
       public void getId() {
        try {
            int i = jTable1.getSelectedRow();
              TableModel model = jTable1.getModel();
               int row = jTable1.getSelectedRow();
            String value = jTable1.getValueAt(jTable1.getModel().getRowCount()-1, 0).toString();
            proId.setText(value);
            
        }
        catch(Exception e) {
            
        }
    }
    public void fetch() {
        try
        {
            Class.forName(driver);
            Connection con = DriverManager.getConnection(url, user, pass);
            String sql = "Select ID, PRONAME, MANUNAME,UNITP,QUANTITY,PROTYPE,DATE from PRO ORDER BY ID ASC" ;
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
           
            jTable1.setModel(DbUtils.resultSetToTableModel(rs));
            pst.close();
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(this, e.getMessage());   
        }
    }
     public void Open()
        {
       
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        filename = f.getAbsolutePath();
        ImageIcon imageIcon = new ImageIcon(new ImageIcon (filename).getImage().getScaledInstance(img.getWidth(),img.getHeight(),Image.SCALE_DEFAULT));
        img.setIcon(imageIcon);     
      
            try
                {
         
                    File image = new File (filename);
                    FileInputStream fis = new FileInputStream(image);
                    ByteArrayOutputStream bos = new ByteArrayOutputStream();
                    byte[] buf = new byte[1024];
                    for (int readNum; (readNum = fis.read(buf)) !=-1;)
            
                        {
                        bos.write(buf , 0 ,readNum);
                        }
                       
                    person_image = bos.toByteArray();
                   
     
                }
                catch(IOException e)
             
                {
                        JOptionPane.showMessageDialog(null,e);
                }
       
          
    }
    public void create() {
        String name = proName.getText();
        String manu = proManu.getText();
        String price = proUnit.getText();
        String type = (String) proType.getSelectedItem();
        String date = proDate.getText();
        
         if (img.getIcon()== null)
            {
                JOptionPane.showMessageDialog(null,"Please Choose your Avatar!");
                Open();
           
            }
         else if(name.isEmpty() ||
                 manu.isEmpty() || 
                 price.isEmpty() ||
               
                 date.isEmpty()) {
             
             JOptionPane.showMessageDialog(null, "Please Input Missing Fields!!");
         }
         else {
              try
            {
                Class.forName(driver);
                Connection con = DriverManager.getConnection(url, user, pass);
                String sql = "Insert into PRO"
                +"(PRONAME,MANUNAME,UNITP,QUANTITY,PROTYPE,DATE,IMAGE)"
                +"values (?,?,?,?,?,?,?)";
                PreparedStatement pst = con.prepareStatement(sql);

        
                pst.setString(1, proName.getText());
                pst.setString(2, proManu.getText());
                pst.setString(3, proUnit.getText());
                pst.setString(4, proQuan.getText());
                pst.setString(5, (String) proType.getSelectedItem());
                pst.setString(6, proDate.getText());  
                pst.setBytes(7,person_image);
                
                
                pst.executeUpdate();
                img.setText("");
                
                fetch();
                getId();
//clear();
               
                JOptionPane.showMessageDialog(this, "Product Added Successfully..");
                
                pst.close();
            }
                catch (Exception ex)
                    {
                        JOptionPane.showMessageDialog(null, ex);
                    }
         }
         
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        proName = new javax.swing.JTextField();
        proManu = new javax.swing.JTextField();
        proUnit = new javax.swing.JTextField();
        proQuan = new javax.swing.JTextField();
        dateChoser = new datechooser.beans.DateChooserCombo();
        proDate = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        img = new javax.swing.JLabel();
        btnUp = new javax.swing.JButton();
        proType = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        proId = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        proAdd = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        lblDate = new javax.swing.JLabel();
        lblTime = new javax.swing.JLabel();

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

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("PRODUCT INFORMATION");

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Product Name:");
        jLabel2.setToolTipText("");

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Manufacturer:");
        jLabel3.setToolTipText("");

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Unit price:");
        jLabel4.setToolTipText("");

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Quantity:");
        jLabel5.setToolTipText("");

        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Product Type:");
        jLabel6.setToolTipText("");

        jLabel7.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Date Added:");
        jLabel7.setToolTipText("");

        proName.setBackground(new java.awt.Color(0, 0, 0));
        proName.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        proName.setForeground(new java.awt.Color(255, 255, 255));
        proName.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        proManu.setBackground(new java.awt.Color(0, 0, 0));
        proManu.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        proManu.setForeground(new java.awt.Color(255, 255, 255));
        proManu.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        proManu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proManuActionPerformed(evt);
            }
        });

        proUnit.setBackground(new java.awt.Color(0, 0, 0));
        proUnit.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        proUnit.setForeground(new java.awt.Color(255, 255, 255));
        proUnit.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        proQuan.setBackground(new java.awt.Color(0, 0, 0));
        proQuan.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        proQuan.setForeground(new java.awt.Color(255, 255, 255));
        proQuan.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        dateChoser.setCurrentView(new datechooser.view.appearance.AppearancesList("Grey",
            new datechooser.view.appearance.ViewAppearance("custom",
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                    new java.awt.Color(0, 0, 0),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                    new java.awt.Color(0, 0, 0),
                    new java.awt.Color(0, 0, 255),
                    true,
                    true,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                    new java.awt.Color(0, 0, 255),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                    new java.awt.Color(128, 128, 128),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.LabelPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                    new java.awt.Color(0, 0, 0),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.LabelPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                    new java.awt.Color(0, 0, 0),
                    new java.awt.Color(255, 0, 0),
                    false,
                    false,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                (datechooser.view.BackRenderer)null,
                false,
                true)));
    dateChoser.setFormat(2);
    dateChoser.addCommitListener(new datechooser.events.CommitListener() {
        public void onCommit(datechooser.events.CommitEvent evt) {
            dateChoserOnCommit(evt);
        }
    });

    proDate.setBackground(new java.awt.Color(0, 0, 0));
    proDate.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
    proDate.setForeground(new java.awt.Color(255, 255, 255));
    proDate.setHorizontalAlignment(javax.swing.JTextField.CENTER);

    btnAdd.setBackground(new java.awt.Color(0, 0, 0));
    btnAdd.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
    btnAdd.setForeground(new java.awt.Color(255, 255, 255));
    btnAdd.setText("ADD");
    btnAdd.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnAddActionPerformed(evt);
        }
    });

    jPanel5.setBackground(new java.awt.Color(0, 0, 0));
    jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));

    img.setForeground(new java.awt.Color(255, 255, 255));
    img.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    img.setText("PHOTO");

    javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
    jPanel5.setLayout(jPanel5Layout);
    jPanel5Layout.setHorizontalGroup(
        jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel5Layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(img, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
            .addContainerGap())
    );
    jPanel5Layout.setVerticalGroup(
        jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel5Layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(img, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
            .addContainerGap())
    );

    btnUp.setBackground(new java.awt.Color(255, 255, 255));
    btnUp.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
    btnUp.setText("UPLOAD");
    btnUp.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnUpActionPerformed(evt);
        }
    });

    proType.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
    proType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Laptops", "Desktops", "Computer Accessories" }));
    proType.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            proTypeActionPerformed(evt);
        }
    });

    jButton1.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
    jButton1.setText("REFRESH");
    jButton1.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton1ActionPerformed(evt);
        }
    });

    javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
    jPanel3.setLayout(jPanel3Layout);
    jPanel3Layout.setHorizontalGroup(
        jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel3Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator1)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                    .addComponent(jButton1)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAdd))
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addGap(18, 18, 18)
                            .addComponent(proName, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4)
                                .addComponent(jLabel5)
                                .addComponent(jLabel6)
                                .addComponent(jLabel7))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(proQuan, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                                .addComponent(proUnit, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                                .addComponent(proManu, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                                .addComponent(dateChoser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(proDate, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                                .addComponent(proType, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btnUp, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(0, 42, Short.MAX_VALUE)))
            .addContainerGap())
    );
    jPanel3Layout.setVerticalGroup(
        jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel3Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addComponent(jLabel1)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(45, 45, 45)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(proName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(proManu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(proUnit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(proQuan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(proType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel7)
                        .addComponent(dateChoser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(proDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(btnUp))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(btnAdd)
                .addComponent(jButton1))
            .addContainerGap())
    );

    jPanel4.setBackground(new java.awt.Color(0, 0, 0));
    jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));

    jTable1.setModel(new javax.swing.table.DefaultTableModel(
        new Object [][] {

        },
        new String [] {

        }
    ));
    jTable1.setGridColor(new java.awt.Color(0, 0, 0));
    jTable1.addMouseWheelListener(new java.awt.event.MouseWheelListener() {
        public void mouseWheelMoved(java.awt.event.MouseWheelEvent evt) {
            jTable1MouseWheelMoved(evt);
        }
    });
    jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            jTable1MouseClicked(evt);
        }
    });
    jTable1.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyReleased(java.awt.event.KeyEvent evt) {
            jTable1KeyReleased(evt);
        }
    });
    jScrollPane1.setViewportView(jTable1);

    proId.setBackground(new java.awt.Color(0, 0, 0));
    proId.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
    proId.setForeground(new java.awt.Color(255, 255, 255));
    proId.setHorizontalAlignment(javax.swing.JTextField.CENTER);
    proId.setText("ID NUMBER");
    proId.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            proIdActionPerformed(evt);
        }
    });

    jLabel8.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
    jLabel8.setForeground(new java.awt.Color(255, 255, 255));
    jLabel8.setText("Add Quantity:");
    jLabel8.setToolTipText("");

    proAdd.setBackground(new java.awt.Color(0, 0, 0));
    proAdd.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
    proAdd.setForeground(new java.awt.Color(255, 255, 255));
    proAdd.setHorizontalAlignment(javax.swing.JTextField.CENTER);
    proAdd.setText("Add Quantity");
    proAdd.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            proAddMouseClicked(evt);
        }
    });
    proAdd.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            proAddActionPerformed(evt);
        }
    });
    proAdd.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyTyped(java.awt.event.KeyEvent evt) {
            proAddKeyTyped(evt);
        }
    });

    jButton2.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
    jButton2.setText("DELETE");
    jButton2.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton2ActionPerformed(evt);
        }
    });

    javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
    jPanel4.setLayout(jPanel4Layout);
    jPanel4Layout.setHorizontalGroup(
        jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel4Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 533, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addComponent(jLabel8)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(proAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE))
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addComponent(proId, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2)))
            .addContainerGap())
    );
    jPanel4Layout.setVerticalGroup(
        jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
            .addContainerGap(23, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(proId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jButton2))
            .addGap(18, 18, 18)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel8)
                .addComponent(proAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(10, 10, 10))
    );

    lblDate.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
    lblDate.setForeground(new java.awt.Color(255, 255, 255));
    lblDate.setText("Date:");

    lblTime.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
    lblTime.setForeground(new java.awt.Color(255, 255, 255));
    lblTime.setText("Time:");

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblDate)
                                .addComponent(lblTime))
                            .addGap(0, 0, Short.MAX_VALUE)))))
            .addContainerGap())
    );
    jPanel1Layout.setVerticalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(lblDate)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(lblTime)))
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );

    pack();
    setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void proIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_proIdActionPerformed

    private void proAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proAddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_proAddActionPerformed

    private void dateChoserOnCommit(datechooser.events.CommitEvent evt) {//GEN-FIRST:event_dateChoserOnCommit
            DateFormat Fdate = dateChoser.getDateFormat();
        DateFormat r = new SimpleDateFormat("dd/MM/yy", Locale.getDefault());
        
        String s = String.valueOf(dateChoser.getText());
   
            proDate.setText(s);
            dateChoser.setEnabled(false);
            proDate.grabFocus();
            btnUp.show();
    }//GEN-LAST:event_dateChoserOnCommit

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
       fetch();
       proAdd.setEnabled(false);
    }//GEN-LAST:event_formWindowOpened

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        showDate2();
        btnUp.hide();
        showTime2();
    }//GEN-LAST:event_formWindowActivated

    private void btnUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpActionPerformed
          if (btnAdd.getText() == "UPDATE") {
           
              upImg();
        }
        else {
            img.setText("");
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        filename = f.getAbsolutePath();
        ImageIcon imageIcon = new ImageIcon(new ImageIcon (filename).getImage().getScaledInstance(img.getWidth(),img.getHeight(),Image.SCALE_DEFAULT));
        img.setIcon(imageIcon);
        try
        {
            File image = new File (filename);
            FileInputStream fis = new FileInputStream(image);
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            byte[] buf = new byte[1024];
            for (int readNum; (readNum = fis.read(buf)) !=-1;)
            {
                bos.write(buf , 0 ,readNum);

            }
            person_image = bos.toByteArray();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this, e.getMessage());
           
        }
        }
    }//GEN-LAST:event_btnUpActionPerformed

    private void proManuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proManuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_proManuActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        if (btnAdd.getText() == "UPDATE") {
            update();
        }
        else {
              create();
        }
        
      
    }//GEN-LAST:event_btnAddActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        proAdd.setEnabled(true);
        dateChoser.setEnabled(true);
        btnAdd.setText("UPDATE");
        btnUp.setText("UPDATE");
       btnUp.show();
        img.setText("");
        table();
    }//GEN-LAST:event_jTable1MouseClicked

    private void jTable1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable1KeyReleased
     final int key = evt.getKeyCode();
        
        if (key == KeyEvent.VK_UP || key == KeyEvent.VK_DOWN
                || key == KeyEvent.VK_LEFT || key == KeyEvent.VK_RIGHT)
        {
          table ();
           
        }
    }//GEN-LAST:event_jTable1KeyReleased

    private void jTable1MouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_jTable1MouseWheelMoved
        table();
    }//GEN-LAST:event_jTable1MouseWheelMoved

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      clear();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void proTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proTypeActionPerformed
        dateChoser.setEnabled(true);
    }//GEN-LAST:event_proTypeActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
            int opt = JOptionPane.showConfirmDialog(null, "Are you sure?","Delete", JOptionPane.YES_NO_OPTION);
      if(opt == 0)
       {
        try
        {
            Class.forName(driver);
            Connection con = DriverManager.getConnection(url, user, pass);
            String value = proId.getText();            
        
            String delsql = "DELETE FROM PRO where ID =" + value ;
            PreparedStatement pst = con.prepareStatement(delsql);
            pst.executeUpdate();
            
            JOptionPane.showMessageDialog(this, "Deleted!");
            clear();
            fetch();
            pst.close();
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(this, ex.getMessage()); 
        }
       }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void proAddKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_proAddKeyTyped
        
        char c = evt.getKeyChar();
        if(c == KeyEvent.VK_ENTER) {
            if (proId.getText().equals("")) {
                
                JOptionPane.showMessageDialog(null,"Can't be done");
            }
            else {
                addQuan();
            }
        }
    }//GEN-LAST:event_proAddKeyTyped

    private void proAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_proAddMouseClicked
        proAdd.setText("");
    }//GEN-LAST:event_proAddMouseClicked
     public void close()
      {
        this.setVisible(false);
        this.dispose();
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
            java.util.logging.Logger.getLogger(proForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(proForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(proForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(proForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new proForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnUp;
    private datechooser.beans.DateChooserCombo dateChoser;
    private javax.swing.JLabel img;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblTime;
    private javax.swing.JTextField proAdd;
    private javax.swing.JTextField proDate;
    private javax.swing.JTextField proId;
    private javax.swing.JTextField proManu;
    private javax.swing.JTextField proName;
    private javax.swing.JTextField proQuan;
    private javax.swing.JComboBox<String> proType;
    private javax.swing.JTextField proUnit;
    // End of variables declaration//GEN-END:variables
}
