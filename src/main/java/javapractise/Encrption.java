package javapractise;

import java.util.Base64;

public class Encrption {

	public static void main(String[] args) {
	

		String pass1 = "Meena123$";
        String encodedPass = Base64.getEncoder().encodeToString(pass1.getBytes());
        System.out.println(encodedPass);

        
        String encryptedPass = "VGVzdA==";
        byte[] decodePass = Base64.getDecoder().decode(encryptedPass);
        String decrPass = new String(decodePass);
        System.out.println(decrPass);

	}

}
