package com.AlphaSense.utilities;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;

/**
 * reads the properties file configuration.properties
 */
public class EmailReader {

    private static Properties properties;

    static {

        try {
            // what file to read
            String path = "emails.properties";
            // read the file into java, finds the file using the string path
            FileInputStream input = new FileInputStream(path);
            // properties --> class that store properties in key / value format
            properties = new Properties();
            // the values from the file input is loaded / fed in to the properties object
            properties.load(input);

            input.close();
        } catch (Exception e) {
            e.printStackTrace();

        }
    }

    public static String get(String keyName) {

        return properties.getProperty(keyName);
    }

    public static void setProperties(String keys, String values){
        try(OutputStream outputStream = new FileOutputStream("emails.properties")){
            properties.setProperty(keys, values);

            properties.store(outputStream, null);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
