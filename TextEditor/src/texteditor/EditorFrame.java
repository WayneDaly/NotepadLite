/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package texteditor;
import java.awt.*;
import java.io.*;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.imageio.ImageIO;
import javax.swing.UIManager;
import javax.swing.plaf.nimbus.NimbusLookAndFeel; //Or use com.sun.... if you are using JDK < 7





       
       
    



public class EditorFrame extends javax.swing.JFrame {

    
    private int increment = 1;
    
    
    
    public EditorFrame() {
        
        
        
        initComponents();
        
        
        try{
        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        fileChooser = new JFileChooser();
        UIManager.setLookAndFeel(NimbusLookAndFeel.class.getName());
        }
        catch(Exception e){System.out.println(e);}
        
        File file = new File("C:\\Users\\" + System.getProperty("user.name") + "\\Desktop");
        fileChooser.setCurrentDirectory(file);
        
         try
       {
           
             FilePanel p = new FilePanel();
             tabbedPane.setComponentAt(0, p);
             
            
             tabbedPane.setSelectedComponent(p); 
             tabbedPane.setTitleAt(tabbedPane.getSelectedIndex(), "File 1");
       }
       catch(Exception e)
       {
           System.out.println(e);
       }
        
        
        this.setExtendedState(Frame.MAXIMIZED_BOTH);
        
        FileNameExtensionFilter filter = new FileNameExtensionFilter("TEXT FILES", "txt", "text");
        fileChooser.setFileFilter(filter);
         ClosableTab.apply(tabbedPane, tabbedPane.getTabCount()-1);
       
        
       
    }

   
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fileChooser = new javax.swing.JFileChooser();
        jMenuItem1 = new javax.swing.JMenuItem();
        tabbedPane = new javax.swing.JTabbedPane();
        panel1 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        btnFile = new javax.swing.JMenu();
        btnNew = new javax.swing.JMenuItem();
        btnSave = new javax.swing.JMenuItem();
        btnSaveAs = new javax.swing.JMenuItem();
        btnOpen = new javax.swing.JMenuItem();
        btnExit = new javax.swing.JMenuItem();
        btnEdit = new javax.swing.JMenu();
        btnHelp = new javax.swing.JMenu();
        btnManual = new javax.swing.JMenuItem();
        btnCopyright = new javax.swing.JMenuItem();

        fileChooser.setDialogTitle("");

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Text Editor V.1");
        setIconImage(Toolkit.getDefaultToolkit().getImage(EditorFrame.class.getResource("icon.png")));

