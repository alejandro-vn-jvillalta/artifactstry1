package com.mycompany.app;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;

public class FileHandler {
    public void writeToFile(String content, String path) throws IOException {
        File file = new File(path);
        FileUtils.writeStringToFile(file, content, "UTF-8");
        System.out.println("File written: " + path);
    }

    public String readFromFile(String path) throws IOException {
        File file = new File(path);
        return FileUtils.readFileToString(file, "UTF-8");
    }
}
