package javapractise;

import org.apache.commons.codec.binary.Base64;

public class Decoder {
	
	public static String decode(String cypherString) {
		byte[] plainText = Base64.decodeBase64(cypherString.getBytes());
		return new String(plainText);
	}
	
}
