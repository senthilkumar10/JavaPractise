package javapractise;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;

import javax.swing.JOptionPane;

public class PasswordEncryption {

	public static void main(String[] args) {
		
		Object[] optionList = {"OK","Copy To Clipboard"};
		
		String encPassword = Encoder.encodeNow();
		
		int result = JOptionPane.showOptionDialog(null, 
				"Encrypted Password:"+encPassword, 
				"Password Encryptor", 
				JOptionPane.YES_NO_OPTION, 
				JOptionPane.INFORMATION_MESSAGE, null, optionList, optionList[1]);
		
		if(result == JOptionPane.NO_OPTION) {
			StringSelection stringSelection = new StringSelection(encPassword);
			Clipboard clipBoard = Toolkit.getDefaultToolkit().getSystemClipboard();
			clipBoard.setContents(stringSelection, stringSelection);
		}
		
		
		//System.out.println(Decoder.decode("TWVlbmExMjMk"));

	}

}
