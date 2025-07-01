package com.hexaware.tbs.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class DBPropertyUtil {

    public static String getConnectionString(String propertyFileName) {
        Properties props = new Properties();
        String connectionUrl = null;

        try (FileInputStream fis = new FileInputStream(propertyFileName)) {
            props.load(fis);

            String host = props.getProperty("host");
            String port = props.getProperty("port");
            String dbname = props.getProperty("dbname");
            String user = props.getProperty("user");
            String password = props.getProperty("password");

            connectionUrl = "jdbc:mysql://" + host + ":" + port + "/" + dbname + "?useSSL=false&allowPublicKeyRetrieval=true";
            connectionUrl += "&user=" + user + "&password=" + password;

        } catch (IOException e) {
            e.printStackTrace();
        }

        return connectionUrl;
    }
}
