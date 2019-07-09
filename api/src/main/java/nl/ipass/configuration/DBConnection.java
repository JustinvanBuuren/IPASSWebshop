package nl.ipass.configuration;

import nl.ipass.definition.exception.WebAppException;

import java.sql.*;
import java.util.Random;

public class DBConnection {
    private static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    private static final String DB_URL = "jdbc:mysql://localhost:3306/ipass";
    private static final String USERNAME = "ipass";
    private static final String PASSWORD = "ipass";

    private static Connection conn;

    public static final String DB_ERROR = "Er is een fout opgetreden tijdens het verwerken van uw opdracht.";


    public static PreparedStatement prepareStatement(String query) {
        try {
            Class.forName(JDBC_DRIVER);

            conn = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);

            return conn.prepareStatement(query);
        } catch(ClassNotFoundException | SQLException e) {
            throw new WebAppException(DB_ERROR, e.getCause());
        }
    }

    public static void close() {
        try {
            conn.close();
        } catch(SQLException e) {
            throw new WebAppException(DB_ERROR, e.getCause());
        }
    }

    public static String generateRandomId() {
        String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                + "0123456789"
                + "abcdefghijklmnopqrstuvxyz";
        int stringSize = 256;
        StringBuilder sb = new StringBuilder(stringSize);

        for (int i = 0; i < stringSize; i++) {
            int index
                    = (int)(AlphaNumericString.length()
                    * Math.random());

            sb.append(AlphaNumericString
                    .charAt(index));
        }

        return sb.toString();
    }
}
