/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package texteditor;
import java.util.*;
import java.io.*;
import javax.swing.*;
import java.io.File.*;
import java.awt.*;
import javax.swing.filechooser.FileNameExtensionFilter;

class FilePanel extends JPanel {

   private File file;
   private JTextArea textArea;
   private String name;
   private boolean saved;
   

   public FilePanel(File file) throws FileNotFoundException, IOException {
      this.file = file;
      setLayout(new BorderLayout());

      textArea = new JTextArea();
      JScrollPane scroll = new JScrollPane(textArea);
      add(scroll, BorderLayout.CENTER);

      textArea.read(new FileReader(file.getAbsolutePath()), null);
      name = file.getName();
      
      
   }
   
   public FilePanel()  {
    
       try
       {
      setLayout(new BorderLayout());
      
      textArea = new JTextArea();
      JScrollPane scroll = new JScrollPane(textArea);
      add(scroll, BorderLayout.CENTER);

      textArea.read(new FileReader(file.getAbsolutePath()), null);
      name = file.getName();
      
       
       }
       catch(Exception e)
       {
           System.out.println(e);
       }
      
   }

   public File getFile() {
      return file;
   }
   
   
   
     public boolean getSaved()
    {
        return this.saved;
    }

   public JTextArea getTextArea() {
      return textArea;
   }

   public String getName() {
      return name;
   }
   
   public void setName(String name) {
      this.name = name;
   }

}