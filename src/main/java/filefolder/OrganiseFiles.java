package filefolder;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author senthil
 */
public class OrganiseFiles {

    public static void main(String[] args) {

        List<String> results = new ArrayList<String>();


        File[] files = new File("/home/senthil/Downloads/Pics").listFiles();
        //If this pathname does not denote a directory, then listFiles() returns null.

       // Arrays.stream(files).filter(x->x.isFile()).forEach(System.out::println);

        for (File file : files) {
            if (file.isFile()) {
                results.add(file.getName());
            }
        }

        System.out.println(results);

    }
}
