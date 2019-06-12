package javapractise;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Base64;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

public class AlternateEncryption {

	public static void main(String[] args) {

		//final String secretKey = "ssshhhhhhhhhhh!!!!";
		
		String secretKey =  keyGenerator();
	     
	    //String originalString = "howtodoinjava.com";
	    //String encryptedString = encrypt(originalString, secretKey) ;
	    //String decryptedString = decrypt(encryptedString, secretKey) ;
		String decryptedString = decrypt("RnF3gHixcv3d8V+eOA2nB9syiS8G6E7o4ozYYJsIQR4=", secretKey) ;
	     
	    //System.out.println(originalString);
	    //System.out.println(encryptedString);
	    System.out.println(decryptedString);

	}

	private static SecretKey secretKey;
    private static byte[] key;
    
    public static String keyGenerator() {
    	SecretKey secretKey = null;
    	try {
    		
    		KeyGenerator keyGen = KeyGenerator.getInstance("AES");
        	keyGen.init(256); // for example
        	secretKey = keyGen.generateKey();
        	return secretKey.toString();
    	} catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
    	return secretKey.toString();
    	
    }
    
    
 
    public static void setKey(String myKey)
    {
        MessageDigest sha = null;
        try {
            key = myKey.getBytes("UTF-8");
            sha = MessageDigest.getInstance("SHA-1");
            key = sha.digest(key);
            key = Arrays.copyOf(key, 16);
            secretKey = new SecretKeySpec(key, "AES");
        }
        catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }
 
    public static String encrypt(String strToEncrypt, String secret)
    {
        try
        {
            setKey(secret);
            Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
            cipher.init(Cipher.ENCRYPT_MODE, secretKey);
            return Base64.getEncoder().encodeToString(cipher.doFinal(strToEncrypt.getBytes("UTF-8")));
        }
        catch (Exception e)
        {
            System.out.println("Error while encrypting: " + e.toString());
        }
        return null;
    }
 
    public static String decrypt(String strToDecrypt, String secret)
    {
        try
        {
            setKey(secret);
            Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5PADDING");
            cipher.init(Cipher.DECRYPT_MODE, secretKey);
            return new String(cipher.doFinal(Base64.getDecoder().decode(strToDecrypt)));
        }
        catch (Exception e)
        {
            System.out.println("Error while decrypting: " + e.toString());
        }
        return null;
    }

	
	
	
	
	public static void encryptData(String plaintext) {
		   System.out.println("-------Encrypting data using AES algorithm-------");
		   try {
		       KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
		       keyGenerator.init(128);
		       SecretKey secretKey = keyGenerator.generateKey();
		       byte[] plaintTextByteArray = plaintext.getBytes("UTF8");
		       

		       Cipher cipher = Cipher.getInstance("AES");
		       cipher.init(Cipher.ENCRYPT_MODE, secretKey);
		       byte[] cipherText = cipher.doFinal(plaintTextByteArray);

		       System.out.println("Original data: " + plaintext);
		       System.out.println("Encrypted data:");
		     		       		       
		       for (int i = 0; i < cipherText.length; i++) {
		           System.out.print(cipherText[i]);

		       }
		   }
		       catch(Exception ex){
		           ex.printStackTrace();
		       }
		   }
	
	
	public static void decryptData(String encryptString) {
		   System.out.println("-------Decrypting data using AES algorithm-------");
		   try {
			   KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
		       keyGenerator.init(128);
		       SecretKey secretKey = keyGenerator.generateKey();
		       byte[] plaintTextByteArray = encryptString.getBytes("UTF8");
		       
			   Cipher cipher = Cipher.getInstance("AES");
		       cipher.init(Cipher.DECRYPT_MODE, secretKey);
			   String plainText = new String(cipher.doFinal(plaintTextByteArray), "UTF-8");

		       byte[] cipherText = cipher.doFinal(plaintTextByteArray);

		       
		       System.out.println("Decrypted data:"+cipherText);
		     		       		       
		       for (int i = 0; i < cipherText.length; i++) {
		           System.out.print(cipherText[i]);

		       }
		   }
		       catch(Exception ex){
		           ex.printStackTrace();
		       }
		   }
	
}
