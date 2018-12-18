package maze.gui;

import java.awt.EventQueue;

import dkeep.logic.*;
import maze.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;



public class LoadFrame extends JPanel {
	private  final long serialVersionUID = -5019040143645566302L;

	/**
	 * Launch the application.
	 */
    Figures f=new Figures();

	public  void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					new LoadFrame();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 * @throws IOException 
	 * @throws ClassNotFoundException 
	 */
	public LoadFrame() throws IOException, ClassNotFoundException {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 * @throws IOException 
	 * @throws ClassNotFoundException 
	 */
	private void initialize() throws IOException, ClassNotFoundException {

		JFileChooser fc = new JFileChooser();

		FileNameExtensionFilter ser = new FileNameExtensionFilter(".txt", "txt");
		fc.addChoosableFileFilter(ser);
		fc.setFileFilter(ser);
		fc.setAcceptAllFileFilterUsed(false);

        int returnValue = fc.showDialog(LoadFrame.this, null);

        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File file = fc.getSelectedFile();
            
            load(file.getAbsolutePath());
  
            fc.setSelectedFile(null);
        }
	}

	public void load (String path) throws IOException, ClassNotFoundException {
	      Game gameLoaded = null;
	      
	      try {
	         FileInputStream fileLoaded = new FileInputStream(path);
	         	         
	         ObjectInputStream objectLoaded = new ObjectInputStream(fileLoaded);
	         gameLoaded = (Game) objectLoaded.readObject();
	         
	         objectLoaded.close();
	         fileLoaded.close();
	         
	      } catch (FileNotFoundException i) {
	    	  try {
	 	         FileInputStream fileLoaded = new FileInputStream(path+".txt");
		     
	 	         ObjectInputStream objectLoaded = new ObjectInputStream(fileLoaded);
		         gameLoaded = (Game) objectLoaded.readObject();
		         
		         objectLoaded.close();
		         fileLoaded.close();

	    	  } catch (FileNotFoundException ii) {
	    		  i.printStackTrace();
	    		  JOptionPane.showMessageDialog(null, "File not found!", "Error", JOptionPane.ERROR_MESSAGE);
	    	  	return;
	    	  }
	      } catch (IOException i) {
	    	  i.printStackTrace();
	    	  JOptionPane.showMessageDialog(null, "Error loading the file!", "Error", JOptionPane.ERROR_MESSAGE);
	    	  return;
	      }
	      f.startNewGame(gameLoaded);
	      }
	}