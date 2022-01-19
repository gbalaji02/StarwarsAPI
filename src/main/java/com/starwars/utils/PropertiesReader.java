package com.starwars.utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesReader {

    private static final String PATH_NAME = System.getProperty("user.dir")+File.separator+"environment.properties";
    private static Properties prop;

    private static void initializeProperties() {
        prop = new Properties();
        try {
            File filePath = new File(PATH_NAME);
            FileReader reader = new FileReader(filePath);
            prop.load(reader);
        } catch (FileNotFoundException e) {
            System.err.println("File not found.\n"+e.getMessage());
        } catch (IOException e) {
            System.err.println("Exception occurred while reading the File.\n"+e.getMessage());
        }
    }

    public static String readProperty(String key) {
        if(prop == null) {
            initializeProperties();
        }
        return prop.getProperty(key);
    }

}

