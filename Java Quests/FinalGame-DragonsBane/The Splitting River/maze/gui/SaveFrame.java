package maze.gui;

import dkeep.logic.*;
import java.awt.EventQueue;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.filechooser.FileNameExtensionFilter;

public class SaveFrame extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6902563538245617627L;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args, Game gameIn) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					new SaveFrame(gameIn);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public SaveFrame(Game game) {
		initialize(game);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(Game toSave) {
		
		JFileChooser fc = new JFileChooser();
		FileNameExtensionFilter ser = new FileNameExtensionFilter(".txt", "txt");
		fc.addChoosableFileFilter(ser);
		fc.setFileFilter(ser);
		fc.setAcceptAllFileFilterUsed(false);

		
        int returnValue = fc.showSaveDialog(SaveFrame.this);
        
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File file = fc.getSelectedFile();
            File confirm = new File(file.getAbsolutePath()+".txt");

            if(confirm.exists()) {
				System.out.println("O FILE EXISTEEE");

				returnValue = JOptionPane.showConfirmDialog (null, "This file already exists, do you want to overwrite it?", "Loading a game", JOptionPane.OK_CANCEL_OPTION);
				
				if(returnValue == JOptionPane.CANCEL_OPTION)
					return;
				
            }

           save(file.getAbsolutePath()+".txt", toSave);
           
           fc.setSelectedFile(null);
        }
	}

	public void save (String path, Game toSave) {

	     try {	    	 
	         FileOutputStream fileSaved = new FileOutputStream(path);
	         ObjectOutputStream out = new ObjectOutputStream(fileSaved);

	         out.writeObject(toSave);
	         
	         out.close();
	         fileSaved.close();
	         
	      } catch (IOException i) {
	         i.printStackTrace();
	      }
	}
}
