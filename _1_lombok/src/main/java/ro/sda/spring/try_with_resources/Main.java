package ro.sda.spring.try_with_resources;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        FileOutputStream out = null;

        try {
            out = new FileOutputStream("path_to_file");
            //write logic to the file
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                out.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }


        try(FileOutputStream o = new FileOutputStream("path/to/file")) {

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
