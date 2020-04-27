package jasyptencrytion;

public class TestEncryptDecrypt {

    public static void main(String[] args) {
        EncryptDecrypt encryptDecrypt = new EncryptDecrypt();

        String password = "TestingPasswordEncryptionAndDecryption";

        String encryptedPassword = encryptDecrypt.encryptPassword(password);

        System.out.println(encryptedPassword);

        System.out.println(encryptDecrypt.decryptPassword(encryptedPassword));

    }


}
