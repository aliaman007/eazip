package eazip;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JDialog;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.Font;
import javax.swing.KeyStroke;
import java.awt.event.KeyEvent;
import java.awt.event.InputEvent;
import javax.swing.ImageIcon;

public class Register extends JDialog {

	public Register() {
		getContentPane().setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 872, 31);
		getContentPane().add(menuBar);
		
		JMenu Encryption = new JMenu("Encryption");
		Encryption.setIcon(new ImageIcon("E:\\gif\\24x24\\Blue key.gif"));
		Encryption.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		menuBar.add(Encryption);
		
		JMenuItem mntmChooseFile = new JMenuItem("Open File");
		mntmChooseFile.setIcon(new ImageIcon("E:\\gif\\24x24\\Add.gif"));
		mntmChooseFile.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, InputEvent.CTRL_MASK));
		mntmChooseFile.setMnemonic('o');
		mntmChooseFile.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		Encryption.add(mntmChooseFile);
		
		JMenuItem mntmSteganography = new JMenuItem("Steganography");
		mntmSteganography.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_T, InputEvent.CTRL_MASK));
		mntmSteganography.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		mntmSteganography.setIcon(new ImageIcon("E:\\gif\\24x24\\Free bsd.gif"));
		Encryption.add(mntmSteganography);
		
		JMenu mnDecrypt = new JMenu("Decryption");
		mnDecrypt.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		mnDecrypt.setIcon(new ImageIcon("E:\\gif\\24x24\\Undo.gif"));
		menuBar.add(mnDecrypt);
		
		JMenuItem mntmSelectFile = new JMenuItem("Select File");
		mntmSelectFile.setIcon(new ImageIcon("E:\\gif\\24x24\\Add.gif"));
		mntmSelectFile.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D, InputEvent.CTRL_MASK));
		mnDecrypt.add(mntmSelectFile);
		
		JMenu mnCompress = new JMenu("Compress");
		mnCompress.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		menuBar.add(mnCompress);
		
		JMenuItem mntmSelectFile_1 = new JMenuItem("Select File");
		mntmSelectFile_1.setIcon(new ImageIcon("E:\\gif\\24x24\\Add.gif"));
		mnCompress.add(mntmSelectFile_1);
		
		JMenu mnDecompress = new JMenu("Decompress");
		mnDecompress.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		menuBar.add(mnDecompress);
		
		JMenuItem mntmSelectFile_2 = new JMenuItem("Select File");
		mntmSelectFile_2.setIcon(new ImageIcon("E:\\gif\\24x24\\Add.gif"));
		mnDecompress.add(mntmSelectFile_2);
		
		JMenu mnSettings = new JMenu("Settings");
		mnSettings.setIcon(new ImageIcon("E:\\gif\\24x24\\Application.gif"));
		mnSettings.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		menuBar.add(mnSettings);
		
		JMenuItem mntmFilesizelimit = new JMenuItem("FileSizeLimit");
		mnSettings.add(mntmFilesizelimit);
		
		JMenuItem mntmMailfrequency = new JMenuItem("MailFrequency");
		mnSettings.add(mntmMailfrequency);
		
		JMenuItem mntmEmail = new JMenuItem("Email");
		mnSettings.add(mntmEmail);
		
		JMenuItem mntmName = new JMenuItem("Name");
		mnSettings.add(mntmName);
		
		JMenuItem mntmProfilePicture = new JMenuItem("Profile Picture");
		mnSettings.add(mntmProfilePicture);
		
		JMenuItem menuItem = new JMenuItem("");
		menuBar.add(menuItem);
		
		JMenu menu = new JMenu("");
		menuBar.add(menu);
		Toolkit t=Toolkit.getDefaultToolkit();
		Dimension d=t.getScreenSize();
		int h=(int)d.getHeight();
		int w=(int)d.getWidth();
		setSize(1000,800);
		
		// TODO Auto-generated constructor stub
	}
}