        tabbedPane.setBackground(new java.awt.Color(204, 204, 255));

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 695, Short.MAX_VALUE)
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 351, Short.MAX_VALUE)
        );

        tabbedPane.addTab("", panel1);

        jMenuBar1.setBackground(new java.awt.Color(153, 255, 204));

        btnFile.setText("File");
        btnFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFileActionPerformed(evt);
            }
        });

        btnNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/texteditor/new.png"))); // NOI18N
        btnNew.setText("New");
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });
        btnFile.add(btnNew);
        btnNew.getAccessibleContext().setAccessibleName("btnNew");

        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/texteditor/save.png"))); // NOI18N
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        btnFile.add(btnSave);

        btnSaveAs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/texteditor/saveas.png"))); // NOI18N
        btnSaveAs.setText("Save As");
        btnSaveAs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveAsActionPerformed(evt);
            }
        });
        btnFile.add(btnSaveAs);
        btnSaveAs.getAccessibleContext().setAccessibleName("btnSave");

        btnOpen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/texteditor/open.png"))); // NOI18N
        btnOpen.setText("Open");
        btnOpen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOpenActionPerformed(evt);
            }
        });
        btnFile.add(btnOpen);
        btnOpen.getAccessibleContext().setAccessibleName("btnOpen");

        btnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/texteditor/exit.png"))); // NOI18N
        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        btnFile.add(btnExit);
        btnExit.getAccessibleContext().setAccessibleName("btnExit");

        jMenuBar1.add(btnFile);

        btnEdit.setText("Edit");
        jMenuBar1.add(btnEdit);

        btnHelp.setText("Help");

        btnManual.setIcon(new javax.swing.ImageIcon(getClass().getResource("/texteditor/manual.png"))); // NOI18N
        btnManual.setText("Manual");
        btnHelp.add(btnManual);

        btnCopyright.setIcon(new javax.swing.ImageIcon(getClass().getResource("/texteditor/copyright.png"))); // NOI18N
        btnCopyright.setText("Copyright");
        btnCopyright.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCopyrightActionPerformed(evt);
            }
        });
        btnHelp.add(btnCopyright);

        jMenuBar1.add(btnHelp);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabbedPane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabbedPane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 379, Short.MAX_VALUE)
        );

        getAccessibleContext().setAccessibleName("frame1");
        getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFileActionPerformed
        
        
    }//GEN-LAST:event_btnFileActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnOpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpenActionPerformed
       
        
        int returnVal = fileChooser.showOpenDialog(this);
        
        
        
        
    if (returnVal == fileChooser.APPROVE_OPTION) 
    {
        File file = fileChooser.getSelectedFile();
        
        
        try {
              
             FilePanel p = new FilePanel(file);
             
          tabbedPane.add(p,p.getName());
          tabbedPane.setSelectedComponent(p);
          ClosableTab.apply(tabbedPane, tabbedPane.getTabCount()-1);
        
            
        } 
        catch (Exception e) 
        {
          
        }
    } 
    else {
        System.out.println("File access cancelled by user.");
         }
    }//GEN-LAST:event_btnOpenActionPerformed

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
       increment++; 
       
       try
       {
          FilePanel p = new FilePanel();
          p.setName("File " + increment);
          
         
          ///////
         
        
          //////
          tabbedPane.add(p);
          tabbedPane.setSelectedComponent(p);
          ClosableTab.apply(tabbedPane, tabbedPane.getTabCount()-1);
          
          
       }
       catch(Exception e)
       {
           System.out.println(e);
       }
    }//GEN-LAST:event_btnNewActionPerformed

    private void btnSaveAsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveAsActionPerformed
      
    
        
      int returnVal = fileChooser.showSaveDialog(this);
      
      if (returnVal == fileChooser.APPROVE_OPTION) 
      {
        File dir1 = fileChooser.getCurrentDirectory();
        String dir = dir1.getPath();
        String name = fileChooser.getSelectedFile().getName();
        //if it dont have .txt at end of name then add it
        if (!name.endsWith(".txt"))
                {
                    name = (name + ".txt");
                }
        
       
        
        try{
        File file = new File(dir,name);
        int res = 0;
        
        if(file.exists())
        {
            res = JOptionPane.showConfirmDialog(null, "This file already exists, Overwrite it?");
        }
        if(res == 0)
        {
        
        FileWriter fw = new FileWriter(file);
	BufferedWriter bw = new BufferedWriter(fw);
        
        
         FilePanel selectedComp = (FilePanel)tabbedPane.getSelectedComponent();
         
            if (selectedComp != null) {
               String text = selectedComp.getTextArea().getText();
               bw.write(text);
               
            } else {
               System.out.println("No component selected");
            }
            
	
        
	bw.close();
        tabbedPane.setTitleAt(tabbedPane.getSelectedIndex(), name);
         ClosableTab.apply(tabbedPane, tabbedPane.getTabCount()-1);
        }
       
        }
        catch(Exception e)
        {
            System.out.println("jhy");
        }
        
      }
     
    }//GEN-LAST:event_btnSaveAsActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
          
        
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnCopyrightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCopyrightActionPerformed
       
        JOptionPane.showMessageDialog(rootPane, "Developed by Wayne Daly - 2013");
    }//GEN-LAST:event_btnCopyrightActionPerformed

    
    
   
    
    
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
            java.util.logging.Logger.getLogger(EditorFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditorFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditorFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditorFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditorFrame().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem btnCopyright;
    private javax.swing.JMenu btnEdit;
    private javax.swing.JMenuItem btnExit;
    private javax.swing.JMenu btnFile;
    private javax.swing.JMenu btnHelp;
    private javax.swing.JMenuItem btnManual;
    private javax.swing.JMenuItem btnNew;
    private javax.swing.JMenuItem btnOpen;
    private javax.swing.JMenuItem btnSave;
    private javax.swing.JMenuItem btnSaveAs;
    private javax.swing.JFileChooser fileChooser;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel panel1;
    private javax.swing.JTabbedPane tabbedPane;
    // End of variables declaration//GEN-END:variables
}
