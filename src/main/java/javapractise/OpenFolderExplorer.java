package javapractise;

import java.awt.*;
import java.io.File;
import java.io.IOException;

public class OpenFolderExplorer {

    public static void main(String[] args) throws IOException {
        Desktop.getDesktop().open(new File("/home/senthil/Documents"));
        Desktop.getDesktop().open(new File("/home/senthil/Documents/GCP"));
        System.out.println("File Opened Successfully");
    }
}
