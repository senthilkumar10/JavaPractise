package jasyptencrytion;

import org.jasypt.util.text.BasicTextEncryptor;

public class EncryptDecrypt {

    private final String secretKey = "$&@2333wert%&*";
    BasicTextEncryptor basicTextEncryptor;

    public EncryptDecrypt(){
        basicTextEncryptor = new BasicTextEncryptor();
        basicTextEncryptor.setPassword(secretKey);
    }

    public String encryptPassword(String password){
        return basicTextEncryptor.encrypt(password);
    }

    public String decryptPassword(String encryptedPassword){
        return basicTextEncryptor.decrypt(encryptedPassword);
    }

}
